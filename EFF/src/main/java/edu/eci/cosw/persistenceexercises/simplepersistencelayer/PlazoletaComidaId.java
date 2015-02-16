package edu.eci.cosw.persistenceexercises.simplepersistencelayer;
// Generated Feb 16, 2015 2:07:09 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PlazoletaComidaId generated by hbm2java
 */
@Embeddable
public class PlazoletaComidaId  implements java.io.Serializable {


     private String idPlazoletaComidas;
     private String ciudad;

    public PlazoletaComidaId() {
    }

    public PlazoletaComidaId(String idPlazoletaComidas, String ciudad) {
       this.idPlazoletaComidas = idPlazoletaComidas;
       this.ciudad = ciudad;
    }
   


    @Column(name="idPlazoletaComidas", nullable=false, length=45)
    public String getIdPlazoletaComidas() {
        return this.idPlazoletaComidas;
    }
    
    public void setIdPlazoletaComidas(String idPlazoletaComidas) {
        this.idPlazoletaComidas = idPlazoletaComidas;
    }


    @Column(name="ciudad", nullable=false, length=45)
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PlazoletaComidaId) ) return false;
		 PlazoletaComidaId castOther = ( PlazoletaComidaId ) other; 
         
		 return ( (this.getIdPlazoletaComidas()==castOther.getIdPlazoletaComidas()) || ( this.getIdPlazoletaComidas()!=null && castOther.getIdPlazoletaComidas()!=null && this.getIdPlazoletaComidas().equals(castOther.getIdPlazoletaComidas()) ) )
 && ( (this.getCiudad()==castOther.getCiudad()) || ( this.getCiudad()!=null && castOther.getCiudad()!=null && this.getCiudad().equals(castOther.getCiudad()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdPlazoletaComidas() == null ? 0 : this.getIdPlazoletaComidas().hashCode() );
         result = 37 * result + ( getCiudad() == null ? 0 : this.getCiudad().hashCode() );
         return result;
   }   


}


