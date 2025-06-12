import java.util.Scanner;
public class FlowerGame{
	public static void main(String [] args) {
		Finch myFinch = new Finch();
       Scanner scanner = new Scanner(System.in);
       System.out.println("Flower Game!");
   
       int totalRounds = 5;
       for (int round = 1; round <= totalRounds; round++) {
           System.out.println(round + " out of " + totalRounds);
           System.out.println("press enter when a flower is dropped into the pot");
           scanner.nextLine(); 
          
           myFinch.setLED(0, 255, 0);  ///green
           myFinch.setMove("F",100.0,100); 
           myFinch.setLED(0, 0, 0); // no color
           myFinch.setTurn("R",220.0,50);
       }
       myFinch.print("game over!");
      
       scanner.close();     
       myFinch.disconnect();
   }
}

