package BlockChain;


/**
 *
 * @author Fernando Santana Pereira
*/



public class BlockMain {

    
    
    public static void main(String[] args) {
       
      
        System.out.println("Bem-vindo! Para cadastrar uma pessoa, digite as seguintes informações:");
        System.out.println("Nome, Data de Nascimento, Cidade, Estado e País.");
        
        System.out.println("");
        
        Bloco pessoaa = new Bloco();
        Bloco pessoab = new Bloco();
        Bloco pessoac = new Bloco();
        Bloco pessoad = new Bloco();
        Bloco pessoae = new Bloco();
       
      
        pessoaa.adicionar("Fernando, 07/09/1997, 114.218.369-63, Castro, Paraná, Brasil");
       
        
        pessoab.adicionar("Maria, 22/11/1995, 258.369.548-77, Ipiranga, Paraná, Brasil");
        
        
        pessoac.adicionar("Pedro, 13/02/2001, 158.354.852-45, Ponta Grossa, Paraná, Brasil");
        
        
        pessoad.adicionar("Brenda, 10/06/2001, 147.254.365-87, Ponta Grossa, Paraná, Brasil");
     
        
        pessoae.adicionar("Cleison, 14/05/1970, 156.372.482-35, Palmeira, Paraná, Brasil");
      
        
        System.out.println("---------BLOCO 1---------");
        
        System.out.println("As transações desse bloco são: " + pessoaa.get(0).getValor());
        System.out.println("A hash desse bloco é " + pessoaa.get(0).getValor().hashCode());
        
        System.out.println("");
        
        System.out.println("---------BLOCO 2---------");
        
        System.out.println("**********************");
        System.out.println("As transações do segundo bloco são: " + pessoab.get(0).getValor());
        System.out.println("A semente desse bloco é: " + pessoaa.get(0).getValor().hashCode());
        System.out.println("A hash desse bloco é: " + pessoaa.get(0).getValor().hashCode() * pessoab.get(0).getValor().hashCode());
       
        System.out.println("");
        
        System.out.println("---------BLOCO 3---------");
        System.out.println("As transações do segundo bloco são: " + pessoac.get(0).getValor());
        System.out.println("A semente desse bloco é: " + pessoaa.get(0).getValor().hashCode() * pessoab.get(0).getValor().hashCode());
        System.out.println("A hash desse bloco é: " + pessoaa.get(0).getValor().hashCode() * pessoab.get(0).getValor().hashCode() * 
                + pessoac.get(0).getValor().hashCode());
        
        System.out.println("");
        
        System.out.println("---------BLOCO 4---------");
        System.out.println("As transações do segundo bloco são: " + pessoad.get(0).getValor());
        System.out.println("A semente desse bloco é: " + + pessoaa.get(0).getValor().hashCode() * pessoab.get(0).getValor().hashCode() * 
                + pessoac.get(0).getValor().hashCode());
        System.out.println("A hash desse bloco é: " + + pessoaa.get(0).getValor().hashCode() * pessoab.get(0).getValor().hashCode() * 
                + pessoac.get(0).getValor().hashCode() * pessoad.get(0).getValor().hashCode()); 
        
        System.out.println("");
        
        System.out.println("---------BLOCO 5---------");
        System.out.println("As transações do segundo bloco são: " + pessoae.get(0).getValor());
        System.out.println("A semente desse bloco é: " + + pessoaa.get(0).getValor().hashCode() * pessoab.get(0).getValor().hashCode() * 
                + pessoac.get(0).getValor().hashCode() * pessoad.get(0).getValor().hashCode());
        System.out.println("A hash desse bloco é: " + + pessoaa.get(0).getValor().hashCode() * pessoab.get(0).getValor().hashCode() * 
                + pessoac.get(0).getValor().hashCode() * pessoad.get(0).getValor().hashCode() * pessoae.get(0).getValor().hashCode());
        
        
    }
    
}
