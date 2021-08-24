FROM openjdk:8
ADD target/demo-springboot-docker.jar demo-springboot-docker.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","/demo-springboot-docker.jar"]