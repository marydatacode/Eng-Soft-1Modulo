class Animal {
    private String nome;
  
    public void setNome(String n){
      nome = n;
    }
    public String getNome(){
        return nome;
    }
    public void Comer(){
      System.out.println("Eu gosto de comer.");
    }
  }
//setNome e getNome são acessores, o que define o tipo de acesso e o nome da variável.