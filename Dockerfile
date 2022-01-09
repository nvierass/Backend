FROM openjdk:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
ADD target/core-0.1.0-RELEASE.jar target/app.jar
COPY ${JAR_FILE} /app.jar
RUN bash -c 'touch target/app.jar'
ENTRYPOINT ["java","-jar","target/app.jar"]

