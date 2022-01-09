FROM 7.3.3-jdk17-alpine

WORKDIR /App

COPY . ./

ADD build/libs/belfastjug-sample-01-0.0.1-SNAPSHOT.jar /app/belfastjug-sample-01.jar

COPY build.gradle

CMD ["./gradlew","bootRun"]
EXPOSE 8080