package com.example.email.scheduler.payload;

public class EmailResponse {
    private boolean success;

    private String jobId;

    private String jobGroup;

    private String message;

    public EmailResponse(boolean success, String message){
        this.success = success;
        this.message = message;
    }

    public EmailResponse(boolean success, String jobId, String jobGroup, String message){
        this.success = success;
        this.jobGroup = jobGroup;
        this.jobId = jobId;
        this.message = message;
    }
}
