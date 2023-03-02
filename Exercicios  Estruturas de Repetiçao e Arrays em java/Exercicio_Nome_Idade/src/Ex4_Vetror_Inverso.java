public class Ex4_Vetror_Inverso {
    /*Crie um vetor de 6 numeros inteiros e
    mostre a ordem inversa.
     */
    public static void main(String[] args) {
        
        int[] vetor = {-5, -6, 15, 50, 8, 4};


        int count = 0;
        while(count < vetor.length){ 
            System.out.println( vetor[count]);
            count++;
        }
        for(int i = (vetor.length - 1); i >= 0; i--){
            System.out.println(vetor[i]);
        }
    }
}
