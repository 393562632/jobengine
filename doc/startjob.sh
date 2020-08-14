#!/bin/bash

nohup java -jar esurvey-0.0.1-SNAPSHOT.jar --server.port=8989  --spring.profiles.active=dev > /dev/null &
