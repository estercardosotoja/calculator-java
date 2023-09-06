import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scan = new Scanner(System.in);

    int resultado;

    for(int i=0; i>=0; i++){
        System.out.println("Digite o primeiro valor: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        int num2 = scan.nextInt();

        System.out.println(" \t \t ** Calculadora ** \n 1 - Soma: \n 2 - Subtração \n 3 - Divisão" +
                " \n 4 - Multiplicação \n 5 - Sair \n Escolha uma opção:");

        int opcao = scan.nextInt();
        Operacoes operacoes = new Operacoes(num1, num2);

        switch (opcao) {
            case 1:
                System.out.println("Soma");
                resultado = operacoes.soma();
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                System.out.println("Substração");
                resultado = operacoes.sub();
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                System.out.println("Divisão");
                resultado = operacoes.div();
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                System.out.println("Multiplicação");
                resultado = operacoes.mul();
                System.out.println("Resultado: " + resultado);
                break;
            case 5:
                System.out.println("Sair");
                i=-1;
                System.out.println("Obrigada por usar a Calculadora1");
            }
        }
    }
}
