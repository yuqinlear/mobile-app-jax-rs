package com.changpeng.app.ws.exceptions;

public class MissingRequiredFieldException extends RuntimeException{
    private static final long serialVersionUID = 309127312730904L;

    public MissingRequiredFieldException(String message) {
        super(message);
    }
}
