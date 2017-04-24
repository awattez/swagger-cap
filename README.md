# swagger-cap


## Swagger CodeGen

Recupérer les sources de swagger codegen
```sh
git clone https://github.com/swagger-api/swagger-codegen
cd swagger-codegen
mvn clean package //Compile la derniére version du projet
```


1. Static documentation
```sh
java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate \
   -i ../swagger-movies.yaml \
   -l html \
   -o ../swagger-movies-static-documentation
```

2. Dynamic documentation
```sh
java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate \
   -i ../swagger-movies.yaml \
   -l dynamic-html \
   -o ../swagger-movies-dynamic-documentation
```

```sh
cd ../swagger-movies-dynamic-documentation
npm install
node .
```
 
3. Client   
```sh
java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate \
   -i ../swagger-movies.yaml \
   -l java \
   -o ../swagger-movies-client-java
```

4. Server
```sh
java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate \
   -i ../swagger-movies.yaml \
   -l spring \
   -o ../swagger-movies-server-java
```

### Remarque : SpringFox

Le serveur SpringBoot généré via Swagger CodeGen ci-dessus est compatible avec les annotations ``@Api``etc. de Swagger permet de produire directement le fichier swagger correspondant aux routes/endpoints REST de notre serveur (en fonction de la conf Spring et des annotations). A ne pas confondre avec le swagger qui a permis de générer le serveur SpringBoot (mais en théorie il devrait être identique)


Vous pouvez retrouver le swagger du serveur à l'URL suivante:
http://localhost:8080/api/api-docs

SpringFox permet également de fournir un visualisation Swagger UI grace à la dependance suivante :
 ```xml
<dependency>
   <groupId>io.springfox</groupId>
   <artifactId>springfox-swagger2</artifactId>
   <version>${springfox-version}</version>
</dependency>
```

Vous pouvez retrouver la documentation à l'URL suivante:
http://localhost:8080/api/swagger-ui.html

 ```xml
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>${springfox-version}</version>
</dependency>
```

## Réferences

https://www.ow2.org/bin/download/Events/Cloud_Expo_Europe_London/openapiinitiativeandspecificationcloudexpolondon-160413075404.pdf

https://fr.slideshare.net/MartinYung/swagger-prsentation-en-franais

https://zestedesavoir.com/tutoriels/1280/creez-une-api-rest-avec-symfony-3/amelioration-de-lapi-rest/la-documentation-avec-openapi-swagger-restful-api/

http://editor.swagger.io/

https://github.com/swagger-api/swagger-codegen

https://github.com/swagger-api/swagger-codegen/wiki/Server-stub-generator-HOWTO

https://github.com/OAI/OpenAPI-Specification/blob/master/examples/v2.0/yaml/uber.yaml

http://rnavagamuwa.com/open-source/generate-client-side-code-using-swagger-codegen/

http://kongchen.github.io/swagger-maven-plugin/

https://springfox.github.io/springfox/docs/current/

http://blog.lecacheur.com/2015/11/10/raml-bientot-en-version-1-0/

