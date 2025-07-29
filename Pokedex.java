import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pokedex {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a Pokémon name or ID: ");
        String search = inputScanner.nextLine().trim();
        boolean found = false;

        try {
            File file = new File("pokemon-1.csv");
            Scanner fileScanner = new Scanner(file);

            if (fileScanner.hasNextLine()) {
                fileScanner.nextLine(); // Skip header
            }

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                String type1 = parts[2];
                String type2 = parts[3];
                int total = Integer.parseInt(parts[4]);
                int hp = Integer.parseInt(parts[5]);
                int attack = Integer.parseInt(parts[6]);
                int defense = Integer.parseInt(parts[7]);
                int spAtk = Integer.parseInt(parts[8]);
                int spDef = Integer.parseInt(parts[9]);
                int speed = Integer.parseInt(parts[10]);
                int generation = Integer.parseInt(parts[11]);
                boolean isLegendary = Boolean.parseBoolean(parts[12]);

                Pokemon p = new Pokemon(id, name, type1, type2, total, hp, attack,
                        defense, spAtk, spDef, speed, generation, isLegendary);

                if (name.equalsIgnoreCase(search) ||
                        Integer.toString(id).equals(search)) {
                    p.printInfo();
                    found = true;
                    break;
                }
            }

            fileScanner.close();

            if (!found) {
                System.out.println("Pokémon not found!");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: pokemon-1.csv");
            e.printStackTrace();
        }
    }
}
