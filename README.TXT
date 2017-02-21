remotely connect to a hive server from a local machine(eclipse). and run J-Unit test cases.


you might have to copy some jarfiles from the cloudera cluster for it to connect.


for code to run on the cluster, i used this command:
cd /usr/lib/hive/lib
java -cp /home/cloudera/scripts/pphivequery.jar:hive-jdbc.jar:libthrift-0.9.3.jar:hive-service.jar:httpclient-4.2.5.jar:commons-httpclient-3.0.1.jar:httpcore-4.2.5.jar:commons-logging-1.1.3.jar:log4j-1.2.16.jar:../../hadoop/hadoop-common.jar:hive-exec.jar:hive-metastore.jar:/home/cloudera/scripts/junit-4.11.jar:/home/cloudera/scripts/hamcrest-all-1.3.jar:/usr/lib/hadoop/client/slf4j-api-1.7.5.jar  com.eva.sparkdemo.TestRunner


reference :
https://github.com/cyanfr/dbvis_to_hortonworks_hiveserver2/wiki/How-I-Connected-DBVisualizer-9.2.2-on-Windows-to-Hortonwork-HiveServer2

