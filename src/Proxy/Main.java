package Proxy;

/**
 * Created by hadoop on 17-5-1.
 * 代理模式测试
 */
public class Main {
    public static void main(String[] args) {

        Printable p = new PrinterProxy("Alice");
        System.out.println("现在的名字是： " + p.getPrinterName() + "。");
        p.setPrinterName("Bob");
        System.out.println("现在的名字是： " + p.getPrinterName() + "。");
        p.print("Hello World!");

        Printable printable = new PrinterProxy();
        System.out.println("现在的名字是： " + printable.getPrinterName() + "。");
        printable.print("test msg");
        printable.setPrinterName("Adam");
        printable.print("Adam test");
    }
}
