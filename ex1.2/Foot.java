import java.util.Scanner;

public class Foot {
   
    private FootShape footshape = null;

    Foot(FootShape footshape){
        this.footshape = footshape;
    } 
    
    void draw(){
        while(true){
            System.out.println("What to draw? 1. Ellipse, 2. Rectangle");
            
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                footshape.drawEclipse();
                    break;
                case 2:
                footshape.drawRectangle();
                    break;
                default:
                    break;
            }
        }
    }
}
