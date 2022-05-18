package com.example.buurttuin.Exceptions;

public class RecordNotFoundException extends Throwable {

    public static final long serialVersionUID = 1L;

    public RecordNotFoundException() {
        super();
    }

    public RecordNotFoundException(String message) {
        super(message);
    }
}
