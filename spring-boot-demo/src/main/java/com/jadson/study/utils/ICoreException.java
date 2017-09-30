package com.jadson.study.utils;

public class ICoreException extends RuntimeException {
    private int status;
    private String message;

    public ICoreException() {
    }

    public ICoreException(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
