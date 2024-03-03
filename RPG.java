import java.util.Scanner;

class Character {
    String name;
    int health;
    int attack;
    int defense;

    public Character(String name, int health, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    public void attack(Character enemy) {
        int damage = this.attack - enemy.defense;
        if (damage > 0) {
            enemy.health -= damage;
            System.out.println(this.name + " atacou " + enemy.name + " e causou " + damage + " de dano.");
        } else {
            System.out.println(this.name + " atacou " + enemy.name + " mas não causou dano.");
        }
    }

    public boolean isAlive() {
        return this.health > 0;
    }
}

public class RPG {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final Character player = new Character("Jogador", 100, 20, 10);
        Character enemy = new Character("Inimigo", 50, 10, 5);

        while (player.isAlive() && enemy.isAlive()) {
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Atacar");
            System.out.println("2 - Sair");
            int option = scanner.nextInt();

            if (option == 1) {
                player.attack(enemy);
                if (enemy.isAlive()) {
                    enemy.attack(player);
                }
            } else {
                break;
            }
        }

        if (player.isAlive()) {
            System.out.println("Parabéns, você venceu!");
        } else {
            System.out.println("Você perdeu, tente novamente!");
        }

        scanner.close();
    }
}