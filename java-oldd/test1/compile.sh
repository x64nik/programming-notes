#!/usr/bin/bash

echo "-- :) compiler running :) -- "
_SILENT_JAVA_OPTIONS="$_JAVA_OPTIONS"
unset _JAVA_OPTIONS
alias java='java "$_SILENT_JAVA_OPTIONS"'
echo ""
javac Check.java
echo ""
java Check
