public class StringClass {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Hello World!";
        System.out.println(str1.compareTo(str2)); // -1
        System.out.println(str1.concat("abc")); // Hello Worldabc
        System.out.println(str1.equals("Hello World")); // true
        System.out.println(str1.length()); // 11
        System.out.println(str1.charAt(3)); // l
        System.out.println(str1.indexOf('W')); // 6
        System.out.println("hello ".trim()); // hello
    }
}
