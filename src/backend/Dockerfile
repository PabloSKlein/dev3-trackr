#FROM openjdk:14-alpine
#WORKDIR /app
#
#EXPOSE 8080
#ADD ./build/libs/backend-0.0.1-SNAPSHOT.jar .
#CMD ["java", "-jar", "backend-0.0.1-SNAPSHOT.jar"]

FROM gradle:6.6.1-jdk14 as builder
WORKDIR /
ADD . /
RUN gradle build --stacktrace

FROM openjdk:14-alpine
WORKDIR /app
COPY --from=builder /build/libs/backend-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "backend-0.0.1-SNAPSHOT.jar"]