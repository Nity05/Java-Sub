import java.util.Scanner;
public class calc{
   public static void main(String[] args){
       int f=1;
       while(f==1){
           Scanner fl=new Scanner(System.in);
           System.out.println("Enter your choice for performing arithmetic operation ");
           System.out.println("1. Addition ");
           System.out.println("2. Subtraction ");
           System.out.println("3. Multiplication ");
           System.out.println("4. Division ");
           System.out.println("5. Modulus ");
           System.out.println("6. Power ");
           System.out.println("0 to Quit the program ");
           int ch=fl.nextInt();
           if(ch==0){
                System.out.println("Thank for using the Calculator");
                break;
           }
           System.out.print("Enter the first number: ");
           double n1=fl.nextDouble();
           System.out.print("Enter the second number: ");
           double n2=fl.nextDouble();
           double r;
           switch (ch) {
                case 1:
                    r=n1+n2;
                    System.out.println("The output after performing addition is: "+r);
                    break;
                case 2:
                    r=n1-n2;
                    System.out.println("The output after performing subtraction is: "+r);
                    
                    break;
                case 3:
                    r=n1*n2;
                    System.out.println("The output after performing multiplication is: "+r);
                    break;
                case 4:
                    r=n1/n2;
                    System.out.println("The output after performing division is: "+r);
                    break;
                case 5:
                    r=n1%n2;
                    System.out.println("The output after performing modulus is: "+r);
                    break;
                case 6:
                    r=Math.pow(n1,n2);
                    System.out.println("The output after performing power is: "+r);
                    break;
                default:
                    System.out.println("Enter valid choie");
                    break;
              
           }
           System.out.println("If you want to continue calculation enter 1 otherwise enter 0");
           int u=fl.nextInt();
           if(u!=1){
               f--;
           }
       }
       System.out.println("Thank for using the Calculator");
   }
}
