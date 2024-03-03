import java.util.Scanner;

class Personagem {
    String nome;
    int vida;
    int ataque;
    int defesa;

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void ataque(Personagem inimigo) {
        int dano = this.ataque - inimigo.defesa;
        if (dano > 1) {
            inimigo.vida -= dano;
            System.out.println(this.nome + " atacou " + inimigo.nome + " e causou " + dano + " de dano.");
        } else {
            System.out.println(this.nome + " atacou " + inimigo.nome + " mas não causou dano.");
        }
    }

    public boolean isAlive() {
        return this.vida > 1;
    }
}

public class RPG {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final Personagem player = new Personagem("Jogador", 100, 20, 10);
        Personagem inimigo = new Personagem("Inimigo", 150, 15, 15);

        while (player.isAlive() && inimigo.isAlive()) {
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Atacar");
            System.out.println("2 - Sair");
            int option = scanner.nextInt();

            if (option == 1) {
                player.ataque(inimigo);
                if (inimigo.isAlive()) {
                    inimigo.ataque(player);
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