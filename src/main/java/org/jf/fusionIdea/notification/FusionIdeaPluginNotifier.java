package org.jf.fusionIdea.notification;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationGroup;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.project.Project;

public class FusionIdeaPluginNotifier {
    private final NotificationGroup notificationGroup;

    public FusionIdeaPluginNotifier() {
        notificationGroup = NotificationGroup.findRegisteredGroup("FusionIdeaPluginNotifications");
    }

    public void notify(String content, Project project) {
        Notification notification = notificationGroup.createNotification(content, NotificationType.INFORMATION);
        notification.setTitle("FusionIdeaPlugin notification");
        Notifications.Bus.notify(notification, project);
    }
}
