cd /home/OP_Db_Scripts
PROPERTYLOCATION="-DpropertyLocation=file:/home/properties/app.properties"
export PROPERTYLOCATION 
java  $PROPERTYLOCATION -classpath /home/OP_Db_Scripts:/home/OP_Db_Scripts:/home/Sourcelead_Db_Scripts/lib/*  com.bis.offerprocessing.db.OPDataBaseInstallation