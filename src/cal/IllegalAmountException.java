package cal;

public class IllegalAmountException extends Exception{
	public void calculateintrest(float principle,float rate,float time){
		System.out.println(principle*rate*time);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
