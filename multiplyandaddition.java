
public class multiplyandaddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		char b[]=a.toCharArray(); 
		int sum=0,j=0;
		for(int i=0;i<b.length;i++) // process for addition
		{ 
			if(b[i]== '+')
			{  
				sum+=Character.getNumericValue(b[i-1])+Character.getNumericValue(b[i+1]); 
				
				
			}
			
			
		}  
		int z=Character.getNumericValue(b[b.length-1]);
		int y=Character.getNumericValue(b[0]);
		
		System.out.println("PROCESS FOR ADDITION :"+sum*z);
		for(int i=0;i<b.length;i++) // process for addition
		{ 
			if(b[i]== '*')
			{  
				j+=Character.getNumericValue(b[i-1])*Character.getNumericValue(b[i+1]); 
				
				
				
			}
			
			
		}  
		j=j+y;
		System.out.println("PROCESS FOR MULTIPLY :"+j);
	}

} 

/*1+3*4+5*6
PROCESS FOR ADDITION :78
PROCESS FOR MULTIPLY :43    */
