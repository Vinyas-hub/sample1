package cal;

public class SimpleIntrest {
	void calculateintrest(float principal,float rate,float time)throws IllegalAmountException
	{
		if(principal <= 0||rate<=0||time<=0){
			throw new IllegalAmountException("enter number greater than 0");
		}else if(principal<1000){
			throw new IllegalAmountException("enter number greater than 1000");

		}
		System.out.println(principal*rate*time/100);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleIntrest c=new SimpleIntrest();
		try{
			c.calculateintrest(10,12.5,123);
		}
		catch(IllegalAmountException e){
			e.showError();
			System.out.println(e);
			
		}

	}

}
