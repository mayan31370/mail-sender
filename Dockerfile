FROM mayan31370/openjdk-alpine-with-chinese-timezone:8-jre
EXPOSE 8080
ENV EMAIL_USERNAME example@example.com
ENV EMAIL_PASSWORD 123456
ENV EMAIL_HOST example.com
ENV EMAIL_PORT 465
ENTRYPOINT ["java","-jar","-Dserver.port=8080","/app.jar"]
ADD target/*.jar app.jar
