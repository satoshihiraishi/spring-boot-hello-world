# SPRING-BOOT-HELLO-WORLD

```code
## create app
spring init --build=gradle -l=kotlin -d=web --type=gradle-project-kotlin spring-helloworld

## local
gradle bootRun

## container
gradle build
docker build -t my-spring-boot-app .
docker run -p 8080:8080 --name <your-setting-container-name> -d my-spring-boot-app
```
