package java;
import java.util.Scanner;

/**
 * Desafio
 * Calcular o salário líquido com base nas aliquotas passadas:
 * se o salário entre R$    0.00 e R$   1100.00      -  0.5%
 * se o salário entre R$ 1100.01 até R$ 2500.00      - 0.10%
 * se salário > que   R$ 2500.00                     - 0.15%
 */
public class Desafio {
    public static void main(String[] args) {
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;

        if (valorSalario >= 0 && valorSalario <= 1000) {

            valorImposto = 0.05F * valorSalario;
        } else if (valorSalario > 1000 && valorSalario <= 2500) {
            valorImposto = 0.10F * valorSalario;
        } else {
            valorImposto = 0.15F * valorSalario;
        }

        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println("               Utilizando if - else                        ");
        System.out.println("******************Folha de Pagamento***********************");
        System.out.println((String.format("%s %.2f", "Salario Bruto ", valorSalario)));
        System.out.println((String.format("%s %.2f", "Valor de Benefícios ", valorBeneficios)));
        System.out.println((String.format("%s %.2f", "Valor do Imposto ", valorImposto)));
        System.out.println(String.format("Saláiro líquido: " + "%.2f", saida, args));
        System.out.println("******************Folha de Pagamento***********************\n");
       
        leitorDeEntradas.close();
    }

}