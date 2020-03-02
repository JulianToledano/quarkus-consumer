# Quarkus REST Client
Hi! :wave::wave:

This microservice consumes another microservice to retrieve persons from a database.

# Requirements

You'll need [this microservice](https://github.com/JulianToledano/quarkus-hibernate) up and running with its database in order to be able to use this one.

# Functioning

There is just one endpoint:
 * `/consume/retrieve/{name}`

Here are some request that can be used to verify the application:
 * `curl -v http://localhost:8080/consume/retrieve/Sarah`