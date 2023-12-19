# プロジェクト名: SpringHelloWorld

このプロジェクトは、Spring Bootを使用したシンプルなWebアプリケーションです。エンドポイント / にアクセスすると、"Hello World!"というメッセージが表示されます。
プロジェクトの構成

- SpringHelloWorldApplication.kt: Spring Bootアプリケーションのメインクラスです。アプリケーションの起動はここから始まります。
- HelloController.kt: ルートURL / に対するGETリクエストを処理するコントローラーです。
- DemoApplicationTests.kt: アプリケーションのテストクラスです。

## ビルドと実行

このプロジェクトはGradleを使用してビルドします。以下のコマンドでビルドを行うことができます。

```code
./gradlew build
```

ビルドが成功すると、build/libsディレクトリにmy-spring-boot-project-0.0.1-SNAPSHOT.jarが生成されます。

次に、以下のコマンドでアプリケーションを実行します。

```code
java -jar build/libs/my-spring-boot-project-0.0.1-SNAPSHOT.jar
```

## Dockerを使用した実行

Dockerを使用してアプリケーションを実行することも可能です。  
ただし、DockerfileのCOPYコマンドで指定されているJARファイルが存在することを確認してください。

```code
docker build -t my-spring-boot-app .
docker run -p 8080:8080 my-spring-boot-app
```

以上で、アプリケーションが起動します。ブラウザでhttp://localhost:8080/にアクセスすると、"Hello World!"というメッセージが表示されます。

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
