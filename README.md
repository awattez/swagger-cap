# swagger-cap


git clone https://github.com/swagger-api/swagger-codegen
cd swagger-codegen
mvn clean package


# Static documentation

java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate \
   -i ../swagger-movies.yaml \
   -l html \
   -o ../swagger-movies-static-documentation

# Dynamic documentation

java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate \
   -i ../swagger-movies.yaml \
   -l dynamic-html \
   -o ../swagger-movies-dynamic-documentation


cd ../swagger-movies-dynamic-documentation
npm install
node .

# Client   

java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate \
   -i ../swagger-movies.yaml \
   -l java \
   -o ../swagger-movies-client-java-bis


#Server

java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate \
   -i ../swagger-movies.yaml \
   -l spring \
   -o ../swagger-movies-server-java-bis


<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>${springfox-version}</version>
</dependency>


http://localhost:8080/api/api-docs

http://localhost:8080/api/swagger-ui.html

-----------------------------------------------

http://kongchen.github.io/swagger-maven-plugin/