package com.mobile.springbootjwtapi.services;

import com.mobile.springbootjwtapi.models.notification.PushNotificationRequest;

public interface PushNotificationService {
    void sendPushNotification(PushNotificationRequest req);
}
