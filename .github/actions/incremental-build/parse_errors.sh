#!/bin/bash
#
# Licensed to the Apache Software Foundation (ASF) under one or more
# contributor license agreements.  See the NOTICE file distributed with
# this work for additional information regarding copyright ownership.
# The ASF licenses this file to You under the Apache License, Version 2.0
# (the "License"); you may not use this file except in compliance with
# the License.  You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

LOG_FILE=$1

temp=$(cat $log | grep "ERROR\].org" | grep "Time elapsed" | awk -F ' '  ' {print $3}' | sed 's/^/| /' | sed 's/$/ |/')

if [[ ! -z "$temp" ]] ; then
  echo -e "| Failed Test |\n| --- |" > "$GITHUB_STEP_SUMMARY"
  echo "$temp"  >> "$GITHUB_STEP_SUMMARY"
fi

