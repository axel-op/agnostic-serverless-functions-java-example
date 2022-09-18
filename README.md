# Agnostic Serverless Functions in Java: example

This is an example of an [Agnostic Serverless Function in Java](https://github.com/axel-op/agnostic-serverless-functions-java). An *agnostic serverless function* is a serverless function which has no direct dependency to any provider-specific FaaS framework.

Neither [the code of this function](./src/main/java/fr/axelop/agnosticserverlessfunctions/example/), nor [its configuration](./pom.xml), contain instructions specific to any FaaS provider.

This function can be deployed to Azure Functions or Google Cloud Functions without editing the code or the configuration (other providers will be supported in the future). Look at the [deployment workflow](./.github/workflows/deployment.yml) for a complete example of a deployment.
