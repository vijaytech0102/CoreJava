package collections;

public class EmailNotification extends Notification{
	
	@Override
	public void send()
	{
		System.out.println("Email Notification");
	}
}
