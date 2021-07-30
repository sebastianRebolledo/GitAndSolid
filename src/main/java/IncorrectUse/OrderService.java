package IncorrectUse;

import CorrectUse.OutlookService;

public class OrderService  {

	private OutlookService mailService;
	
	public OrderService(OutlookService mailService) {
		this.mailService=mailService;
	}
	
	public void createOrder() {
		String message = "Creating order";
		mailService.send(message);
		
		
	}

	public static void main(String[] args) {
		OrderService o1 = new OrderService(new OutlookService());
		o1.createOrder();

		
		

	}



}
