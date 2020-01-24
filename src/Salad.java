public class Salad  implements Command {
	@Override
	public void execute() {
		System.out.println("The cook has made the salad and it is being sent out!");
	}

	@Override
	public String getName() {
		return "salad";
	}
}
