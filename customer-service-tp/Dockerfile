FROM openjdk:20-slim
EXPOSE 8081
ADD target/*.jar customer-service.jar 
ENTRYPOINT ["java","-jar","/customer-service.jar"]