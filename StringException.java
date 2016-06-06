
public class StringException {

	public static void main(String[] args) {
		
		String a = "This is an example";
		String b = null;
		
		try{
			
			for(int i = 0; i <= a.length(); i++){
				
				b = b + a.charAt(i);
				
			}
			
			
		}
		catch(Exception e){
			
			System.out.println(e);
			
		}
		
		
	}
	
}
