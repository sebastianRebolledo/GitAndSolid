package CorrectUse;

public class OrderService  {

	private IMailService mailService;
	
	public OrderService(IMailService mailService) {
		this.mailService=mailService;
	}
	
	public void createOrder() {
		String message = "Creating order";
		mailService.send(message);
		
		
	}

	public static void main(String[] args) {
		OrderService o1 = new OrderService(new OutlookService());
		o1.createOrder();
		
		OrderService o2 = new OrderService(new GmailService());
		o2.createOrder();
		
		

	}



}
