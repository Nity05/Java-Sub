import java.util.StringTokenizer;
public class simple1{
    public static void main(String args[]){
        StringTokenizer st= new StringTokenizer("my name is nithish demonstrating methods from the String Tokenizer class then i am going to run this code in VScode"," ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
   
}
