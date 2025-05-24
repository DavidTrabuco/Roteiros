package roteiro6.parte3;

public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // Getters e Setters
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int toSegundos() {
        return hora * 3600 + minuto * 60 + segundo;
    }

    public static  int diferencaEmMinutos(Tempo inicio, Tempo fim) {
        int secInicio = inicio.toSegundos();
        int secFim = fim.toSegundos();
        int diffSeg = secFim - secInicio;
        if (diffSeg < 0) {

            diffSeg += 24 * 3600;
        }

        int minutos = diffSeg / 60;
        int restoSeg = diffSeg % 60;

        if (restoSeg > 0) {
            minutos += 1;
        }
        return minutos;
    }
}
