class Main {
    public static void main(String[] args) {
        //classe objeto   new  método construtor
        String primeira = "Java";
        String segunda = "Csharp";
        String terceira = new String("Python");
  
        System.out.println(primeira.toUpperCase());
        System.out.println(segunda.toLowerCase());
        System.out.println(terceira.length());
  
      //comparar a primeira com a segunda string
      boolean result = primeira.equals(segunda);
    System.out.println("Primeira é igual a segunda? " + result);
  
      //comparar a segunda com a terceira
      result = segunda.equals(terceira);
      System.out.println("Segunda é igual a terceira? " + result);
    }
  }