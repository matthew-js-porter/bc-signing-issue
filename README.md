# Bouncy Castle JAR Signing Issue

This repository demonstrates an issue with Spring Boot applications using Bouncy Castle 1.84+ in JAR mode.

## The Issue

When using Bouncy Castle version 1.84, Spring Boot applications fail to start in JAR mode with the following error:

```
Caused by: java.util.jar.JarException: bcprov-jdk18on-1.84.jar! has unsigned entries - META-INF/services/java.security.Provider
```

## Requirements

- Oracle JDK 
- Maven

## How to Reproduce the Issue

1. Build with Bouncy Castle 1.84 (default):
   ```bash
   ./mvnw clean package
   java -jar target/bc-signing-issue-0.0.1-SNAPSHOT.jar
   ```

2. Observe the JarException error during startup.

## Verification - Working with Bouncy Castle 1.83

To verify the issue doesn't exist with Bouncy Castle 1.83:

```bash
./mvnw -Dbouncycastle.version=1.83 clean package
java -jar target/bc-signing-issue-0.0.1-SNAPSHOT.jar
```

The application should start successfully without the JAR signing error.