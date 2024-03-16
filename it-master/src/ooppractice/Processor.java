package ooppractice;

public class Processor {
    String model;
    int numberСores;
    double frequency;

    public Processor(String model, int numberСores) {
        this.model = model;
        this.numberСores = numberСores;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumberСores(int numberСores) {
        this.numberСores = numberСores;
    }

    public double getNumberCores() {
        return numberСores;
    }

    public String getModel() {
        return model;
        @Override
                public String toString() {
            String message = "Model:" + getModel() +
                    "\nNumberCores:" + getNumberCores();
            return message;
        }
    }
}
