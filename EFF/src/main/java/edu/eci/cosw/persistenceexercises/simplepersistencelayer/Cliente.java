package edu.eci.cosw.persistenceexercises.simplepersistencelayer;
// Generated Feb 15, 2015 4:44:56 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Cliente generated by hbm2java
 */
@Entity
@Table(name="Clientes", uniqueConstraints = @UniqueConstraint(columnNames="Celular"))
public class Cliente  implements java.io.Serializable {

     private String correoCliente;
     private String contrasena;
     private String nombre;
     private String apellido;
     private String celular;
     private Set<Pedido> pedidoses = new HashSet<Pedido>(0);

    public Cliente() {
    }

	
    public Cliente(String correoCliente, String contrasena, String nombre, String apellido, String celular) {
        this.correoCliente = correoCliente;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }
    public Cliente(String correoCliente, String contrasena, String nombre, String apellido, String celular, Set pedidoses) {
       this.correoCliente = correoCliente;
       this.contrasena = contrasena;
       this.nombre = nombre;
       this.apellido = apellido;
       this.celular = celular;
       this.pedidoses = pedidoses;
    }
   
     @Id 

    
    @Column(name="correo_cliente", unique=true, nullable=false, length=45)
    public String getCorreoCliente() {
        return this.correoCliente;
    }
    
    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    
    @Column(name="contrasena", nullable=false, length=45)
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    
    @Column(name="Nombre", nullable=false, length=70)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="Apellido", nullable=false, length=70)
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    @Column(name="Celular", unique=true, nullable=false, length=45)
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }

    @OneToMany(fetch=FetchType.LAZY, mappedBy="clientes")
    public Set getPedidoses() {
        return this.pedidoses;
    }
    
    public void setPedidoses(Set pedidoses) {
        this.pedidoses = pedidoses;
    }




}


