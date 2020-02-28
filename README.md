# springboot-service-celebrity-people

Service celebrity people for fetching data to find celebrities.


The project you have configured a H2 database in memory, and there are 2 tables, one with the people and the other with the people known for each

## Note 

Considering "In a team of n people, a celebrity is known by everyone but he/she doesn't know anybody".
it is important that the data accomplish with the statement otherwise the celebrity will not be found.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine.

### Prerequisites

Java 8 ++

Spring boot

### Installing

Clone the repository with GITHUB

Open the project with your IDE

## Open file IMPORT.SQL on Resources

by Default
 - Has insertions in two tables (person and acquaintances)
 - 7 people
 - Everybody knows person with ID 0
 - Person 0 doesn´t know anybody.
 - Person 0 is the celebrity
 
You can insert new registers or delete them.

Considering "In a team of n people, a celebrity is known by everyone but he/she doesn't know anybody".
it is important that the data accomplish with the statement otherwise the celebrity will not be found.

## Deployment

Select the project and select Run as SpringBootApp.

The server port for the application by default is 8001
You can change it in Application.properties.

Note : If you change this port you need to change the port in the service that invoke this one 

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Francisco Guerra** 

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc

