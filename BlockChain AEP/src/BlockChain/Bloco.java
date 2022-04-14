
package BlockChain;

/**
 *
 * @author Fernando Santana Pereira
 */
public class Bloco {
    private Informacao primeiro;
    private Informacao ultimo;
    private int tamanho;
    
    
    public Bloco(){
        this.tamanho = 0;
    }

    public Informacao getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Informacao primeiro) {
        this.primeiro = primeiro;
    }

    public Informacao getUltimo() {
        return ultimo;
    }

    public void setUltimo(Informacao ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public void adicionar(String novoValor){
       
        Informacao novoInformacao = new Informacao(novoValor);
       
        if (this.primeiro == null && this.ultimo == null){
            this.primeiro = novoInformacao;
            this.ultimo = novoInformacao;
            tamanho++;
        }else{
            this.ultimo.setProximo(novoInformacao);
            this.ultimo = novoInformacao;
        }
        
    }
    
    public Informacao get(int posicao){
        Informacao atual = this.primeiro;
        for(int i=0; i < posicao; i++){
            if (atual.getProximo() != null){
                atual = atual.getProximo();  
            }
        }
    return atual;
    }

    
}
