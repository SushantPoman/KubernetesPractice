FROM openjdk:17
EXPOSE	8080
ADD target/kubernetespractice.jar kubernetespractice.jar
ENTRYPOINT ["java","-jar","/kubernetespractice.jar"]