FROM openjdk:8-alpine

COPY target/uberjar/chatapp.jar /chatapp/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/chatapp/app.jar"]
