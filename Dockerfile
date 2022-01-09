FROM gradle:7.3.3-jdk17-alpine AS build

WORKDIR /App

COPY . ./

ENV PATH /app/jdk/.bin:$PATH

COPY build.gradle ./

CMD ["./gradlew","bootRun"]
EXPOSE 8080