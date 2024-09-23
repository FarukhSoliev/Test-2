#!/bin/bash

#Pipelines
#Task 1
ps aux --sort=-%cpu | grep -v 'grep' | awk '{print $1, $2, $3, $11}' > system_monitoring.txt
#Task 2
diff <(find dir1 -type f | sort) <(find dir2 -type f | sort) > directory_comparison.txt
#Task 3
find dir -type f -name "*.txt" | xargs wc -l | tail -n 1
#Task 4
df -h | sort -k 3 -hr | awk '{print $1,$2,$3}'
#Task 5
cat *.log | grep "keyWord" | awk '{print $0}' | sort > logs.txt && tar -czf filtered_logs.tar.gz logs.txt
