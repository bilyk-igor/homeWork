package core_03;

public class Man extends Human {

	private boolean strong;

	public boolean isStrong() {
		return strong;
	}

	public void setStrong(boolean strong) {
		this.strong = strong;
	}

	public Man(String name, int age, String job, int payment) {
		super(name, age, job, payment);
		// TODO Auto-generated constructor stub
	}

	public Man(String name, int age, String job, int payment, boolean strong) {
		super(name, age, job, payment);
		this.strong = strong;
	}
	
	
	
	
	
}
