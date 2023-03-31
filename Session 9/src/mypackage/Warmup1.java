package mypackage;

public class Warmup1 {

	public static void main(String[] args) {
		
	}
	
	public boolean parrotTrouble(boolean talking, int hour) {
		  
		boolean parrot = false;
		
		if(parrot==talking && hour<7 || hour>20) {
			return true;
		}
		return false;
	}
}