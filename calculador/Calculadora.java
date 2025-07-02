package calculador;

import java.util.Scanner;

    public class Calculadora{
          public static void main(String[] args)     {
            // estâncias objeto scan do tipo Scanner
            Scanner scanner = new Scanner(System.in);
            System.out.println("===Calculadora===");
            System.out.println(" 1) Multiplicar");
            System.out.println(" 2) Dividir");
            System.out.println(" 3) Subtrair");

            int op = scanner.nextInt();
                        
            // switch verifica e válida se a opção digitada confere como a declaração 
            switch(op){
                case 1:
                    System.out.println("======= MULTIPLICAR SELECIONADA ======="); 
                    multiplicar();                  
                break;
                case 2:
                break;
                case 3:
                break;
                default:

            }

            scanner.close();
        }

        public static void multiplicar(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Entre com dois numero que  deseja multiplicar");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            scanner.close();
            System.out.println("deseja multiplicar outro numero ? (s/n)");
            
            int opcao = scanner.nextInt();
            if(opcao == 's'){
                multiplicar();
            }
          double result = (a * b);
          System.out.println(result);
          
          
        }

    }