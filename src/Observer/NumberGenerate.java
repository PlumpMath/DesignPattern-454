package Observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by hadoop on 17-5-1.
 * 表示生成数字对象的抽象类(观察对象)
 */
public abstract class NumberGenerate {
    private ArrayList observers = new ArrayList();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator it = observers.iterator();
        while (it.hasNext()) {
            Observer observer = (Observer) it.next();
            observer.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();

}
