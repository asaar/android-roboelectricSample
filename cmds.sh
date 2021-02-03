echo "Downloading Sealights Agents..."
wget -nv https://agents.sealights.co/sealights-java/sealights-java-latest.zip
unzip -o sealights-java-latest.zip
echo "Sealights agent version used is:" `cat sealights-java-version.txt`
java -jar sl-build-scanner.jar -gradle -configfile sl-config.json -workspacepath .
echo "Running Gradle unit tests..."
gradle clean test --continue
echo "Restoring build.gradle to original version..."
java -jar sl-build-scanner.jar -restoreGradle -workspacepath .
echo "Cleaning up agent files..."
rm -f sl-build-scanner.jar sl-test-listener.jar sealights-java-version.txt sealights-java-latest.zip