A sample application to get Familliar with usig Dockerfile with SpringBoot 

Technologies used are : Jdk1.8, maven, Docker, SpringBoot

1--clone this projetct to your host
 git clone git@github.com:motaouia/demo-springboot-docker.git

2--build the application using maven tool:
mvn clean install

3--build docker image using the Docker file with the following command:

docker build -t demo-springboot-docker .

4--run the container
docker run -p 8085:8085 demo-springboot-docker

5-- Finally open your browser and enter the following link :
http://localhost:8085/rest/docker/hello/messages

Happy Learning :)
