import java.util.Scanner;

public class GastosView {
    Scanner entrada = new Scanner(System.in);
    int mes = 0;
    int ano = 0;
    int index = 0;
    public void RelatorioGanhos(Gastos[] gasto, int index) {
        this.index = index;
        System.out.println("------Relatório de Ganhos------");
        System.out.println("Informe o mês que deseja ver os ganhos:");
        while (mes < 1 || mes > 12) {
            mes = entrada.nextInt();
            if (mes < 1 || mes > 12) {
                System.out.println("O mês deve ser entre 1 e 12");
            }
        }
        System.out.println("Informe o mês que deseja ver os ganhos:");
        ano = entrada.nextInt();
        showRelMes(gasto);

    }
    private void showRelMes(Gastos[] gasto){
        System.out.println("Título: | Tipo Gasto: | Data Gasto: | Valor Gasto: | Forma de Pagamento: ");
        for (int i = 0; i < index; i++){
            System.out.println(index);
            String retorno = gasto[i].getGasto(mes, ano);
            System.out.println(retorno);
        }
    }
}
