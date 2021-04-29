
package Exercicio05_Filas;

/**
 *
 * @author jownao
 */
public class Main {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Johnny");
        Pessoa p2 = new Pessoa("Paulo Vitor");
        Pessoa p3 = new Pessoa("Paulo Gustavo");
        Pessoa p4 = new Pessoa("Juliana");
        Pessoa p5 = new Pessoa("Luiz Gustavo");
        Pessoa p6 = new Pessoa("Jennifer");
        Pessoa p7 = new Pessoa("Marques");
        Pessoa p8 = new Pessoa("Victoria");
        
        //Construtor padr�o
        Fila<Pessoa> fila = new Fila<Pessoa>();
        
        //Verifica se a Fila esta vazia
        System.out.println("A fila est� vazia ? "+fila.isEmpty());
        System.out.println("Instanciando 8 pessoas...\n");
        //Adiciona um elemento no fim da Fila
        fila.Inserir(p1);
        System.out.println(fila);
        fila.Inserir(p2);
        fila.Inserir(p3);
        fila.Inserir(p4);
        fila.Inserir(p5);
        fila.Inserir(p6);
        fila.Inserir(p7);
        fila.Inserir(p8);
        
        //Verificando se cont�m dado elemento no in�cio fila
        System.out.println("Existe dado 1: "+fila.existeDado(p1));
        //Sem ser in�cio
        System.out.println("Existe dado 6: "+fila.existeDado(p6));
        System.out.println();
        //Recupera o objeto do in�cio da Fila, n�o o remove;
        System.out.println(fila.Recuperar());
        
        //Alterando o dado do in�cio da fila
        fila.Alterar(p6);
        System.out.println(fila.Recuperar());
        
        //Removendo o dado do in�cio da fila
        fila.Remover();
        System.out.println(fila.Recuperar());
        System.out.println();
        //Verificando o tamanho da fila
        System.out.println("Tamanho da fila: "+fila.tamanho());
        
        //Limpando a fila
        fila.limpa();
        System.out.println("Tamanho da fila ap�s limpeza: "+fila.tamanho());
        
        
        
        
        
        
    }
}
