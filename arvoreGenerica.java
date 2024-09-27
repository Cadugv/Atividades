//Classe para uma árvore genérica em Java
public class arvoreGenerica
{
    //dado do nó	
    private Object dado;
        
    //Vetor de nós para os filhos desse nó
        private arvoreGenerica[] filhos;	
        
        //Construtor que inicia uma árvore nula
        public arvoreGenerica( ) {
            this(0);
        }
    
        //Construtor da classe que recebe a quantidade de filhos
        public arvoreGenerica (int n_filhos) {
            this.dado = null;
            this.filhos = new arvoreGenerica[n_filhos];
            for(int i = 0; i < n_filhos; i++)
                filhos[i] = null;
        }
    
        //Retorna o dado da raiz
        public Object getDado() {
            return dado;
        }
    
        //Retorna o nó de um dos filhos da raiz de índice i
        public arvoreGenerica getFilho(int i) {
            return filhos[i];
        }
        
        //Configure o dado da raiz com uma informação recebida
        public void setDado(Object novo_dado) {
            this.dado = novo_dado;
        }
        
        //Configura o dado de um dos filhos da raiz
        public void setFilho(int i, arvoreGenerica no) {
            this.filhos[i] = no;
        }
    }