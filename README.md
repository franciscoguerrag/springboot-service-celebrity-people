# springboot-service-celebrity-people

Spring Boot application for fetching data of People and their Acquaintances, also allows People creations and Acquaintances creations.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine.

### Prerequisites

For building and running the application you need:

Java 8 ++
Maven 3

# Database

It uses a H2 in memory database (for now), can be changed easily in the `application.properties` for any other database.

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.arc.sbtest.SBtemplateApplication` class from your IDE.

- Download the zip or clone the Git repository.
- Unzip the zip file (if you downloaded one)
- Open Command Prompt and Change directory (cd) to folder containing pom.xml
- Open Eclipse 
   - File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
   - Select the project
- Choose the Spring Boot Application file (search for @SpringBootApplication)
- Right Click on the file and Run as Java Application

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

The server port for the application by default is 8001
You can change it in Application.properties.

Note : If you change this port you need to change the port in the service that invoke this one 

## Open file IMPORT.SQL on Resources

by Default
 - Has insertions in two tables (person and acquaintances)
 - 7 people
 - Everybody knows person with ID 0
 - Person 0 doesn´t know anybody.
 - Person 0 is the celebrity
 
You can insert new registers or delete them.

## Note 

Considering "In a team of n people, a celebrity is known by everyone but he/she doesn't know anybody".
it is important that the data accomplish with the statement otherwise the celebrity will not be found.

### URLs

|  URL |  Method | Response |
|----------|--------------|--------------|
|`http://localhost:8001/list`                           | GET | People List|
|`http://localhost:8001/createPerson`                           | GET | Person|
|`http://localhost:8001/createAcquaintance`                           | GET | Acquaintance|
|`http://localhost:8001/item/{id}`                           | POST | Person|


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