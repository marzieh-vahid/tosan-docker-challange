## What is it?
This  code is an Spring Boot web application 


Tested with

* Docker 20.10.12
* Java 11
* Spring Boot 2.7.2
* Maven
* kind v0.15.0 go1.19 windows/amd64
* kubectl


## How to run this?
```bash
$ git  clone marzieh-vahid/tosan-docker-challange
$ cd docker-challenge
$ mvn clean package
$ java -jar target/docker-challenge-0.0.1-SNAPSHOT.jar

  access http://localhost:8080

//dockerize

// create a docker image
$ sudo docker build -t marziehvahid/docker-challenge .
// run it
$ sudo docker run -d -p 8080:8080 -t marziehvahid/docker-challenge

  access http://localhost:8080
  access http://localhost:8080/helloworld
  access http://localhost:8080/say/helloworld?name=ali
  access http://localhost:8080/author
  
  //deploy on kubernetes
  //push to docker hub repository
  $ sudo docker push marziehvahid/docker-challenge
  //create kind cluster
  $ sudo kind create cluster --name myCluster
  $ sudo kind get clusters
  $ sudo kubectl cluster-info
  $ sudo kubectl get all 
  $ sudo kubectl get nodes
  //apply manifest files
  $ sudo kubectl apply -f ./kubernetes/challenge-pod.yml
  $ sudo kubectl get pods
  $ sudo kubectl apply -f ./kubernetes/challenge-service.yml
  $ sudo kubectl apply -f ./kubernetes/challenge-deployment.yml
  $ sudo kubectl get deployment
  $ sudo kubectl describe deployment
  $ sudo kubectl get service

  
  
```