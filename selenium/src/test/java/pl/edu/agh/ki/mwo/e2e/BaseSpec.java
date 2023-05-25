package pl.edu.agh.ki.mwo.e2e;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseSpec {

    @BeforeAll
    void baseReset() throws URISyntaxException {
        URL scriptFile = getClass().getClassLoader().getResource("./scripts/test_script.bat");
        URL dbInitialDataDir = getClass().getClassLoader().getResource("./db-initial");
        if (scriptFile == null) {
            throw new IllegalArgumentException("file not found!");
        } else {
            assert dbInitialDataDir != null;
            File path = Paths.get(scriptFile.toURI()).toFile();

            try {
                ProcessBuilder pb = new ProcessBuilder(String.valueOf(path));
                pb.directory(new File(dbInitialDataDir.getPath()));
                Process process = pb.start();
                process.waitFor();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
