class Main {
    public static void main(String[] args) {
    
        // Declaração e inicialização do Array/Vetor
        int[] passarosPorDia = {2,5,0,7,4,1,3,0,2,5,0,1,3,1};
    
        //Declaração de Variáveis de contagem
        int totalPassaros = 0;
        int passarosPrimeira = 0;
        int passarosSegunda = 0;
    
        //Laço de repetição para o cálcular o total de passaros
        for (int i=0; i<14; i++){
        totalPassaros = totalPassaros + passarosPorDia[i];
        }
        System.out.println(totalPassaros);
    
        //Laço de repetição para o cálcular o total de passaros na primeira semana
        for (int i=0; i<7; i++){
          passarosPrimeira = passarosPrimeira + passarosPorDia[i]; //o [i] serve para ir varrendo o Array, analisando o loop ate chegar na parada determinada
        }
        System.out.println(passarosPrimeira);
    
        //Laço de repetição para o cálcular o total de passaros na segunda semana
        for (int i=7; i<14; i++){
          passarosSegunda = passarosSegunda + passarosPorDia[i];
        }
        System.out.println(passarosSegunda);
      }
    }
}
