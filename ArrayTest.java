package cn.chilon.www.shiyan;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args){
        double[] arr=new double[5]; //定义一个长度为五的双精度数组
        double sum=0D;
        Scanner cx=new Scanner(System.in); //赋值语句，从键盘上捕获值，并赋给数组
        System.out.println("请输入会员本月的消费记录");
        for(int i=0;i<arr.length;i++)//循环语句，为数组循环赋值
        {
            System.out.println("请输入第"+(i+1)+"笔金额");
            arr[i]=cx.nextDouble();

        }
        for(int i=0;i<arr.length;i++)//循环语句，循环输出五笔购物金额
        {
            sum +=arr[i];
            System.out.println("输入的第"+(i+1)+"比金额为：");//输出语句，分别输出五笔金额
            System.out.println(arr[i]);

        }
        System.out.println("所有金额的总和："+sum);//输出语句，输出五笔金额的总金额
    }
}

