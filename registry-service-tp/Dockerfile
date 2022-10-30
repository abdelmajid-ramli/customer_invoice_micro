FROM openjdk:20-slim
EXPOSE 8761
ADD target/*.jar registry-service.jar 
ENTRYPOINT ["java","-jar","/registry-service.jar"]