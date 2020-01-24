public class HotDog implements Command {
	@Override
	public void execute() {
		System.out.println("The cook has made a hot dog and it is being sent out!");
	}

	@Override
	public String getName() {
		return "hot dog";
	}
}
