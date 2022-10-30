FROM openjdk:20-slim
EXPOSE 8081
ADD target/*.jar gateway-service.jar 
ENTRYPOINT ["java","-jar","/gateway-service.jar"]