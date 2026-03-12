#!/bin/sh
# Gradle Wrapper Shell Script
APP_NAME="Gradle"
APP_BASE_NAME=`basename "$0"`
APP_HOME=`dirname "$0"`
CLASSPATH=$APP_HOME/gradle/wrapper/gradle-wrapper.jar
exec "$JAVACMD" -classpath "$CLASSPATH" org.gradle.wrapper.GradleWrapperMain "$@"
