public class strex18{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb.capacity());
        sb.append("Java is a language");
        System.out.println(sb.capacity());
       
    }
}

