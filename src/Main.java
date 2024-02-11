
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int heat;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sicaklik giriniz : ");
        heat = scanner.nextInt();
        
        if(heat > 25){
            System.out.println("Yuzmeye gidebilirsiniz.");
        }
        else if(heat >= 5){
            if(heat >= 15){
                System.out.println("Piknige gidebilirsin.");
            }
            else if(heat >= 10){
                System.out.println("Hem sinemaya hem Piknige gidebilirsin.");
            }
            else{
                System.out.println("Sinemaya gidebilirisin.");
            }
        }
        else{
            System.out.println("Kayak yapabilirisin.");
        }
    }
}
