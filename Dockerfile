FROM mayan31370/openjdk-alpine-with-chinese-timezone:8-jre
EXPOSE 8080
ENTRYPOINT ["java","-jar","-Dserver.port=8080","/app.jar"]
ADD target/*.jar app.jar
