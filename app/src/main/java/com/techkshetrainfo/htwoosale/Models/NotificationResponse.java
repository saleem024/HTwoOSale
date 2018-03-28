package com.techkshetrainfo.htwoosale.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by techkshetra-1 on 28/3/18
 */

public class NotificationResponse {

    @SerializedName("notification")
    @Expose
    private List<Notification> notification = null;

    public List<Notification> getNotification() {
        return notification;
    }

    public void setNotification(List<Notification> notification) {
        this.notification = notification;
    }

}