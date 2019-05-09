package org.godhc.restfulws.service;

import java.util.List;

import org.godhc.restfulws.model.Notification;

public interface NotificationService {
	public List<Notification> getNotifications();
	public Notification notify(String subject, String message, List<String> toAddress, List<String> ccAddress);
}
