/**
 * 
 */
package homeworkexercises;

/**
 * @author asus
 *
 */
public class OddAndEven {
     double randomNumber;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double randomNumber=Math.random();
       int number=(int)(randomNumber*10+1);
       if(number%2==0)
    	   System.out.println("The random number is even!");
       else
    	   System.out.println("The random number is Odd!");
       
           System.out.print(number);
           System.out.println("HongCheng is SB");
	}

}
