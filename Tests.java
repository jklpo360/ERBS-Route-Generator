import java.util.Arrays;

public class Tests {

    public static void main(String args[]) {

        Item[] accessories = Constants.ACCESSORIES;

        // for (int i = 0; i < Constants.DICTIONARY.length; i++) {
        // System.out.println(Constants.DICTIONARY[i]);
        // }

        // System.out.println("***********************************");

        for (int i = 0; i < accessories.length; i++) {
            System.out.println("\t\t" + accessories[i].name);
            for (int j = 0; j < accessories[i].components.length; j++) {
                System.out.println(Constants.DICTIONARY[(int) accessories[i].components[j]]);
            }
        }

    }

}
