FROM maven:3.6.3-jdk-11

COPY ./ ./

RUN mvn clean package

CMD ["java", "-jar", "target/phairify-0.0.1-SNAPSHOT.jar"]