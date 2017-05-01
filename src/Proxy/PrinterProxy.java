package Proxy;

/**
 * Created by hadoop on 17-5-1.
 */
public class PrinterProxy implements Printable {
    private String name;
    private Printer realPrinter;

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if(realPrinter != null) {
            realPrinter.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public void print(String string) {
        realize();
        realPrinter.print(string);
    }

    private synchronized void realize() {
        if (realPrinter == null) {
            if (name == null) {
                realPrinter = new Printer();
            } else {
                realPrinter = new Printer(name);
            }
        }
    }
}
