#!/bin/sh
echo "Starting..."
java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 \
     -jar /usr/local/guava/guava-0.0.1.jar
