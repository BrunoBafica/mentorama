import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int opcao;

        do{
        System.out.println("1 - Menu com opções");
        System.out.println("2 - Calculo IMC");
        System.out.println("3 - Sair");
        System.out.print("Opção: ");
        opcao = ler.nextInt();

        switch(opcao){
            case 1:
                menu();
                break;
            case 2:
                imc();
                break;
            
            default:
                System.out.println("Opção Inválida!");
                break;
        }
    }while(opcao != 3);



    }

    public static void menu(){

        Scanner ler = new Scanner(System.in);
        int op = 0;

        do{
            System.out.println("Selecione uma opção: ");
            System.out.println("Opção 1");
            System.out.println("Opção 2");
            System.out.println("3 - Sair");
            op = ler.nextInt();

            switch(op)
            {
                case 1:
                    System.out.println("Você selecionou a opção 1");
                    break;

                case 2:
                    System.out.println("Você selecionou a opção 2");
                    break;
                
                case 3: 
                    System.out.println("Saindo do programa!");
                    break;
                
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }

        }while(op != 3);

    }

    public static void imc(){   

        //IMC = Peso ÷ (Altura × Altura)

        Scanner ler = new Scanner(System.in);
        double peso, altura, imc;

        System.out.print("Digite seu peso: ");
        peso = ler.nextDouble();

        System.out.print("Digite sua altura: ");
        altura = ler.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f %n ", imc);



    }
    
}
