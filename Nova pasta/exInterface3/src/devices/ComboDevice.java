package devices;

public class ComboDevice extends Device implements Scanner, Printer {

    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void print(String Doc) {
        throw new UnsupportedOperationException("Unimplemented method 'print'");
    }

    @Override
    public String scan() {
        throw new UnsupportedOperationException("Unimplemented method 'scan'");
    }

    @Override
    public void processDoc(String doc) {
        throw new UnsupportedOperationException("Unimplemented method 'processDoc'");
    }

}
