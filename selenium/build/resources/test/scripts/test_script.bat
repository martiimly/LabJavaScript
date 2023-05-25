@echo off
mongo conduit --eval "db.dropDatabase()"
mongorestore --nsFrom=conduit.* --nsTo=conduit.* .\db-initial-data\