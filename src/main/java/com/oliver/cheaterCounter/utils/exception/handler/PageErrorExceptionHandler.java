package com.oliver.cheaterCounter.utils.exception.handler;

public class PageErrorExceptionHandler  extends Exception {
    private String message;

    public PageErrorExceptionHandler(String message) {
        this.message = message;
    }

    public PageErrorExceptionHandler() {
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
