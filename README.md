# springboot-service-celebrity-people

Spring Boot application for fetching data of People and their Acquaintances, also allows People creations and Acquaintances creations.

**This microservice is just for fetching data, you only need deploy it locally**


## Diagram

![alt text](https://github.com/franciscoguerrag/springboot-service-celebrity-people/blob/master/celebrityDiagram.png)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine.

### Prerequisites

For building and running the application you need:

Java 8 ++
Maven 3

# Database

It uses a H2 in memory database (for now), can be changed easily in the `application.properties` for any other database.

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.springboot.app.celebrityPeople.SpringbootServiceCelebrityPeopleApplication` class from your IDE.

- Select the project and run as Spring Boot APP.

or

- Download the zip or clone the Git repository.
- Unzip the zip file (if you downloaded one)
- Open Command Prompt and Change directory (cd) to folder containing pom.xml
- Open Eclipse 
   - File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
   - Select the project
- Choose the Spring Boot Application file (search for @SpringBootApplication)
- Right Click on the file and Run as Java Application

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) 

The server port for the application by default is 8001
You can change it in Application.properties.

Note : If you change this port you need to change the port in the service that invoke this one 

## Open file IMPORT.SQL on Resources

by Default
 - It contains insertions in two tables (person and acquaintances)
 - 7 people
 - Everybody knows person with ID 3
 - Person 3 doesn´t know anybody.
 - Person 3 is the celebrity
 
You can insert new registers or delete them.

## Note 

Considering "In a team of n people, a celebrity is known by everyone but he/she doesn't know anybody".
it is important that the data accomplish with the statement otherwise the celebrity will not be found.

### URLs

|  URL |  Method | Request |
|----------|--------------|--------------|
|`http://localhost:8001/list`                           | GET | |
|`http://localhost:8001/createPerson`                           | POST |  {"name": "name"} |
|`http://localhost:8001/createAcquaintance`                           | POST | {"parent_id": "parent_id", "related_id": "related_id"} |
|`http://localhost:8001/item/{id}`                           | GET | |


## Built With

* 	[Maven](https://maven.apache.org/) - Dependency Management
* 	[JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java™ Platform, Standard Edition Development Kit 
* 	[Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications
* 	[git](https://git-scm.com/) - Free and Open-Source distributed version control system 
* 	[H2](https://www.h2database.com/) - Database

## External Tools Used

* [Postman](https://www.getpostman.com/) - API Development Environment (Testing Docmentation)

## Authors

* **Francisco Guerra** 