package com.tnsif.interfacedemo;

interface Notification {
	void notifyuser(String msg);
}

class Emailnotification implements Notification {

	@Override
	public void notifyuser(String msg) {
		// TODO Auto-generated method stub
		System.out.println("sending email: " + msg);
	}

}

class SMSnotification implements Notification {

	@Override
	public void notifyuser(String msg) {
		// TODO Auto-generated method stub
		System.out.println("swnding sms: " + msg);

	}

}

public class FunctionalInterface {
	public static void main(String[] args) {
		Notification n = new Emailnotification();
		Notification s = new SMSnotification();
		n.notifyuser("Hello via Email");
		s.notifyuser("Hello via SMS");
	}
}
