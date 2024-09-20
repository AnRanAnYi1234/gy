package day07;

public class Student {
    String name;
    int age;
    String gender;
    String address;

    void study() {
        System.out.println(name +"在学习...");
    }
    void sayHi() {
        System.out.println("大家好,我叫"+name+",今年"+age+"岁了,性别:"+gender+",家住"+address);
    }
}
