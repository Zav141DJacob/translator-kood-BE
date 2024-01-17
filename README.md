# Requirements

Before you begin, ensure that your development environment meets the following requirements:

- **Java:** The project requires Java Development Kit (JDK) version 17 or later. You can download the latest version [here](https://www.java.com/en/).

- **Gradle (Optional):** While the project includes the Gradle Wrapper (`gradlew`), you may choose to install Gradle globally. If you prefer to install Gradle, you can download it from the [official Gradle website](https://gradle.org/install/).

Make sure to set up your Java environment and Gradle (if chosen) before proceeding with the project setup.

# Run the Application

Use the Gradle Wrapper script to build and run the project:

```bash
./gradlew bootRun
```

Alternatively, if you have Gradle installed globally:

```bash
gradle bootRun
```

This command will download the necessary dependencies, build the project, and start the Spring Boot application.

The backend will only accept requests from `http://localhost:5173`. If you wish to change this, then head to `src/main/java/translatorkood/translator/TranslatorController.java` and modify the value inside the @CrossOrigin annotation.

---

This tutorial was created by ChatGPT – Powered by OpenAI

This project was created by Jaagup Tomingas - Powered by WillPower
