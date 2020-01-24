public class Hamburger implements Command {
	@Override
	public void execute() {
		System.out.println("The cook has made a hamburger and it is being sent out!");
	}

	@Override
	public String getName() {
		return "hamburger";
	}
}
