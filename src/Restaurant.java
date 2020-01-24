public class Restaurant {
	public static void main(String[] args){
		Waiter waiter = new Waiter(10);
		Cook cook = new Cook();
		while(true){
			waiter.checkOrders(cook);
		}


	}
}
