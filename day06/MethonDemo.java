package day06;
// 方法演示
public class MethonDemo {
    public static void main(String[] args) {
        sayHello();
        sayHi("龚毅");
    }

    // 定义一个方法，方法名为sayHello，方法没有参数，方法没有返回值
    public static void sayHello() {
        System.out.println("Hello World! 我是gongyi,今年57岁了");
    }

    // 定义一个方法，方法名为sayHi，方法有参数，方法没有返回值
    public static void sayHi(String name) {
        System.out.println("Hello,大家好!我是" + name +  ",今年57岁了");
    }
    public static void sayHi(String name,int age) {
        System.out.println("Hello,大家好!我是" + name +  ",今年" + age + "岁了");
    }
}
