package CorrectUse;

public class GmailService implements IMailService {

	public GmailService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send(String message) {
		System.out.println(message + "Service: Gmail");
		
	}

}
