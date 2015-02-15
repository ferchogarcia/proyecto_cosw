package edu.eci.cosw.persistenceexercises.simplepersistencelayer;
// Generated Feb 15, 2015 1:34:13 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Pedidos generated by hbm2java
 */
@Entity
@Table(name="Pedidos"
    ,catalog="coswg1"
)
public class Pedidos  implements java.io.Serializable {


     private Integer idPedidos;
     private Clientes clientes;
     private Boolean enviadoAsucursal;
     private Boolean notificadoAcliente;
     private String estadoPedido;
     private Set pagoses = new HashSet(0);
     private Set productoses = new HashSet(0);

    public Pedidos() {
    }

	
    public Pedidos(Clientes clientes) {
        this.clientes = clientes;
    }
    public Pedidos(Clientes clientes, Boolean enviadoAsucursal, Boolean notificadoAcliente, String estadoPedido, Set pagoses, Set productoses) {
       this.clientes = clientes;
       this.enviadoAsucursal = enviadoAsucursal;
       this.notificadoAcliente = notificadoAcliente;
       this.estadoPedido = estadoPedido;
       this.pagoses = pagoses;
       this.productoses = productoses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idPedidos", unique=true, nullable=false)
    public Integer getIdPedidos() {
        return this.idPedidos;
    }
    
    public void setIdPedidos(Integer idPedidos) {
        this.idPedidos = idPedidos;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Clientes_correo_cliente", nullable=false)
    public Clientes getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    
    @Column(name="enviadoASucursal")
    public Boolean getEnviadoAsucursal() {
        return this.enviadoAsucursal;
    }
    
    public void setEnviadoAsucursal(Boolean enviadoAsucursal) {
        this.enviadoAsucursal = enviadoAsucursal;
    }

    
    @Column(name="NotificadoACliente")
    public Boolean getNotificadoAcliente() {
        return this.notificadoAcliente;
    }
    
    public void setNotificadoAcliente(Boolean notificadoAcliente) {
        this.notificadoAcliente = notificadoAcliente;
    }

    
    @Column(name="estadoPedido", length=45)
    public String getEstadoPedido() {
        return this.estadoPedido;
    }
    
    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pedidos")
    public Set getPagoses() {
        return this.pagoses;
    }
    
    public void setPagoses(Set pagoses) {
        this.pagoses = pagoses;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="Pedidos_Productos", catalog="coswg1", joinColumns = { 
        @JoinColumn(name="Pedidos_idPedidos", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="Producto_idProductos", nullable=false, updatable=false) })
    public Set getProductoses() {
        return this.productoses;
    }
    
    public void setProductoses(Set productoses) {
        this.productoses = productoses;
    }




}

