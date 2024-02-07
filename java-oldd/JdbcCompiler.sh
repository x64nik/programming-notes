#!/usr/bin/bash

echo "-- :) JDBC compiler running :) -- "
_SILENT_JAVA_OPTIONS="$_JAVA_OPTIONS"
unset _JAVA_OPTIONS
alias java='java "$_SILENT_JAVA_OPTIONS"'
echo ""
javac MysqlCon.java
java -cp .:mysql-connector-java-5.1.4-bin.jar MysqlCon
