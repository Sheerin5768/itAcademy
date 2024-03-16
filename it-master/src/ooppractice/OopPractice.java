package ooppractice;

public class OopPractice {
    public static void main(String[] args) {
        HardDrive hardDrive = new HardDrive(23, 104);
        HardDrive hardDrive1 = new HardDrive(15, 309);
        HardDrive [] hardDriveArray = new HardDrive[]{ hardDrive, hardDrive1};
        OperatingSystem operatingSystem = new OperatingSystem("SHEERIN", 17.9);
        Processor processor = new Processor("SHRMW", 67);
        RandomAccessMemory randomAccessMemory = new RandomAccessMemory(45, "SHRLACS");
        char[] stickers = new char[]{'o', 'q','u', 'h', 's'};
        Notebook notebook = new Notebook (hardDriveArray, operatingSystem, processor, randomAccessMemory, stickers);
       System.out.println(notebook);
        HardDrive newHD =new HardDrive(1098, 4000);
        OperatingSystem newOS = new OperatingSystem ( "POP", 19.8 );
        Processor newProcessor = new Processor( "PRVX", 5);
        RandomAccessMemory newRAM = new RandomAccessMemory( 67.9, "AQUW");
    }

    public static void printNoteBookInfo(Notebook notebook) {
        System.out.println(notebook);
        for (int i = 0; i < notebook.getHardDrive().length; i++) {
            System.out.println("\nHardDrive - size: " + notebook.getHardDrive()[i].getSize()
                    + "; speed: " + notebook.getHardDrive()[i].getSpeed());
            for ( char j = 0; j < notebook.getSticker().length; j++) {
                System.out.println("\nStickers - " + notebook.getSticker()[j]);
            }
        }

        System.out.println("\nOperating system - name: " + notebook.getOperatingSystem().getName()
                + "; version: " + notebook.getOperatingSystem().getVersion()
                + "\nProcessor - model: " + notebook.getProcessor().getModel()
                + ": numberCores: " + notebook.getProcessor().getNumberCores()
                + "\nRandomAccessMemory- size: " + notebook.getRandomaccessMemory().getSize()
                + "; model: " + notebook.getRandomaccessMemory().getModel());

    }
}


