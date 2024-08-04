import java.util.Scanner;
public class rd{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the numbers in the array");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]<a[j]){
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }

        System.out.println("The third largest element in the array: "+a[2]);

    }
}
