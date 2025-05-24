package roteiro6.parte2;

public class Ligacao {
    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private Tempo horaInicio;
    private Tempo horaFim;

    public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino, Tempo horaInicio,
            Tempo horaFim) {
        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    public String getNumOrigem() {
        return numOrigem;
    }

    public void setNumOrigem(String numOrigem) {
        this.numOrigem = numOrigem;
    }

    public String getNumDestino() {
        return numDestino;
    }

    public void setNumDestino(String numDestino) {
        this.numDestino = numDestino;
    }

    public String getLocalOrigem() {
        return localOrigem;
    }

    public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }

    public String getLocalDestino() {
        return localDestino;
    }

    public void setLocalDestino(String localDestino) {
        this.localDestino = localDestino;
    }

    public Tempo getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Tempo horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Tempo getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Tempo horaFim) {
        this.horaFim = horaFim;
    }

    public class Tempo {
        private int hora;
        private int minuto;
        private int segundo;

        public Tempo(int hora, int minuto, int segundo) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }
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

    }

}
