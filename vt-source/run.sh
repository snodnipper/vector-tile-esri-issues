#!/bin/bash

echo "Junk cleaning up the temp directory"
rm -Rf ./temp

echo "Lets go..."
command -v protoc >/dev/null 2>&1 || { echo >&2 "I require protoc but it's not installed.  On macOS with brew, try 'brew install protobuf' and try again.  Aborting"; exit 1; }
command -v wget >/dev/null 2>&1 || { echo >&2 "I require the 'wget' command.  Aborting"; exit 1; }
command -v gradle >/dev/null 2>&1 || { echo >&2 "I require the 'gradle' command.  Try 'curl -s https://get.sdkman.io | bash ; sdk install gradle 3.3'.  Aborting"; exit 1; }

mkdir temp
cd temp

# Get the protobuf spec from Mapbox
wget https://raw.githubusercontent.com/mapbox/vector-tile-spec/master/2.1/vector_tile.proto

# Add syntax definition to spec
echo 'syntax = "proto2";' | cat - vector_tile.proto > temp && mv temp vector_tile.proto
sed -i.tmp 's/LITE_RUNTIME/SPEED/' vector_tile.proto; rm vector_tile.proto.tmp

# Use SPEED optimisation rather than LITE_RUNTIME to assist with debugging output


# Create some Java code for the PBF
mkdir -p src/main/java
protoc --java_out=src/main/java vector_tile.proto

# Create a new Java Project
gradle init --type java-application

# Add the Java protobuf library
awk '/dependencies \{/ { print; print "    compile '\''com.google.protobuf:protobuf-java:3.1.0'\''"; next }1' build.gradle > build.gradle.tmp ; mv build.gradle.tmp build.gradle
awk '/dependencies \{/ { print; print "    compile '\''org.slf4j:slf4j-api:1.7.22'\''"; next }1' build.gradle > build.gradle.tmp ; mv build.gradle.tmp build.gradle

# Add demo support files
mkdir -p src/main/java/uk/os/util
cp ../support/CompressUtil.java src/main/java/uk/os/util
cp ../support/ResourceUtil.java src/main/java/uk/os/util

# Add demo vector tiles
mkdir -p src/main/resources
cp ../demo-tiles/ESRI.pbf src/main/resources/
cp ../demo-tiles/STANDARD.pbf src/main/resources/

# Add demo code
cp ../demo-code/* src/main/java/
