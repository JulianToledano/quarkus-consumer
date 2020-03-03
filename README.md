# Quarkus REST Client
Hi! :wave::wave:

This microservice consumes another microservice to retrieve persons from a database.

# Requirements

You'll need [this microservice](https://github.com/JulianToledano/quarkus-hibernate) up and running with its database in order to be able to use this one.

# Quarkus

This project uses rest client in order to consume another resources. The `pom` dependencies should look like this:

```xml
<dependencies>
    <dependency>
      <groupId>io.quarkus</groupId>
      <artifactId>quarkus-resteasy</artifactId>
    </dependency>
    <dependency>
      <groupId>io.quarkus</groupId>
      <artifactId>quarkus-junit5</artifactId>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>io.rest-assured</groupId>
      <artifactId>rest-assured</artifactId>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>io.quarkus</groupId>
      <artifactId>quarkus-resteasy-jsonb</artifactId>
    </dependency>
    <dependency>
      <groupId>io.quarkus</groupId>
      <artifactId>quarkus-rest-client</artifactId>
    </dependency>
  </dependencies>
```

# Functioning

There are two endpoints:
 * `/consume/retrieve/{name}`, GET method.
 * `/consume/create/person`, POST method.

 The first one retrieve a person with a given name and the second persist a person in the database. The second method needs an `application/json` with body:
 ```json
"name": "name",
"surname": "surname",
"age": 12
 ```

 To check if everithing is working as expected try the next curl commands:
  * GET - `curl -v http://localhost:8080/consume/retrieve/John`
  * POST - `curl -v -H "Content-Type: application/json" --data '{"name": "Queen", "surname": "Elizabeth", "age": 30}' -X POST http://localhost:8080/consume/create/person`

  **NOTE**: this service needs a postgres database and [`quarkus-hibernate`](https://github.com/JulianToledano/quarkus-hibernate) project up and running in order to work properly.

  By By!! :wave::wave: