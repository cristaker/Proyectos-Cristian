FROM eclipse-temurin:17-jdk

LABEL maintainer="http://www.uv.es/twcam"

RUN apt-get update && apt-get install -y mysql-client

WORKDIR /parameta

COPY target/parameta-0.0.1-SNAPSHOT.jar parameta.jar
COPY wait-for-it.sh /wait-for-it.sh

EXPOSE 8090

ENTRYPOINT ["java", "-jar", "parameta.jar"]