import java.util.Scanner;
public class Lcm{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1=s.nextInt();        
        System.out.print("Enter the second number: ");
        int n2=s.nextInt();
        int r=0;
        r+=Math.max(n1,n2);
        while (true) {
            if((r%n1==0)&&(r%n2==0))
                break;
            r++;
        }
        System.out.println("The LCM of the numbers "+n1+" and "+n2+" is: "+r);
    }
}