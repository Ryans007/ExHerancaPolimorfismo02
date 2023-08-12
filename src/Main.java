import Entities.Pessoa;
import Entities.PessoaFisica;
import Entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        List<Pessoa> lista = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data: ");

            System.out.print("Individual or company (i/c)? ");
            char pessoa = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Anual income: ");
            double rendaAnual = sc.nextDouble();

            switch (pessoa) {
                case 'i':
                    System.out.print("Health expenditures: ");
                    double gastosMedicos = sc.nextDouble();
                    lista.add(new PessoaFisica(nome, rendaAnual, gastosMedicos));
                    break;
                default:
                    System.out.print("Number of employees: ");
                    int numFuncionarios = sc.nextInt();
                    lista.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
                    break;
            }
        }
        System.out.println();
        System.out.println("TAXES PAID: ");

        double soma = 0.00;

        for (Pessoa p : lista) {
            System.out.println(p);
            soma += p.calculoImposto();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + soma);
        sc.close();
    }
}
