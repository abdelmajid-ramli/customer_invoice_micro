FROM openjdk:20-slim
EXPOSE 8081
ADD target/*.jar invoice-service.jar 
ENTRYPOINT ["java","-jar","/invoice-service.jar"]