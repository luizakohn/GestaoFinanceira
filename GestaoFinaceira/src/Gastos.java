import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Gastos {
    private String NomeGasto;
    private String DescricaoGasto;
    private LocalDate DataGasto;
    private double ValorGasto;
    private String FormaPagto;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void setGasto(String nomeGasto, String descricaoGasto, LocalDate dataGasto, double valorGasto, String formaPagto){
        this.NomeGasto= nomeGasto;
        this.DescricaoGasto = descricaoGasto;
        this.DataGasto = dataGasto;
        this.ValorGasto = valorGasto;
        this.FormaPagto = formaPagto;
    }
    public String getGasto(int mes, int ano){
        String retorno= "";
        if (DataGasto.getMonthValue() == mes && DataGasto.getYear() == ano){
            retorno = NomeGasto + " | " + DescricaoGasto + " | " + formatter.format(DataGasto) + " | R$" + ValorGasto + " | " + FormaPagto;
        }
        return retorno;
    }
    public double getValorGasto(int mes, int ano){
        double valorGastoMes = 0;
        if (DataGasto.getMonthValue() == mes && DataGasto.getYear() == ano){
            valorGastoMes = ValorGasto;
        }
        return valorGastoMes;
    }
}
