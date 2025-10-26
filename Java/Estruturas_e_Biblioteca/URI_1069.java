package Estruturas_e_Biblioteca;

import java.io.IOException;
import java.util.Scanner;

public class URI_1069 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int quantTeste = sc.nextInt();

        for (int i = 0; i < quantTeste; i++) {
            String linha = sc.next();
            int diamantes = contarDiamantes(linha);
            System.out.println(diamantes);
        }

        sc.close();
    }

    public static int contarDiamantes(String linha) {
        int chaveEsquerda = 0;
        int diamantes = 0;

        for (int j = 0; j < linha.length(); j++) {
            char c = linha.charAt(j);

            if (c == '<') {
                chaveEsquerda++; 
            } else if (c == '>' && chaveEsquerda > 0) {
                chaveEsquerda--;
                diamantes++;
            }
        }

        return diamantes;
    }
}
