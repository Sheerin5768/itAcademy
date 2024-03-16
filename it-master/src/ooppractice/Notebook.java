package ooppractice;

public class Notebook {
    char[] sticker;
    HardDrive[] hardDrive;
    OperatingSystem operatingSystem;
    Processor processor;
    RandomAccessMemory randomAccessMemory;

    public Notebook(
            HardDrive[] hardDrive,
            OperatingSystem operatingSystem,
            Processor processor,
            RandomAccessMemory randomAccessMemory,
            char[] sticker)
    {
        this.hardDrive = hardDrive;
        this.operatingSystem = operatingSystem;
        this.processor = processor;
        this.randomAccessMemory = randomAccessMemory;
        this.sticker= sticker;

    }

    public void setHardDrive(HardDrive[] hardDrive) {
        this.hardDrive =hardDrive;
    }

    public HardDrive[] getHardDrive() {
        return hardDrive;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setRandomAccessMemory(RandomAccessMemory randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
    }

    public RandomAccessMemory getRandomaccessMemory() {
        return randomAccessMemory;
    }
    public void setSticker(char [] sticker) {
        this.sticker =sticker;
    }
    public char[] getSticker() {
        return sticker;
    }
    @Override
    public String toString () {
        String message = "OperatingSystem: " + getOperatingSystem().getName() + " Version:" + getOperatingSystem().getVersion()
                       + "Proccesor: " + getProcessor().getModel() + "NumberCores:" + getProcessor().getNumberCores()
                       + "RandomAccessMemory: " + getRandomaccessMemory().getModel() + "Size: " + getRandomaccessMemory().getSize();
        return message;

    }


}

