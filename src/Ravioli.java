public class Ravioli  implements Command {
	@Override
	public void execute() {
		System.out.println("The cook has made some ravioli and it is being sent out!");
	}

	@Override
	public String getName() {
		return "ravioli";
	}
}
