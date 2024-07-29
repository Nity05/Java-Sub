import java.util.*;
public class pat{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the length of side of square: ");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=0;i<n-2;i++){
            System.out.print("*");
            for(int j=0;j<n-2;j++){
                System.out.print(" ");}
                System.out.println("*");
        }
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        
    }
}