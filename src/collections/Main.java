package collections;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		List<Notification> message= new ArrayList<>();
		
		// upcasting
		Notification email= new EmailNotification();
		Notification sms= new SmsNotifcation();
		Notification push= new PushNotification();
		
		message.add(email);
		message.add(sms);
		message.add(push);
	
		System.out.println(message);
		email.send();
		sms.send();
		push.send();
		
		
		
	}

}
