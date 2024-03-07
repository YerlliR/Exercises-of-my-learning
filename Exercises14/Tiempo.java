public class Tiempo {
    protected int horas;
    protected int minutos;
    protected int segundos;

    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return  horas + "h " + minutos + "m " + segundos + "s ";
    }

    public int compareTo(Tiempo otroTiempo) {
        if (this.horas != otroTiempo.horas) {
            return Integer.compare(this.horas, otroTiempo.horas);
        } else if (this.minutos != otroTiempo.minutos) {
            return Integer.compare(this.minutos, otroTiempo.minutos);
        } else {
            return Integer.compare(this.segundos, otroTiempo.segundos);
        }
    }

}