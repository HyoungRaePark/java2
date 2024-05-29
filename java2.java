import java.util.Arrays;

public class java2 
{
    public static void main(String[] args) 
    {
        double[] a = new double[10];
        double b;
        double c;


        a[0] = 90;
        a[1] = 70.5;
        a[2] = 80;
        a[3] = 79;
        a[4] = 82.5;
        a[5] = 50;
        a[6] = 70;
        a[7] = 90.2;
        a[8] = 89.5;
        a[9] = 89.7;

        b = Arrays.stream(a).sum();
        c = Arrays.stream(a).average().orElse(0);



        System.out.println("합계:"+b);
        System.out.println("평균:"+c);
    }
    
}


