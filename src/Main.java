import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        menuimc();

    }

    public static void menuimc(){
        int decisaoDoUsuario =1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Você deseja calcular o seu IMC\n1: Sim \n2: Não " );

            decisaoDoUsuario =sc.nextInt();
            if (decisaoDoUsuario ==1 ){
                imc();
            }else if (decisaoDoUsuario != 2){
                decisaoDoUsuario = 1;
                System.out.println("Você digitou uma opção invalida\n");
                continue;
            }

        } while(decisaoDoUsuario == 1);
        sc.close();

    }
    public static void imc(){
        System.out.println("Bem vindo(A) ao calculo do imc.\n\n A qualquer momento digite 0 para sair");
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Digite seu peso");
            double peso = sc.nextDouble();
            if (peso <=0){
                break;
            }
        System.out.println("Digite agora sua altura:");
        double altura = sc.nextDouble();
            if (altura  <=0){
                break;
            }
            double imc = peso / (altura * altura);
            System.out.println("Seu IMC é: " +imc);

            System.out.println("A qualquer momento digite 0 para sair\n\n Digite seu peso:");
            peso = sc.nextDouble();
            if (peso <= 0){
                break;
            }
            System.out.println("Digite sua altura");
            altura = sc.nextDouble();
            if (altura  <=0){
                break;
            }
        }
        //sc.close();
        System.out.println("Voce saiu");
    }

    }
