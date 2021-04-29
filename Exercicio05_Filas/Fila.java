
package Exercicio05_Filas;

/**
 *
 * @author jownao
 */
public class Fila <T> {
    
    private Celula primeiro;
    
    private Celula ultimo;
    
    private int quantidadeElementos;
    
    //Construtor padr�o
    public Fila(){
        this.primeiro = null;
        this.ultimo = null;
        this.quantidadeElementos = 0;
    }
    //Adiciona um elemento no fim da fila
    public void Inserir(T elemento){
        Celula nova = new Celula(elemento);
        if (this.quantidadeElementos == 0){
            primeiro = nova;
            ultimo = nova;
            this.quantidadeElementos += 1;
        } else{
            ultimo.setProxima(nova);
            ultimo = nova;
            this.quantidadeElementos += 1;
        }
    }
    //Verifica se o dado existe no in�cio da fila
    public boolean existeDado(T elemento){
        if(this.quantidadeElementos == 0){
            throw new IllegalArgumentException("A fila n�o possue dados ");
        } else if (this.primeiro.getElemento() == elemento ) {
            return true;
        } else {
            return false;
        }
    }
    //Verifica se a fila est� vazia
    public boolean isEmpty(){
        return this.primeiro == null;
    }
    //Recupera o objeto do in�cio da fila, n�o remove
    @SuppressWarnings("unchecked")
	public T Recuperar(){
        if(this.quantidadeElementos == 0){
            throw new IllegalArgumentException("A fila n�o possue dados ");
        } else {
        	return (T) this.primeiro.getElemento();
        }
    }
    //Altera o valor do objeto do in�cio da fila
    public void Alterar(T elemento){
        Celula nova = new Celula(elemento);
         if(this.quantidadeElementos == 0){
            throw new IllegalArgumentException("A fila n�o possue dados ");
        } else if (quantidadeElementos == 1){
            primeiro.setProxima(null);
            primeiro = nova;
            ultimo = nova;
        } else {
            Celula proxima = primeiro.getProxima();
            primeiro.setProxima(null);
            primeiro = nova;
            primeiro.setProxima(proxima);
        }
    }
    //Remove o objeto do in�cio da fila
    public void Remover(){
        if(this.quantidadeElementos == 0){
            throw new IllegalArgumentException("A fila n�o possue dados ");
        } else if (quantidadeElementos == 1){
            primeiro = null;
            ultimo = null;
            this.quantidadeElementos = 0;
        } else {
            Celula proxima = primeiro.getProxima();
            primeiro.setProxima(null);
            primeiro = proxima;
            this.quantidadeElementos-=1;
        }
    }
    //Retorna o tamanho da fila (quantidade de elementos inseridos)
    public int tamanho(){
        return quantidadeElementos;
    }
    //Exclui todos os elementos da fila
    public void limpa(){
        if (this.quantidadeElementos == 0){
            throw new ArrayIndexOutOfBoundsException("Lista j� est�vazia!");
        } else{
            primeiro = null;
            ultimo = null;
            quantidadeElementos=0;
        }
    }
}
