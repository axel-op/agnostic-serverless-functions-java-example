package fr.axelop.agnosticserverlessfunctions.example;

import java.util.logging.Logger;

import fr.axelop.agnosticserverlessfunctions.Handler;
import fr.axelop.agnosticserverlessfunctions.HttpRequest;
import fr.axelop.agnosticserverlessfunctions.HttpResponse;

public class MyHandler implements Handler {

    @Override
    public HttpResponse handle(HttpRequest request, Logger logger) {
        return HttpResponse.newBuilder()
                .setStatusCode(200)
                .setBody(request.getBody().isPresent()
                        ? "The request body was: " + request.getBody().get()
                        : "There was no body in this " + request.getMethod() + " request!")
                .build();
    }
    
}