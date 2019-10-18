import java.util.Scanner;

public class displayBox
{
    public static void man(String[] args){
        Scanner sc = new Scanner(System.in);
        Box(1,20);
        
    }
    public static void Box(int w, int h){
        
        for(int i = 0; i < h; i++){
            
            for(int j = 0; j < w; j++){
                
                System.out.print("*");
                
                
            }
            System.out.println("");
            
        }
        
        
        
        
    }
}
