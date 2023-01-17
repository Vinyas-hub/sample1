package cal;

public class Arraydemo {
	public void addnum(int size){
		try{
		int[] arr={12,34,11,19,45,33,11,45};
		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
			
		}
	
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("plz pass size less than8");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraydemo obj=new Arraydemo();
		obj.addnum(9);
		
	}

}
