package Proxy;

/**
 * Created by hadoop on 17-5-1.
 */
public interface Printable {
    public abstract void setPrinterName(String name);
    public abstract String getPrinterName();
    public abstract void print(String string);
}
