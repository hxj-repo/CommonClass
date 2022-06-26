public class JavaArray {

    public static void main(String[] args) {
        String[] str = {"hello", "world", "hi"}; //创建数组
        int[] num2 = new int[2]; // 动态创建数组
        num2[0] = 5;
        num2[1] = 6;

        // 循环方法

        // 普通for循环
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

        // 无下标的for-each循环
        for (String s: str) {
            System.out.println(s);
        }


    }
}
