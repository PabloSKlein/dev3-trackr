#FROM gradle:6.6.1-jdk14 as cache
#RUN mkdir -p /home/gradle/cache_home
#ENV GRADLE_USER_HOME /home/gradle/cache_home
#COPY build.gradle.kts /home/gradle/src/
#WORKDIR /home/gradle/src
#RUN gradle clean build -i --stacktrace
#
#FROM gradle:5.6.4-jdk11 as builder
#COPY --from=cache /home/gradle/cache_home /home/gradle/.gradle
#COPY . /
#WORKDIR /
#RUN gradle build --stacktrace

FROM gradle:6.6.1-jdk14 as builder
WORKDIR /
ADD . /
RUN gradle build --stacktrace

FROM openjdk:14-alpine
WORKDIR /app
COPY --from=builder /build/libs/backend-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "backend-0.0.1-SNAPSHOT.jar"]