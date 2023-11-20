class Main {
    public static void main(String[] args) {
      int nota = 2; // não esquecer de colocar o ;
  
        if(nota >= 5){
        System.out.println("Aprovado");
        }
        else if(nota >= 3 || nota < 5){ // condição dentro da condição; || é ou e && é e
          System.out.println("Exame");
        }
      else{
        System.out.println("Reprovado");
      }
    }
  }