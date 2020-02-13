FROM ledangtuanbk/openjdk:8
VOLUME /data
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080