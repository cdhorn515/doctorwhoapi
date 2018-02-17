# Doctor :question: API 

I decided to build an API using **Java 8** backed by a **Mongo DB** to replace san API I was using that was no longer returning a response.  

I'm using IntelliJ IDEA with the Mongo Explorer plugin. 

The following dependencies need to be included in the Maven pom.xml file:

```
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-mongodb</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.mongodb</groupId>
			<artifactId>mongo-java-driver</artifactId>
			<version>3.6.3</version>
		</dependency>

```

The application.properties file should include the following:

```
spring.data.mongodb.uri=mongodb://localhost:27017/[your-database-name]
```