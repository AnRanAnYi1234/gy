<<<<<<< HEAD
public class StudentTest {
    public static void main(String[] args) {
        Student zs = new Student();
        zs.naem = "zhangsan";
        zs.age = 25;
        zs.address = "贵州贵阳";

        zs.study();
        zs.sayHi();

        Student ls = new Student();
        ls.naem = "lsshi";
        ls.age = 22;
        ls.address = "贵州遵义";
        ls.study();
        ls.sayHi();

        Student ww = new Student();
        ww.sayHi();
=======
package day07;

public class StudentTest {
    public static void main(String[] args) {
        // 创建一个学生对象
        Student zs = new Student();
        zs.name = "张三";
        zs.age = 18;
        zs.gender = "男";
        zs.address = "北京市";
        // 调用方法
        zs.sayHi();
        zs.study();

        Student ls = new Student();
        ls.name = "李四";
        ls.age = 19;
        ls.gender = "女";
        ls.address = "上海市";
        ls.sayHi();
        ls.study();

>>>>>>> 6e2e8c0a11ef067eafd55b7f5ed0bd3a824d2865
    }
}
