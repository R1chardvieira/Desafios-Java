package Desafio1;

import java.util.Scanner;

public class Ninjas {
    static void main(String[] args) {
        String NomeNinja1 = "Naruto";
        int IdadeNj1 = 15;
        String NomeMissao = "salvar gato";
        char NivelMissao = 'C';
        boolean Conclusao = (IdadeNj1<15 && (NivelMissao =='C'||NivelMissao=='D'))||IdadeNj1>=15;

        String NomeNinja2 = "Sakura";
        int IdadeNj2 = 14;
        String NomeMissaoNj2 = "salvar gato";
        char NivelMissaoNj2 = 'B';
        boolean ConclusaoNj2 = (IdadeNj2<15 && (NivelMissaoNj2 =='C'||NivelMissaoNj2=='D'))||IdadeNj2>=15;

        String NomeNinja3 = "Sasuke";
        int IdadeNj3 = 14;
        String NomeMissaoNj3 = "salvar gato";
        char NivelMissaoNj3 = 'S';
        boolean ConclusaoNj3 = (IdadeNj3<15 && (NivelMissaoNj3 =='C'||NivelMissaoNj3=='D'))||IdadeNj3>=15;
        //ninja 1
        System.out.println("Ninja 1");
        System.out.printf("Nome: %s\n", NomeNinja1);
        System.out.printf("Idade: %d\n",IdadeNj1);
        System.out.printf("Missão: %s\n",NomeMissao);
        System.out.printf("Nivel: %c\n",NivelMissao);
        System.out.printf("Conclusão:%b\n",Conclusao);
        System.out.println();
        //ninja 2
        System.out.println("Ninja 2");
        System.out.printf("Nome: %s\n", NomeNinja2);
        System.out.printf("Idade: %d\n",IdadeNj2);
        System.out.printf("Missão: %s\n",NomeMissaoNj2);
        System.out.printf("Nivel: %c\n",NivelMissaoNj2);
        System.out.printf("Conclusão:%b\n",ConclusaoNj2);
        System.out.println();
        //ninja 3
        System.out.println("Ninja 3");
        System.out.printf("Nome: %s\n", NomeNinja3);
        System.out.printf("Idade: %d\n",IdadeNj3);
        System.out.printf("Missão: %s\n",NomeMissaoNj3);
        System.out.printf("Nivel: %c\n",NivelMissaoNj3);
        System.out.printf("Conclusão: %b\n",ConclusaoNj3);

    }

}
