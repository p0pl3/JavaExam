package Bilet28_SumNums;

public class SumNumber {
    public static int sum(int num){
        if (num==0)
            return 0;
        else
            return num%10 + sum(num/10);
    }

    public static void main(String[] args) {
        int a = 100000;
        System.out.println(sum(a));
    }
}
