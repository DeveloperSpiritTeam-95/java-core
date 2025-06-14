package com.springboot.config;

import org.apache.http.HttpStatus;

// A wrapper class that implements ResponseData.  This is a common approach.
class ApiResponse<T> implements ResponseData<T> {
    private T data;
    private String message;
    private int status;

    public ApiResponse(T data, String message, int status) {
        this.data = data;
        this.message = message;
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    // Static factory method for a success response
    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(data, "Success", HttpStatus.SC_OK);
    }
     // Static factory method for a created response
    public static <T> ApiResponse<T> created(T data) {
        return new ApiResponse<>(data, "Created", HttpStatus.SC_CREATED);
    }

    // Static factory method for an error response
    public static <T> ApiResponse<T> error(String message, int status) {
        return new ApiResponse<>(null, message, status);
    }
}