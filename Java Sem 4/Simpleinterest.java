import java.util.*;

public class Simpleinterest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        float a = (float)(p*r*t)/100;
        System.out.println("Simple Interest = "+ a);
    }
}