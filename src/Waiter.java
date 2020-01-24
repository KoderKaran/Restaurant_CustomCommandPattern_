import java.util.Arrays;
import java.util.Scanner;

public class Waiter {
	private Command[] orders;
	private NullOrder nullOrder;
	private Scanner scn;

	public Waiter(int newOrdersPerRound){
		orders = new Command[newOrdersPerRound];
		nullOrder = new NullOrder();
		scn = new Scanner(System.in);
		ordersToNull();
	}

	public void checkOrders(Cook cook){
		//checks if last index of orders array is unused
		if(orders[orders.length-1] instanceof NullOrder){
			nextCustomer(cook);
		}else{
			giveToCook(cook);
		}
	}

	private void ordersToNull(){
		Arrays.fill(orders, nullOrder);
	}

	private void nextCustomer(Cook cook) {
		System.out.println("\nHello Customer! May I take your order?");
		System.out.println("0 - End Order\n" +
				           "1 - Hot Dog\n" +
				           "2 - Hamburger\n" +
				           "3 - Waffles\n" +
				           "4 - Salad\n" +
				           "5 - Ravioli\n");
		int input = -1;
		while(input != 0){
			input = scn.nextInt();
			if(input == 1){
				setOrder(new HotDog(), cook);
			}else if(input == 2){
				setOrder(new Hamburger(), cook);
			}else if(input == 3){
				setOrder(new Waffles(), cook);
			}else if(input == 4){
				setOrder(new Salad(), cook);
			}else if(input == 5){
				setOrder(new Ravioli(), cook);
			}
		}
		giveToCook(cook);
	}

	private void giveToCook(Cook cook) {
		cook.addOrders(orders);
		ordersToNull();
	}

	private void setOrder(Command order, Cook cook){
		int index = -1;
		for(int i=0; i<orders.length; i++){
			if(orders[i] instanceof NullOrder) {
				index = i;
			}
		}
		if(index == -1){
			System.out.println("You have reached the order maximum! The Waiter will now take your order to the Cook.");
			giveToCook(cook);
		}else{
			orders[index] = order;
		}
	}
}
