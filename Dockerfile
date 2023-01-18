FROM  openjdk:8
EXPOSE 8080
ADD target/zenquotesapi-0.0.1-SNAPSHOT.jar zenquotesapi-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/zenquotesapi-0.0.1-SNAPSHOT.jar"]
