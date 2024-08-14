FROM openjdk:17

LABEL authors="tendaimupezeni"

EXPOSE 8080

ADD target/K8SpringDocker.jar K8SpringDocker.jar

ENTRYPOINT ["java", "-jar", "K8SpringDocker.jar"]