#!/bin/bash

mvn release:prepare -U -DautoVersionSubmodules=true -Pintegration-tests,quality -DskipTests=true -Dmaven.javadoc.skip=true  -Darguments="-DskipTests=true -Dmaven.javadoc.skip=true"
mvn release:perform -Pintegration-tests,quality -DskipTests=true -Dmaven.javadoc.skip=true -Darguments="-DskipTests=true -Dmaven.javadoc.skip=true"
