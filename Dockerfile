FROM openjdk:11
VOLUME /tmp
EXPOSE 8761
ADD ./target/bank-eureka-server-0.0.1-SNAPSHOT.jar bank-eureka-server.jar
ENTRYPOINT ["java", "-jar", "/bank-eureka-server.jar"]