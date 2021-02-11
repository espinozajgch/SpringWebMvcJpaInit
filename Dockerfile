FROM openjdk:8

#FROM openjdk:8-jdk-alpine

#RUN apt-get update && apt-get install -y maven

#COPY . /project

#RUN  cd /project && mvn package

# Add a volume pointing to /tmp
#VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080

#ADD normalizador /root/normalizador

#ADD .config /root/.config

#RUN mkdir /root/nyg_files

#RUN mkdir /root/nyg_files/cl

#RUN mkdir /root/nyg_files/cl/temp

# The application's jar file
ARG JAR_FILE=/target/demo.jar

# Add the application's jar to the container
#ADD ${JAR_FILE} app.jar

#ARG JAR_FILE=*.jar
COPY ${JAR_FILE} application.jar
ENTRYPOINT ["java", "-jar", "application.jar"]

#ENTRYPOINT ["java", "-jar", "/project/target/demo.jar"]

#RUN echo ${HOME}
