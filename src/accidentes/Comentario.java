package accidentes;

import java.util.Date;

public class Comentario {
    private long id;
    private String descripcion;
    private String fechaComentario;

    // Relación: pertenece a un Carro
    private Carro carro;

    // Getters/Setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getFechaComentario() { return fechaComentario; }
    public void setFechaComentario(String fechaComentario) { this.fechaComentario = fechaComentario; }

    public Carro getCarro() { return carro; }
    public void setCarro(Carro carro) { this.carro = carro; }


}
