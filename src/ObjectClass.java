import java.util.Objects;

public class ObjectClass {

    public static void main(String[] args) {
        Animal cat = new Animal("cat", 3);
        Animal dog = new Animal("dog", 4);
        Animal cat2 = new Animal("cat", 3);
        Class cla = cat.getClass();
        System.out.println(cla); // 打印class Test.Animal
        System.out.println(cat.toString()); // 重写的toString方法，打印Animal{name='cat', age=3}
        System.out.println(cat.equals(cat2)); // true，重写的equals()方法，比较两个对象是否一致
        System.out.println(cat.hashCode()); // 重写hashCode方法，打印对象属性的哈希值
        try {
            Animal dog2 = (Animal) dog.clone();
            System.out.println(dog2); // 浅拷贝，打印Animal{name='dog', age=4}
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
