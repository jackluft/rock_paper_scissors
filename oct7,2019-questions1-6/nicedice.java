import java.util.Scanner;

public class nicedice{
    

  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String user ="y";
        
        while(user.equals("y")){
            System.out.println("How many dice do you want to roll? ");
            int times= sc.nextInt();
            
            System.out.println("How many sides to these dice have?");
            int min = 1;
            int max = sc.nextInt();
            System.out.print("Rolled:   ");
            for(int i= 0; i < times; i++){
                double r2 = (Math.random()*((max-min)+1))+min;
                int r3 = (int) r2;
                if( i < times-1){
                
               
                System.out.print(r3+",");
            }
            else{
                
                System.out.println(r3+"");
                
            }
            }
            System.out.print("Again? [y,n]");
            user = sc.next();
        }
    }
   
   
}
