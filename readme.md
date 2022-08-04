## What is it?
This  code is an Spring Boot web application 


Tested with

* Docker 20.10.12
* Java 11
* Spring Boot 2.7.2
* Maven


## How to run this?
```bash
$ git  clone marzieh-vahid/tosan-docker-challange
$ cd docker-challenge
$ mvn clean package
$ java -jar target/docker-challenge-0.0.1-SNAPSHOT.jar

  access http://localhost:8080

//dockerize

// create a docker image
$ sudo docker build -t spring-boot:1.0 .
// run it
$ sudo docker run -d -p 8080:8080 -t spring-boot:1.0

  access http://localhost:8080
  access http://localhost:8080/helloworld
  access http://localhost:8080/say/helloworld?name=ali
  access http://localhost:8080/author
  
  
```