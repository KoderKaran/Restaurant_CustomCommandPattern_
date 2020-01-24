public class Waffles implements Command {
	@Override
	public void execute() {
		System.out.println("The cook has made some waffles and they are being sent out!");
	}

	@Override
	public String getName() {
		return "waffles";
	}
}
