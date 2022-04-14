
package BlockChain;

/**
 *
 * @author Fernando Santana Pereira
 */
public class Informacao {
    private String valor;
    private Informacao proximo;
   
    
    public Informacao(String novoValor){
        this.valor = novoValor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Informacao getProximo() {
        return proximo;
    }

    public void setProximo(Informacao proximo) {
        this.proximo = proximo;
    }
    
    
    
    
    
}
