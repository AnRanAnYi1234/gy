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

    }
}
