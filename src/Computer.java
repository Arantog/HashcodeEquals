import java.util.Objects;

public class Computer {
    private String processor;
    private double ram;
    private String serialNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Double.compare(computer.ram, ram) == 0 &&
                Objects.equals(processor, computer.processor) &&
                Objects.equals(serialNumber, computer.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, serialNumber);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    public Computer(String processor, double ram, String serialNumber) {
        this.processor = processor;
        this.ram = ram;
        this.serialNumber = serialNumber;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
