public class Main {
    public static void main(String[] args) {
        // Criando o nó raiz da árvore com 3 filhos
        arvoreGenerica raiz = new arvoreGenerica(3);

        // Definindo o dado da raiz
        raiz.setDado("Raiz");

        // Criando e definindo os filhos da raiz
        arvoreGenerica filho1 = new arvoreGenerica(2); // Filho 1 com 2 filhos
        arvoreGenerica filho2 = new arvoreGenerica(0); // Filho 2 sem filhos
        arvoreGenerica filho3 = new arvoreGenerica(1); // Filho 3 com 1 filho

        // Definindo os dados dos filhos
        filho1.setDado("Filho 1");
        filho2.setDado("Filho 2");
        filho3.setDado("Filho 3");

        // Adicionando os filhos à raiz
        raiz.setFilho(0, filho1);
        raiz.setFilho(1, filho2);
        raiz.setFilho(2, filho3);

        // Definindo os filhos do "Filho 1"
        arvoreGenerica neto1 = new arvoreGenerica(0); // Neto 1 (sem filhos)
        arvoreGenerica neto2 = new arvoreGenerica(0); // Neto 2 (sem filhos)

        neto1.setDado("Neto 1");
        neto2.setDado("Neto 2");

        filho1.setFilho(0, neto1);
        filho1.setFilho(1, neto2);

        // Definindo o filho do "Filho 3"
        arvoreGenerica neto3 = new arvoreGenerica(0); // Neto 3 (sem filhos)
        neto3.setDado("Neto 3");

        filho3.setFilho(0, neto3);

        // Exibindo a estrutura da árvore
        System.out.println("Dado da raiz: " + raiz.getDado());
        System.out.println("Filho 1 da raiz: " + raiz.getFilho(0).getDado());
        System.out.println("Filho 2 da raiz: " + raiz.getFilho(1).getDado());
        System.out.println("Filho 3 da raiz: " + raiz.getFilho(2).getDado());

        System.out.println("Neto 1 do Filho 1: " + raiz.getFilho(0).getFilho(0).getDado());
        System.out.println("Neto 2 do Filho 1: " + raiz.getFilho(0).getFilho(1).getDado());

        System.out.println("Neto 3 do Filho 3: " + raiz.getFilho(2).getFilho(0).getDado());
    }
}
