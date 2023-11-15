import java.util.Random;

public class Arvore {

public static void main(String[] args) {
    NoArvore raiz = new NoArvore();
    Random random = new Random();

       
    for (int i = 0; i < 20; i++) {
        int numeroSorteado = random.nextInt(101);
        raiz = raiz.Insere(raiz, numeroSorteado);
    }

    System.out.println("Impressão em Pré-Ordem:");
    raiz.Imp_Cres(raiz);

    System.out.println("\nImpressão em In-Ordem:");
    raiz.Imp_Cres(raiz);

    System.out.println("\nImpressão em Pós-Ordem:");
    raiz.Imp_Cres(raiz);

    System.out.println("\nImpressão em Nível:");
    raiz.Imp_Nivel(raiz);

    // Retirar 5 elementos da árvore
    for (int i = 0; i < 5; i++) {
        int numeroRemover = random.nextInt(101);
        raiz = raiz.Retira(raiz, numeroRemover);
    }

    System.out.println("\nÁrvore após remoção de 5 elementos:");

    System.out.println("Impressão em Pré-Ordem:");
    raiz.Imp_Cres(raiz);

    System.out.println("\nImpressão em In-Ordem:");
    raiz.Imp_Cres(raiz);

    System.out.println("\nImpressão em Pós-Ordem:");
    raiz.Imp_Cres(raiz);

    System.out.println("\nImpressão em Nível:");
    raiz.Imp_Nivel(raiz);
    }
}
