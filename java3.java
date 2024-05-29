public class java3 
{
    public static void main(String[] args) 
    {
        int [][] a = new int[2][2];

        float b =a[0][0]=90;
        float c =a[0][1]=80;
        float d =a[1][0]=70;
        float e =a[1][1]=80;
        float f = (b+c);
        float g = f/2;
        float h = (d+e);
        float i = h/2;


        System.out.println("학생번호1");
        System.out.println("국어점수 :"+b);
        System.out.println("수학점수 :"+c);

        System.out.println("학생번호2");
        System.out.println("국어점수 :"+d);
        System.out.println("수학점수 :"+e);

        System.out.println("학생번호1");
        System.out.print("국어:"+b+" 수학:"+c+" 평균:"+g+"\n");

        System.out.println("학생번호2");
        System.out.print("국어:"+d+" 수학:"+e+" 평균:"+i);

        
    }

    
}