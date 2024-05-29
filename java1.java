import java.util.Arrays;

public class java1 
{
    public static void main(String[] args) 
    {
        String [] a = new String[3];

        System.out.println("3개 의 문자열을 입력하세요");
        
        a[0]="Hello";
        a[1]="Java";
        a[2]="ProGram";

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(Arrays.toString(a));

        System.out.print(a[0]+" ");
        System.out.print(a[1]+" ");
        System.out.print(a[2]); 
    }
    
}
