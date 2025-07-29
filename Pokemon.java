public class Pokemon {
    private int id;
    private String name;
    private String type1;
    private String type2;
    private int total, hp, attack, defense, spAtk, spDef, speed, generation;
    private boolean isLegendary;

    public Pokemon(int id, String name, String type1, String type2, int total, int hp,
                   int attack, int defense, int spAtk, int spDef, int speed,
                   int generation, boolean isLegendary) {
        this.id = id;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.total = total;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.speed = speed;
        this.generation = generation;
        this.isLegendary = isLegendary;
    }

    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Type 1: " + type1);
        System.out.println("Type 2: " + (type2.isEmpty() ? "None" : type2));
        System.out.println("HP: " + hp);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defense);
        System.out.println("Sp. Atk: " + spAtk);
        System.out.println("Sp. Def: " + spDef);
        System.out.println("Speed: " + speed);
        System.out.println("Generation: " + generation);
        System.out.println("Legendary: " + isLegendary);
    }
}
