import java.util.ArrayList; // importando as bibliotecas arraylist que é uma lista encadeada e o tipo de dado que ela guarda
import java.util.Iterator; //importando iterator que é um tipo de dado que serve para iterar sobre os elementos de uma lista encade

class Main {
  public static void main(String[] args) {
    //colocar o nome do objeto
    ArrayList<Integer> numeros = new ArrayList<>();
    numeros.add(1);
    numeros.add(3);
    numeros.add(2);

    System.out.println("ArrayList: " + numeros);

    //Criando uma instancia de Iterator
    Iterator<Integer> it = numeros.iterator(); //nome ja ta implementanod na classe

    int numero = it.next();
    System.out.println("Elemento: " + numero);

    while(it.hasNext()){
      it.forEachRemaining((value) -> System.out.print(value + ", "));
    }
  }
}