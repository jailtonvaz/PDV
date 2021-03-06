package model;
// Generated 12/11/2014 11:53:29 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Caixasangria generated by hbm2java
 */
public class Caixasangria  implements java.io.Serializable {


     private Integer idCaixaSangria;
     private Caixa caixa;
     private Usuario usuario;
     private BigDecimal valorRetirado;
     private Date data;

    public Caixasangria() {
    }

    public Caixasangria(Caixa caixa, Usuario usuario, BigDecimal valorRetirado, Date data) {
       this.caixa = caixa;
       this.usuario = usuario;
       this.valorRetirado = valorRetirado;
       this.data = data;
    }
   
    public Integer getIdCaixaSangria() {
        return this.idCaixaSangria;
    }
    
    public void setIdCaixaSangria(Integer idCaixaSangria) {
        this.idCaixaSangria = idCaixaSangria;
    }
    public Caixa getCaixa() {
        return this.caixa;
    }
    
    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public BigDecimal getValorRetirado() {
        return this.valorRetirado;
    }
    
    public void setValorRetirado(BigDecimal valorRetirado) {
        this.valorRetirado = valorRetirado;
    }
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }




}


