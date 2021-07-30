package CorrectUse;

public class OutlookService implements IMailService {

	public OutlookService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send(String message) {
		System.out.println(message + "Service: Outlook");
		
	}

}
