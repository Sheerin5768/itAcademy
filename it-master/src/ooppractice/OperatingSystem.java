package ooppractice;


public class OperatingSystem {
    String name;
    double version;

    public OperatingSystem(String name, double version) {
        this.name = name;
        this.version = version;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public double getVersion() {
        return version;
    }
    @Override
    public String toString() {
        String message = "Name:" + getName() +
                "\nVersion:" + getVersion();
        return message;
    }
}



