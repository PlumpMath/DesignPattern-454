package FactoryMethod;

/**
 * Created by hadoop on 17-4-30.
 * 测试函数
 */
public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小亮");
        card1.use();
        card2.use();
        card3.use();
    }
}
