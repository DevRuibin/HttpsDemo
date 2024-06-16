# How to use HTTPS with Spring Boot

## Development Environment

1. *Generate an SSL certificate*:
    ```shell
    keytool -genkeypair -alias myapp -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore keystore.p12 -validity 3650
    ```
2. Put the generated `keystore.p12` file in the `src/main/resources` directory.