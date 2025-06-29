package conversorTemperatura;

import java.util.Scanner;
/*
 * objetivo criar um conversor de temperatura de celsius para farenheit  e  de farenheit para celsius
 * 
 * etapas
 * 
 * 1- obter do usuario qual tipo de conversao se Celsius ou Farenheit
 * 2- criar duas funcoes, uma para cada conversao
 * 3- obtera temperatura em cada um das funcoes escolhidas
 * 4- exibir uma mensagem com a temperaura.
 */

public class ConvTemp{
    public static void main(String[] args){
        // intanciando objeto scan do tipo Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("========== Conversor de Temperatura ==========");
        System.out.println("1 - Celsius \n2 - Farenheit");
        int op = scan.nextInt();

        switch (op) {
            case 1:
                Celsius();
                break;
            case 2:
                Farenheit();
                break;
            default:
                break;
        }


        scan.close();
    }

    /*
     * funcao recebe um valor em celsius
     * quer serar multiplicado por 9
     * dividido por 5 e somado + 32
     * ao final mostra conversao
     */
    public static void Celsius(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius");
        double temp = scan.nextDouble();

        double f = (temp * 9 / 5)+32;
        System.out.println(temp+"C° convertido em Farenheit F° : "+f+"F°");
        scan.close();
    }

    /*
     * funcao recebe valor em farenheit
     * subtrai 32 da 2temperatura
     * multiplica o resultado por 5
     * divide 0 resultado por 9
     */
    public static void Farenheit(){
         Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em Farenheit");
        double temp = scan.nextDouble();

        double c = (temp - 32 )* 5/9;
        System.out.println(temp+"F° convertido em Celsius F° : "+ c+"C°");
        scan.close();
    }

}