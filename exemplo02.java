/*constante -> variavel em java em que não posso alterar o valor 
 *usamos a palavra chave FINAL
 */
 
 public class exemplo02 {

public static final int TAXA = 10;
public static final double PI = 3.14;

// public -> constante
// static -> constante compartilhada em classes
// final -> nao posso alterar o valor

public static void main(String[] args) {
    System.out.println("taxa da loja é de"+TAXA+"%");
    System.out.println("PI vale"+PI);
}

 }