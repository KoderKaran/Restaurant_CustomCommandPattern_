public class NullOrder implements Command{
	@Override
	public void execute() {
		System.out.println("This is nothing.");
	}

	@Override
	public String getName() {
		return null;
	}
}
