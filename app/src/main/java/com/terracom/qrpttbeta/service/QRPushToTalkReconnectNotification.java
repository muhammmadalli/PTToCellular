package com.terracom.qrpttbeta.service;

import android.app.Service;

public class QRPushToTalkReconnectNotification {
    public interface OnActionListener {
        void reconnect();
        void cancelReconnect();
        void onReconnectNotificationDismissed();
    }

    public static QRPushToTalkReconnectNotification show(Service service, String message, boolean reconnecting, OnActionListener listener) {
        // Basic placeholder
        return new QRPushToTalkReconnectNotification();
    }

    public void hide() {
        // Basic placeholder
    }
}
