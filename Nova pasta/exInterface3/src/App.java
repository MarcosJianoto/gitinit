import devices.Printer;
import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class App {
    public static void main(String[] args) throws Exception {

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter!");
        p.print("My Letter");

        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My e-mail");
        System.out.println("Scan result: " + s.scan());

        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My Dissertation");
        c.print("Joao");
        System.out.println("Scan result: " + c.scan());

    }
}
