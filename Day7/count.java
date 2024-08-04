import java.util.StringTokenizer;
public class count{
    public static void main(String args[]){
        StringTokenizer st= new StringTokenizer("my:name:is:nithish",":");
        System.out.println("The total number of tokens: "+st.countTokens());
        }
    }
