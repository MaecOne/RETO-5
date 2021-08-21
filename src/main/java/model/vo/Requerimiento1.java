package model.vo;

public class Requerimiento1 {
    private Integer idTipo;
    private Integer codigoTipo;
    private Integer areaMaxima;
    private Integer estrato;

    public Requerimiento1() {
    }

    public Requerimiento1(Integer idTipo, Integer codigoTipo, Integer areaMaxima, Integer estrato) {
        this.idTipo = idTipo;
        this.codigoTipo = codigoTipo;
        this.areaMaxima = areaMaxima;
        this.estrato = estrato;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public Integer getCodigoTipo() {
        return this.codigoTipo;
    }

    public void setCodigoTipo(Integer codigoTipo) {
        this.codigoTipo = codigoTipo;
    }

    public Integer getAreaMaxima() {
        return this.areaMaxima;
    }

    public void setAreaMaxima(Integer areaMaxima) {
        this.areaMaxima = areaMaxima;
    }

    public Integer getEstrato() {
        return estrato;
    }

    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }
}
