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
                  System.out.println("======= DIVIDIR SELECIONADA ======="); 
                    dividir();     
                break;
                case 3:
                    System.out.println("======= SUBTRAIR SELECIONADA ======="); 
                    subtrair();    
                break;
                default:

            }

            scanner.close();
        }

        public static void multiplicar(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type first number");
           
            double a = scanner.nextDouble();
             System.out.println("Type the second number");
            double b = scanner.nextDouble();
            scanner.close();
            
          double result = (a * b);
          System.out.println("Result : "+result);
        }

        public static void dividir(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type first number");
           
            double a = scanner.nextDouble();
             System.out.println("Type the second number");
            double b = scanner.nextDouble();
            scanner.close();
            
          double result = (a / b);
          System.out.println("Result : "+result);
        }

         public static void subtrair(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type first number");
           
            double a = scanner.nextDouble();
             System.out.println("Type the second number");
            double b = scanner.nextDouble();
            scanner.close();
            
          double result = (a - b);
          System.out.println("Result : "+result);
        }
    }