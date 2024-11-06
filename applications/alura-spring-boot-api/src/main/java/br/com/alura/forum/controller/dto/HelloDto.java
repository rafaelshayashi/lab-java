package br.com.alura.forum.controller.dto;

public class HelloDto {

    private String message;

    public HelloDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
