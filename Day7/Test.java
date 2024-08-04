import java.util.StringTokenizer;
public class Test{
    public static void main(String args[]){
        StringTokenizer st= new StringTokenizer("my,name,is,nithish",",");
        System.out.println("The next token is: "+st.nextToken(","));
        }
    }
