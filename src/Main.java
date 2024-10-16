import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Taffe taffe = new Taffe();
        String fala = taffe.dizerOi();
        System.out.println(fala);

        taffe.falar("Gremio melhor que inter");
        taffe.falar("Aprendendo Classes em Java");
        taffe.andar(10,false);
        taffe.andar(34, true);
        taffe.retornaPoicao();

        Taffe patrick = new Taffe();
        patrick.andar(10,false);
        patrick.retornaPoicao();

        }
    }
