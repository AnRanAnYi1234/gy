package day06;
import java.util.Scanner;
/* 
 * 猜字符游戏
 * 1.设计数据结构:变量
 * 1)char[] chs; //随机字符数组 
   2)char[] input; //用户输入的字符数组
   3)int letterRight; //字符对个数
    int positionRight;/ /位置对个数
    int[] result;//对比结果
    4)int score;//得分
    
    2.设计程序结构:方法
    1)初始化数据: 生产随机字符数组,初始化变量  
    2)游戏开始 对比: 对比字符数组,统计字符对个数和位置对个数 
    3)游戏结束
    3.设计算法:方法体

 */
public class GuessChar {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      char[] chs = generate();
      System.out.println(chs);
      int conut = 0;
      while ((true)) {
        System.out.println("请输入5个大写字母:");
        String str = scan.next();
        if(str.equals("EXIT")){
          System.out.println("退出游戏");
          break;
        }
        char[] input = str.toCharArray();
        int[] result = check(chs,input);
        if(result[0]==chs.length){
          int score = 100*chs.length-10*conut;
          System.out.println("恭喜你猜对了!,得分:"+score+"分");
          break;
        }else {
          conut++;
          System.out.println("字符对个数:"+result[1]+",位置对个数:"+result[0]);
        }
      }
    }
    // 生成随机字符数组chs并不能重复
    public static char[] generate() {
      char [] chs = new char[5];
      char[] letters = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
      boolean [] flags = new boolean[letters.length];
      // 随机生成5个字符
      for (int i = 0; i < chs.length; i++) {
        int index;
        do{
           index = (int) (Math.random() * letters.length);
        }while(flags[index]==true);
        chs[i]  = letters[index];  
        flags[index] = true;      
      }
      return chs;
    }
    // 对比字符数组
    public static int[] check(char[] chs,char[] input) {
      int[] result = new int[2];// 对比结果(0:位置对个数,1:字符对个数)
      // 统计字符对个数
      // 统计位置对个数
     for (int i = 0; i < chs.length; i++) {  // 遍历随机字符数组
        for (int j = 0; j < input.length; j++) {  // 遍历用户输入的字符数组
          if (chs[i] == input[j]) { // 字符对
            result[1]++; // 字符对个数+1
            // 字符对是判断位置对的前提
            if (i == j) { // 位置对
              result[0]++; // 位置对个数+1
            }
            break; // 跳出内层循环
          }
        }
      }
      return result;
    }
}
