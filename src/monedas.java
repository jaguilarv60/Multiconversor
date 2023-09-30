
import javax.swing.JOptionPane;

public class monedas {

    private double pesos;
    private double dolar;
    private double euro;
    private double libras;
    private double yen;
    private double won_coreano;
    private double valorGeneral;

    public monedas() {
        this.dolar = 17.40;
        this.euro = 18.44;
        this.libras = 21.25;
        this.won_coreano = 0.013;
        this.yen = 0.12;
    }

    public void setMoneda(String moneda, double valor) {
        if (valor >= 0) {
            switch (moneda) {
                case "pesos":
                    setPesos(valor);
                    break;
                case "dolar":
                    setDolar(valor);
                    break;
                case "euro":
                    setEuro(valor);
                    break;
                case "libras":
                    setLibras(valor);
                    break;
                case "yen":
                    setYen(valor);
                    break;
                case "won_coreano":
                    setWon_coreano(valor);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Moneda no válida");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Moneda no válida");
        }
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public void setLibras(double libras) {
        this.libras = libras;
    }

    public void setYen(double yen) {
        this.yen = yen;
    }

    public void setWon_coreano(double won_coreano) {
        this.won_coreano = won_coreano;
    }

    public double getValorGeneral() {
        return valorGeneral;
    }

    public void setValorGeneral(double valorGeneral) {
        if (valorGeneral > 0) {
            this.valorGeneral = valorGeneral;
        } else {
            this.valorGeneral = 0;
        }
    }

    public void setPesos(double pesos) {
        this.pesos = pesos;
    }

    public double getLibras() {
        return libras;
    }

    public double getYen() {
        return yen;
    }

    public double getWon_coreano() {
        return won_coreano;
    }

    public double getEuro() {
        return euro;
    }

    public double getPesos() {
        return pesos;
    }

    public double getDolar() {
        return dolar;
    }

}
