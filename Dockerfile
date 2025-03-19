FROM openjdk:17-jdk-alpine
LABEL authors="saymon_castro"

# Expor a porta configurada no Spring Boot
EXPOSE 8085

# Copiar o arquivo JAR para o diretório do container
COPY target/ApiOperadoras-0.0.1-SNAPSHOT.jar /app/api-operadoras/api-operadoras.jar

# Definir o diretório de trabalho
WORKDIR /app/api-operadoras

# Definir o comando para rodar o JAR
ENTRYPOINT ["java", "-jar", "api-operadoras.jar"]