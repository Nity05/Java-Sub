import java.util.StringTokenizer;
public class simple2{
    public static void main(String args[]){
        StringTokenizer st= new StringTokenizer("my:name:is:nithish",":");
        while(st.hasMoreElements()){
            System.out.println(st.nextToken());
        }
    }
   
}
