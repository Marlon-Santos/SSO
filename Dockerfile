FROM amazoncorretto:17-alpine

RUN addgroup -S app && adduser -S app -G app
USER app:app

ARG JAR_FILE=build/libs/*SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

EXPOSE $PORT
ENTRYPOINT ["java","-jar","/app.jar"]