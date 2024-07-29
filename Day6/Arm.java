import java.util.Scanner;
public class Arm{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int x=s.nextInt(); 
        System.out.print("Enter the lower limit: ");
        int y=s.nextInt(); 
        for(int i=x;i<=y;i++){
        int m=i;
        int p=i;
        int c=0;
        while(m!=0){
            m/=10;
            c++;
        }
        int b;
        int sum=0;
        while(p!=0){
            b=p%10;
            sum+=Math.pow(b,c);
            p/=10;
        }
        if(sum==i){
            System.out.println("The "+i+" is a armstrong number");
        }
    }
}
}