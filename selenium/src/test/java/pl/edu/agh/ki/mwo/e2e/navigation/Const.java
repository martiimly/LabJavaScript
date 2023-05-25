package pl.edu.agh.ki.mwo.e2e.navigation;

import org.apache.commons.lang3.tuple.Triple;

public class Const {

    public final static Triple USER_MWO = Triple.of("mwo", "mwo@gmail.com", "mwo123");
    public final static Triple USER_MANIEK = Triple.of("Maniek", "maniek@gmail.com", "maniek123");
    public final static Triple USER_DIEGO = Triple.of("diego", "diego@gmail.com", "diego123");
    public final static Triple USER_NONEXISTENT = Triple.of("Piotr", "piotr@gmail.com", "piotr123");

    public final static String WORLD_TAG_NAME = "world";
    public final static int WORLD_TAG_NBR = 3;

    public final static String CHROME_DRIVER = "chrome";

    public final static String BASE_URL = "http://localhost:4200";
    public final static String HOME_URL = "/";
    public final static String LOGIN_URL = "/login";
    public final static String REGISTER_URL = "/register";
    public final static String SETTINGS_URL = "/settings";
    public final static String EDITOR_URL = "/editor";
    public final static String PROFILE_URL = "/profile/";
}