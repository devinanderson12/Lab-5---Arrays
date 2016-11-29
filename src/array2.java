import java.util.Scanner;

/**
 * 
 */

/**
 * @author d.anderson2
 *
 */
public class array2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner userInput = new Scanner(System.in);
		  double[] userNum = new double[10];
		  double searchValue;
		  int count = 0;		 
		  		 
			  		
		  System.out.println("Please enter 10 integer values ");		  
		  
		  for(int i = 0; i < userNum.length; i++){
			System.out.print("Please enter one more: ");
			userNum[i] = userInput.nextDouble(); 
		  }
			
		 	  
			  		 
		  System.out.print("What value do you want to search for: ");
		  searchValue = userInput.nextDouble();
		  
		  for(int i = 0; i < userNum.length; i++){
			
			  if(userNum[i] == searchValue){
				  
				  count ++;
				  
			  }
		  }
			
		  
		  System.out.println("This was printed " + count);
		  
		  userInput.close();		  		  
        		  
	  		  								
	}

}
