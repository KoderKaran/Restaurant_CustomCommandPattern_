import java.awt.*;

public class Cook {
	private Command[] ordersToDo;

	public void addOrders(Command[] orders) {
		ordersToDo = orders;
		try {
			orderUp();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void orderUp()throws InterruptedException{
		System.out.println("The cook has received the orders!");
		for(int i =0; i<ordersToDo.length; i++){
			if(!(ordersToDo[i] instanceof NullOrder)){
				Thread.sleep(2000);
				ordersToDo[i].execute();
				if(i < ordersToDo.length - 1){
					Thread.sleep(2000);
					System.out.println("\nThe cook is starting the " + ordersToDo[i+1].getName() + "!");
				}
			}
		}
		System.out.println("The cook has finished all the orders!");
	}
}
