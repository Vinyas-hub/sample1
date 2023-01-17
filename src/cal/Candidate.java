package cal;

public class Candidate {
	public void checkmark(int marks)throws Exception{
		if(marks<40){
			throw new Exception("invalid marks");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Candidate obj=new Candidate();
			obj.checkmark(10);
		}
		
		catch(Exception a){
			System.out.println(a.getMessage());
			a.printStackTrace();
			
		}
	}

}
