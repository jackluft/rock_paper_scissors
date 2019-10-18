
import java.util.Scanner;
public class rock_paper_scissors{
    
    
    public static void main(String[] args){
        String input = "y";
        Scanner sc = new Scanner(System.in);
        int min = 1;
        int max = 3;
        while(input.equals("y")){
            
            System.out.println("What do you throw? [1] Rock, [2] Paper, [3] Scissors? ");
            int ans = sc.nextInt();
            if(ans == 1){
                System.out.println("You throw Rock!!");
                
                
            }
            else if(ans == 2){
                
                
                System.out.println("You throw Paper!!!");
                
                
                
            }
            else if(ans == 3){
                System.out.println("You throw Scissors!!!");
                
                
                
            }
            
            double r2 = (Math.random()*((max-min)+1))+min;
            int r3 = (int) r2;
            
            if(r3 == 1){
                System.out.println("I throw Rock!!");
                
                
            }
            else if(r3 == 2){
                
                
                System.out.println("I throw Paper!!!");
                
                
                
            }
            else if(r3 == 3){
                System.out.println("I throw Scissors!!!");
                
                
                
            }
            
            if(ans == r3){
                
                System.out.println("Tired Game!!");
                
                
            }
            else if(ans ==1 && r3 == 2){
                // if u throw rock and computer throws paper
                System.out.println("Computer wins!!");
                
                
                
            }
            else if(ans == 2 && r3 == 1){
                // if u throw paper and computer throws rock
                
                System.out.println("You win!!");
                
                
            }
            else if(ans == 1 && r3 == 3){
                // you throw rock and computer throws scissors
                
                System.out.println("You win!!");
                
                
            }
            else if(ans == 3 && r3 == 1){
                
                // you throw scissors and computer throws rock
                
                System.out.println("Computer wins!!");
                
                
                
                
            }
            else if(ans == 3 && r3 == 2){
                // you throw scissors and computer throws paper
                System.out.println("You win!!!");
                
                
            }
            else if(ans == 2 && r3 == 3){
                
                // you throw paper and computer throws scissors
                System.out.println("Computer wins!!!");
                
                
            }
            System.out.println("Play again? [y,n] ");
            input = sc.next();
            
            
            
            
            
            
            
            
            
            
            
            
        }
        
        
        
    }

    
}
