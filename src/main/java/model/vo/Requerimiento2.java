package model.vo;

public class Requerimiento2 {
    private Integer idProyecto;
    private String constructora;
    private String ciudad;
    private Integer estrato;

    public Requerimiento2() {
    }

    public Requerimiento2(Integer idProyecto, String constructora, String ciudad, Integer estrato) {
        this.idProyecto = idProyecto;
        this.constructora = constructora;
        this.ciudad = ciudad;
        this.estrato = estrato;
    }

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getEstrato() {
        return estrato;
    }

    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }
    
}
