FROM openjdk:17

COPY target/mohitsirr.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "mohitsirr.jar"]