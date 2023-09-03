package Core;

import Abstractions.ItemGenerator;
import Rewards.Gold.GoldGenerator;
import Rewards.Diamond.DiamondGenerator;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Core {
    public void run() {
        List<ItemGenerator> generatorList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        ItemGenerator myGenerator;
        int i = 0;
        while (true) {

            Random random = new Random();
            int randomNumber = random.nextInt(10);

            generatorList.add(randomNumber < 7 ? new GoldGenerator() : new DiamondGenerator());

            myGenerator = generatorList.get(i);

            System.out.println("Забирай награду: " + myGenerator.openReward());
            System.out.println();

            System.out.print("Продолжить (Y/N)? ");

            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }
            System.out.println();

            i++;
        }
    }
}
