<h1> VotingChamp </h1>

A new way to vote online.

<h3> WebApp </h3>

* Java 8
* Gradle 
* Spring MVC
* MySQL 5.5

Create a database ```voting_db``` in database and modify ```application.properties``` file as per your credentials
To run just install gradle and execute ``` gradle jettyRun ```


Currently Implemented Services

* Service used for casting Vote
    * Route  ```/vote```
    * Type POST
    * Expected Input JSON {"candidateId":"someDataHere"}
    * Expected Output JSON {"id":3,"candidateId":"someDataHere"}
* Service used for checking if has casted Vote
    * Route  ```/hasVoted```
    * Type POST
    * Expected Input JSON {"identifier":"42201"}
    * Expected Output JSON {"id":1,"identifier":"42201","hasVoted":false}
* Service used for marking citizen's vote as casted
    * Route  ```/hasVoted```
    * Type POST
    * Expected Input JSON {"identifier":"42201"}
    * Expected Output JSON {"id":1,"identifier":"42201","hasVoted":true}
