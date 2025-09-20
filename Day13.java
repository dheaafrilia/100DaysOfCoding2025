package dhea13;

public class Dhea13 {

  
    public static void main(String[] args) {

        char a,b,c;
        a = '&';
        b = '$';
        c = '@';
        System.out.println("sebelum:");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        
        a += b;
        b = (char)(a - b);
        a -= b;
        
        System.out.println("setelah:");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        
    }
    
}
