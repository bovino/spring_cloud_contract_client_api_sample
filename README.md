# Producer-driven Contract + Consumer-Driven Contract tests Sample - Client application
Sample application to demonstrate the use of Producer Driven Contract and Consumer Driven Contract tests with SpringBoot 2.3.0 + Spring Cloud Contract - Server API Sample.

This application uses:

- Spring Boot 2.3.0
- Spring Cloud Hoxton.SR4
- Spring Cloud Contract
- Spring Web+Rest
- Lombok
- Java 8
- Gradle (Gradle wrapper)
- JUnit e Mockito
- Open Feign
- StubRunner
- WireMock

You can see the server API application here: https://github.com/bovino/spring_cloud_contract_server_api_sample

# Getting Started
This application uses Gradle (Gradle wrapper) and a few useful commands are:

*Basic Build:* gradle clean build

*Publish (includes generation and publish of contract stubs for your local repo):*

gradlew clean publishToMavenLocal

*Run tests (including the contract tests):*
gradlew clean test

Before using this application you will need:

- Some IDE with Lombok support (i like IntelliJ)
- Any API Rest client (i like Postman)
- JDK 1.8,0_251 or newer
- Configure your JAVA_HOME environment variable
- You need the ports 8080 (server API) and 8081 (client API) to be free

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/gradle-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use and setup some features more concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Spring Cloud Contract Docs - Overview](https://spring.io/projects/spring-cloud-contract#overview)
* [Gradle Setup for Spring Cloud Contract](https://cloud.spring.io/spring-cloud-contract/reference/html/gradle-project.html)
* [Spring Cloud Contract Verifier Setup](https://cloud.spring.io/spring-cloud-contract/spring-cloud-contract.html#_spring_cloud_contract_verifier_setup)
* [Como os testes de contrato melhoram a qualidade dos sistemas distribuídos](https://www.infoq.com/br/articles/contract-testing-spring-cloud-contract/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)





