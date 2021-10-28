FROM openjdk:8
ADD target/jenkins-app1-0.0.1-SNAPSHOT.jar jenkins-app1-0.0.1-SNAPSHOT.jar
EXPOSE 8000
ENTRYPOINT ["java","-jar","jenkins-app1-0.0.1-snapshot.jar"]