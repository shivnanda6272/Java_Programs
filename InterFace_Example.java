interface Fun{
	String color="Red";
	void fillup();
}

public class Interface_Example implements Fun{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(color);
		Interface_Example ob = new Interface_Example();
		ob.fillup();
	}
	@Override
	public void fillup() {
		System.out.println("It me Interface");
	}
}
