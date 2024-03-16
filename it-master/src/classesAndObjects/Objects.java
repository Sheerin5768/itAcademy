package classesAndObjects;

public class Objects {
    public static void main (String[] args) {
        Computer computerOne = new Computer();
        computerOne.screen = "TN";
        computerOne.columns = 2;
        computerOne.keyboard = "SteelSeries Apex Pro TKL";
        computerOne.mouse = "SteelSeries";
        computerOne.color = "BLACK";
        computerOne.price = 568000;
        computerOne.model = "Mac";
        computerOne.producerCountry = "China";

        System.out.println(computerOne.screen + " "
                      +computerOne.columns + " "
                      +computerOne.keyboard + " "
                      +computerOne.mouse + " "
                      +computerOne.color + " "
                      +computerOne.price + " "
                      +computerOne.model + " "
                      +computerOne.producerCountry + " "
        );

    }
}
