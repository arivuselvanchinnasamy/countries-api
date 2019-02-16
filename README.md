# countries-api
RESTful API to retrieve continents, countries information

## Technologies Used
 1. Java 1.8.x
 2. Maven 3.x.x
 3. MySQL 5.x.x
 4. Spring Boot
 5. JOOQ ( Java Object Oriented Querying)
 
## Steps to Setup
1. Clone the application

	git clone https://github.com/arivuselvanchinnasamy/countries-api.git

2. Create Mysql database

	create database countries
	
3. Change mysql username and password as per your installation

	open src/main/resources/application.properties

	change spring.datasource.username and spring.datasource.password as per your mysql installation

4. Build and run the app using maven

	mvn package
	java -jar target/countries-api-0.0.1-SNAPSHOT.jar

	Alternatively, you can run the app without packaging it using -
	mvn spring-boot:run

	The app will start running at http://localhost:8081

## REST APIs

The app defines following APIs.
    
    GET /api/v1/continents
    
    GET /api/v1/continents/{code} 
      For ex:  /api/v1/continents/AF
    
    GET /api/v1/countries
    
    GET /api/v1/countries/{code}
      For Ex: /api/v1/countries/IN
