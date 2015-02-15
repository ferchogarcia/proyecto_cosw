package edu.eci.cosw.persistenceexercises.simplepersistencelayer;
// Generated Feb 15, 2015 4:44:56 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * PlazoletaComida generated by hbm2java
 */
@Entity
@Table(name="PlazoletaComidas")
public class PlazoletaComida  implements java.io.Serializable {


     private PlazoletaComidaId id;
     private String coordenada;
     private Set<Sucursal> sucursaleses = new HashSet<Sucursal>(0);

    public PlazoletaComida() {
    }

	
    public PlazoletaComida(PlazoletaComidaId id) {
        this.id = id;
    }
    public PlazoletaComida(PlazoletaComidaId id, String coordenada, Set sucursaleses) {
       this.id = id;
       this.coordenada = coordenada;
       this.sucursaleses = sucursaleses;
    }
   
    @EmbeddedId
    @AttributeOverrides( {
        @AttributeOverride(name="idPlazoletaComidas", column=@Column(name="idPlazoletaComidas", nullable=false, length=45) ), 
        @AttributeOverride(name="ciudad", column=@Column(name="ciudad", nullable=false, length=45) ) } )
    public PlazoletaComidaId getId() {
        return this.id;
    }
    
    public void setId(PlazoletaComidaId id) {
        this.id = id;
    }

    
    @Column(name="coordenada", length=100)
    public String getCoordenada() {
        return this.coordenada;
    }
    
    public void setCoordenada(String coordenada) {
        this.coordenada = coordenada;
    }

    @OneToMany(fetch=FetchType.LAZY, mappedBy="plazoletaComidas")
    public Set getSucursaleses() {
        return this.sucursaleses;
    }
    
    public void setSucursaleses(Set sucursaleses) {
        this.sucursaleses = sucursaleses;
    }




}


