variable "region" {
  description = "AWS region"
  type        = string
}

variable "function_name" {
  description = "The name of the function to deploy"
  type        = string
}

variable "function_handler" {
  description = "The entrypoint of the function"
  type        = string
  default     = "fr.axelop.agnosticserverlessfunctions.FunctionInvoker::handleRequest"
}

variable "function_timeout" {
  description = "Amount of time your Lambda Function has to run in seconds"
  type        = number
  default     = 10
}

variable "deployment_file" {
  description = "The JAR to be deployed"
  type        = string
}
