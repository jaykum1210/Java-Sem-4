import java.util.*;

public class Average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        float f = (float)(a+b+c+d+e)/5;
        System.out.println("Average = " + f);
    }
}