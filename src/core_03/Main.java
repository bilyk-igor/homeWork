package core_03;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Man man = new Man("Nick", 25, "security", 10000, true);
		
		Man man1 = new Man("alex", 24, "driver", 8000, false);
		
		Woman woman = new Woman("mary", 20, "callCenter", 7000);
		

		if (man.getPayment() > man1.getPayment()){
			
			System.out.println(woman.date());
			
		}else{
			
		}
		
		
		
		
		
		
	}

}
