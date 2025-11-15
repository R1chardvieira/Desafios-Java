package Desafio2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CadastrarNinja {
    static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int NUMERO_MAX = 5;
        String [] ninjas = new String[NUMERO_MAX];

        int opcao = 0;
        int ninjasCadastrado = 0;

        while (opcao!=4){
            System.out.println("================================================");
            System.out.println("MENU");
            System.out.println("1- Cadastrar Ninja");
            System.out.println("2- Lista de Ninjas");
            System.out.println("3- Deletar ninja");
            System.out.println("4- Sair");
            System.out.println("================================================");
            System.out.println("Digite uma opção:");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    if (ninjasCadastrado < NUMERO_MAX){
                        System.out.println("Digite o nome do ninja:");
                        String nome = scanner.nextLine();
                        ninjas[ninjasCadastrado] = nome;
                        ninjasCadastrado++;
                        System.out.println("Ninja cadastrado com sucesso");
                    }else {
                        System.out.println("A lista já está cheia:");
                    }
                    break;
                case 2:
                    if (ninjasCadastrado==0){
                        System.out.println("Não tem ninjas cadastrados");
                    }else{
                        for(int i = 0; i<ninjas.length; i++){
                            System.out.println( ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    if (ninjasCadastrado==0){
                        System.out.println("Você não pode deletar um ninja pois não tem ninjas cadastrados");
                    }else{
                        for(int i = 0; i<ninjas.length; i++){
                            System.out.println((i+1) + "-" + ninjas[i]);
                        }
                        System.out.println("Digite o numero que quer deletar:");
                        int numDelete= scanner.nextInt();
                        scanner.nextLine();
                        int indexDelete = numDelete-1;
                        ninjas[indexDelete]= null;
                        for(int i = indexDelete; i<ninjasCadastrado; i++){
                            ninjas[i] = ninjas[i+1] ;
                        }
                        ninjas[ninjasCadastrado - 1]=null;
                        ninjasCadastrado--;
                        System.out.println("Ninja Deletado com Sucesso.");
                    }
                    break;


                case 4:
                    System.out.println("Saindo do programa!");
                    break;
                default:
                    System.out.println("Essa opção não é válida.");
            }


        }

        scanner.close();
    }
}
