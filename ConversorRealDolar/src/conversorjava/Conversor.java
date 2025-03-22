package conversorjava;

import java.util.Scanner;
import java.util.Locale;

public class Conversor {

    public static void main(String[] args) {
        Scanner LerValor = new Scanner(System.in).useLocale(Locale.US);
        double CotacaoDolar = 5.734;

        System.out.println("Informe o valor em Real (use vírgula ou ponto para decimais): ");
        try {
            // Captura o valor inserido e substitui vírgulas por pontos, caso necessário,para evitar erros
            String input = LerValor.next().replace(",", ".");
            double ValorMoeda = Double.parseDouble(input); // Converte para número

            if (ValorMoeda < 0) { // Verifica se o valor não é negativo
                System.out.println("O valor não pode ser negativo. Tente novamente.");
                return;
            }

            double NovoValor = ValorMoeda / CotacaoDolar;
            System.out.printf("R$%.2f convertido para USD = $%.2f%n", ValorMoeda, NovoValor);
        } catch (NumberFormatException e) {
            System.out.println("Favor informe um valor válido (somente números com ponto decimal).");
        } finally {
            LerValor.close(); // Fecha o Scanner
        }
    }
}
