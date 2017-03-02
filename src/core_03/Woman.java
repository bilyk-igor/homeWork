package core_03;

public class Woman extends Human {

	private boolean afraidOfMice;

	public boolean isAfraidOfMice() {
		return afraidOfMice;
	}

	public void setAfraidOfMice(boolean afraidOfMice) {
		this.afraidOfMice = afraidOfMice;
	}

	public Woman(String name, int age, String job, int payment) {
		super(name, age, job, payment);
		// TODO Auto-generated constructor stub
	}
	
	public String date(){
		
		
		
		return getName() + " yes "; 		
	}
	
	
	
}
