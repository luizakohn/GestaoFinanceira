import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AdicionaGasto {
    int opcao = 0;
    public Scanner entrada = new Scanner(System.in);
    public Gastos[] g = new Gastos[100];
    String Nome;
    double ValorGasto;
    String TipoGasto;
    int indexGastos;
    LocalDate dataGasto;
    String FormaPagto;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public int MainAdicionarGasto(int indexGastos){
        this.indexGastos = indexGastos;
        while (opcao != 99) {
            System.out.println("----- Menu de Gastos -----");
            System.out.println("1- Habitação");
            System.out.println("2- Alimentação");
            System.out.println("3- Entretenimento");
            System.out.println("4- Transporte");
            System.out.println("99- Sair");

            opcao = entrada.nextInt();
            switch (opcao) {

                case 1:
                    TipoGasto = "Habitação";
                    setParametrosGasto();
                    break;
                case 2:
                    TipoGasto =  "Alimentação";
                    setParametrosGasto();
                    break;
                case 3:
                    TipoGasto =  "Entretenimento";
                    setParametrosGasto();
                    break;
                case 4:
                    TipoGasto = "Transporte";
                    setParametrosGasto();
                    break;
                case 99:
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
        return this.indexGastos;
    }
    private void setParametrosGasto(){
        System.out.println("Informe o título do gasto: ");
        Nome = entrada.next();
        System.out.println("Informe o valor do gasto:");
        ValorGasto = entrada.nextDouble();
        System.out.println("Informe a data do gasto:");
        String dataTemp = entrada.next();
        dataGasto = LocalDate.parse(dataTemp, formatter);
        opcao = 0;
        while (opcao != 1 && opcao != 2 && opcao != 3){
            System.out.println("Informe a forma de pagamento:");
            System.out.println("1- Pix");
            System.out.println("2- Cartão");
            System.out.println("3- Cheque");

            opcao = entrada.nextInt();
            switch (opcao) {

                case 1:
                    FormaPagto = "Pix";
                    break;
                case 2:
                    FormaPagto =  "Cartão";
                    break;
                case 3:
                    FormaPagto =  "Cheque";
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        }
        sendParametrosGasto();
    }
    private void sendParametrosGasto(){
        g[indexGastos] = new Gastos();
        g[indexGastos].setGasto(Nome,TipoGasto, dataGasto, ValorGasto, FormaPagto);
        indexGastos ++;
    }
}
