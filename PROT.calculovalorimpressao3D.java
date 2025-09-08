public class Teste {
    public static void main(String[] args) {
         java.util.Scanner leitor = new java.util.Scanner(System.in);
        
        System.out.println("Digite a largura");
        double x = leitor.nextDouble();

        System.out.println("Digite a altura");
        double y = leitor.nextDouble();

        System.out.println("Digite a profundidade");
        double z = leitor.nextDouble();

        double volume = x * y * z / 3;
        System.out.printf("O volume da peça é de: %.2f%n", volume);

        if (volume < 50) {
            System.out.println("Peça de pequeno porte");
        } else if (volume <= 150) {
            System.out.println("Peça de médio porte");
        } else {
            System.out.println("Peça de grande porte");
               }

        System.out.println("Há risco? 1 - Sim / 2 - Não");
        int resposta = leitor.nextInt();

        if (resposta == 1) {
            volume = volume * 1.2; // Aumenta 20% no volume
        }

                if (volume < 50) {
                    System.out.println("Valor final será de até R$ 45,00");
                } else if (volume <= 150) {
                    System.out.println("Valor final será de até R$ 105,00");
                } else {
                    System.out.println("Valor final será maior que R$ 120,00");
                }

        leitor.close();
    }
}
