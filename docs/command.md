kafka  

启动zookeeper zkServer
启动kafka .\bin\windows\kafka-server-start.bat .\config\server.properties

	创建主题：.\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic 主题名称1
	查看主题：.\kafka-topics.bat --zookeeper localhost:2181 --list
	生产者生产消息：.\kafka-console-producer.bat --broker-list localhost:9092 --topic 主题名称1
	消费者消费消息：.\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic 主题名称1 --from-beginning


maven
 
 安裝本地jar包 mvn install:install-file -Dfile=D:\IDEA\ojdbc6.jar -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=6 -Dpackaging=jar

jarjar.jar
java -jar .\jarjar.jar process .\rule.txt .\jna.jar .\jna4.jar


sybase数据库

/home/sybase/ASE-15_0/install RUN_SUSE114
