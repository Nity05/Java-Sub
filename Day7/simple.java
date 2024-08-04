import java.util.StringTokenizer;
public class simple{
    public static void main(String args[]){
        StringTokenizer st= new StringTokenizer("my name is nithish"," ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
   
}
