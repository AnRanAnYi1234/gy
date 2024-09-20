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
    }
}
