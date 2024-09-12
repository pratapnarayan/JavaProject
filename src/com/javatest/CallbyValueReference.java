package com.javatest;

public class CallbyValueReference {
	
	public static void updateRevision(Application arg) {
		arg.setRevision("1.7");
	}
	
	public static void updateRevision1(Application arg) {
		Application updatedApp = new Application("1.6.5");
		arg = updatedApp;
		arg.setRevision("1.8");
	}

	public static void main(String[] args) {

		Application application = new Application("1.6");
		updateRevision1(application);
		System.out.println(application.getRevision());
	}

}
