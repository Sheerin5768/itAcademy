package ooppractice;

public class RandomAccessMemory {
    double size;
    String model;
    public RandomAccessMemory ( double size, String model) {
        this.size = size;
        this.model = model;
    }
    public void setSize ( double size ) {
        this.size = size;
    }
    public  double getSize () {
        return size;
    }
    public void setModel ( String model ) {
        this.model = model;
    }
    public String getModel ( ) {
        return model;
        @Override
                public String toString() {
            String message = "Size:" + getSize() +
                    "\nModel:" + getModel();
            return message;
        }
    }

}
