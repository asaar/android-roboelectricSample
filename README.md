# android-roboelectricSample
Sample Android application with Roboelectric unit tests with SeaLights integration.

PREREQUISITES:
1. Access to the SeaLights dashboard
2. An agent token file (named sltoken.txt by default)
3. Access to Maven Central repository. Alternatively, SeaLights Gradle Plugin version 3.1.657 in your local repository

CONFIGURATION:
1. Make required changes in the sl-config.json file according to the documentation here: https://sealights.atlassian.net/wiki/spaces/SUP/pages/1058177036/Scanning+Builds+and+Tests+using+SeaLights+Gradle+plugin+JSON+file
2. Provide execution permission for the cmds.sh script

RUN:
1. Run the cmds.sh script. This will report Unit Tests to the dashboard.
