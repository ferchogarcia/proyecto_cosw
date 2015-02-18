package edu.eci.cosw.proyecto_eff.simplepersistencelayer;
// Generated Feb 16, 2015 2:07:09 PM by Hibernate Tools 4.3.1


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
     private float gradosLon;
     private float minutosLon;
     private float segundosLon;
     private char orientacionLon;
     private float gradosLat;
     private float minutosLat;
     private float segundosLat;
     private char orientacionLat;
     

    public PlazoletaComida() {
    }

	
    public PlazoletaComida(PlazoletaComidaId id, float gradosLon, float minutosLon, float segundosLon, char orientacionLon, float gradosLat, float minutosLat, float segundosLat, char orientacionLat) {
        this.id = id;
        this.gradosLon = gradosLon;
        this.minutosLon = minutosLon;
        this.segundosLon = segundosLon;
        this.orientacionLon = orientacionLon;
        this.gradosLat = gradosLat;
        this.minutosLat = minutosLat;
        this.segundosLat = segundosLat;
        this.orientacionLat = orientacionLat;
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

    
    @Column(name="grados_lon", nullable=false, precision=12, scale=0)
    public float getGradosLon() {
        return this.gradosLon;
    }
    
    public void setGradosLon(float gradosLon) {
        this.gradosLon = gradosLon;
    }

    
    @Column(name="minutos_lon", nullable=false, precision=12, scale=0)
    public float getMinutosLon() {
        return this.minutosLon;
    }
    
    public void setMinutosLon(float minutosLon) {
        this.minutosLon = minutosLon;
    }

    
    @Column(name="segundos_lon", nullable=false, precision=12, scale=0)
    public float getSegundosLon() {
        return this.segundosLon;
    }
    
    public void setSegundosLon(float segundosLon) {
        this.segundosLon = segundosLon;
    }

    
    @Column(name="orientacion_lon", nullable=false, length=1)
    public char getOrientacionLon() {
        return this.orientacionLon;
    }
    
    public void setOrientacionLon(char orientacionLon) {
        this.orientacionLon = orientacionLon;
    }

    
    @Column(name="grados_lat", nullable=false, precision=12, scale=0)
    public float getGradosLat() {
        return this.gradosLat;
    }
    
    public void setGradosLat(float gradosLat) {
        this.gradosLat = gradosLat;
    }

    
    @Column(name="minutos_lat", nullable=false, precision=12, scale=0)
    public float getMinutosLat() {
        return this.minutosLat;
    }
    
    public void setMinutosLat(float minutosLat) {
        this.minutosLat = minutosLat;
    }

    
    @Column(name="segundos_lat", nullable=false, precision=12, scale=0)
    public float getSegundosLat() {
        return this.segundosLat;
    }
    
    public void setSegundosLat(float segundosLat) {
        this.segundosLat = segundosLat;
    }

    
    @Column(name="orientacion_lat", nullable=false, length=1)
    public char getOrientacionLat() {
        return this.orientacionLat;
    }
    
    public void setOrientacionLat(char orientacionLat) {
        this.orientacionLat = orientacionLat;
    }

}

