import java.util.Scanner;

public class Hello{
    public static void main(String[] args) {
       System.out.println("龚毅,hello word");
       System.out.println(5%2);
       System.out.println(6%2);
       System.out.println(2%5);

       Scanner scanner = new Scanner(System.in);
       System.out.println("请输入您的名字:");
       String name = scanner.nextLine();

       System.out.println("请输入您的年龄:");
       int age = scanner.nextInt();
       scanner.close();
       System.out.println(name);
       System.out.println(age);
       
       if(age%2==0){
        System.out.println(age+"是个偶数");      

       }else{
        System.out.println(age+"是个奇数");

       }
   }
}