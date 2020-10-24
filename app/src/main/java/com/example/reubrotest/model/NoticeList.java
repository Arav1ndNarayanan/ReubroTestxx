package com.example.reubrotest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NoticeList {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private Notice data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public NoticeList withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public NoticeList withMessage(String message) {
        this.message = message;
        return this;
    }

    public Notice getData() {
        return data;
    }

    public void setData(Notice data) {
        this.data = data;
    }

    public NoticeList withData(Notice data) {
        this.data = data;
        return this;
    }

}