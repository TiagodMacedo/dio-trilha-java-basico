public class ContaTerminal {
    /*
     *Desafio Conta Terminal
     1. Crie o projeto contaBanco que  recebera dados via terminal contendo as caracteristicas
     de conta em banco conforme atributos abaixo:
     
     2. Dentro do projeto Crie uma classe ContaTerminal.java para realizar toda a codificação
     do nosso programa.

     Atibutos - tipo - exemplo:
     - Numero - inteiro -1021
     -Agencia - texto - 067-8
     Nome do cliente - texto - Mario Andrade
     Saldo - decimal - 237.48

     3.  Permita que os dados sejam inseridos via terminal, sendo que o usuario receberá
     a mensagem de qual informaçao será solicitada, exemplo:
        *Programa: "por favor, digite o numero da conta"
        *Usuario: 1021( depois ENTER para proximo campo)

    4.Depois de todas as informações serem inseridas, o sistema deverá exibir a seguinte mensagem:
        "Olá [Nome do Cliente], obrigado por criar uma conta em nosso banco, sua agencia é [Agencia],conta [Numero] e seu saldo de [Saldo] já está disponível para saque."
    
        Os campos[] devem ser preenchidos com os dados informados pelo usuário.
     */

    public static void main(String[] args) {
        // Declaração de variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Entrada de dados
        System.out.print("Por favor, digite o número da conta: ");
        numero = Integer.parseInt(System.console().readLine());

        System.out.print("Por favor, digite a agência: ");
        agencia = System.console().readLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = System.console().readLine();

        System.out.print("Por favor, digite o saldo: ");
        saldo = Double.parseDouble(System.console().readLine());

        // Saída de dados
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de %.2f já está disponível para saque.%n",
                nomeCliente, agencia, numero, saldo);

    }

}
