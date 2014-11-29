package model;
// Generated 12/11/2014 11:53:29 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Venda generated by hbm2java
 */
public class Venda  implements java.io.Serializable {


     private Integer idVenda;
     private Caixa caixa;
     private Usuario usuario;
     private Date dataVenda;
     private String vendedorId;
     private Date dataCancelamento;
     private String numeroCupomFiscal;
     private Set pagamentovendas = new HashSet(0);
     private Set vendaitems = new HashSet(0);

    public Venda() {
    }

	
    public Venda(Caixa caixa, Usuario usuario, Date dataVenda, String vendedorId) {
        this.caixa = caixa;
        this.usuario = usuario;
        this.dataVenda = dataVenda;
        this.vendedorId = vendedorId;
    }
    public Venda(Caixa caixa, Usuario usuario, Date dataVenda, String vendedorId, Date dataCancelamento, String numeroCupomFiscal, Set pagamentovendas, Set vendaitems) {
       this.caixa = caixa;
       this.usuario = usuario;
       this.dataVenda = dataVenda;
       this.vendedorId = vendedorId;
       this.dataCancelamento = dataCancelamento;
       this.numeroCupomFiscal = numeroCupomFiscal;
       this.pagamentovendas = pagamentovendas;
       this.vendaitems = vendaitems;
    }
   
    public Integer getIdVenda() {
        return this.idVenda;
    }
    
    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
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
    public Date getDataVenda() {
        return this.dataVenda;
    }
    
    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
    public String getVendedorId() {
        return this.vendedorId;
    }
    
    public void setVendedorId(String vendedorId) {
        this.vendedorId = vendedorId;
    }
    public Date getDataCancelamento() {
        return this.dataCancelamento;
    }
    
    public void setDataCancelamento(Date dataCancelamento) {
        this.dataCancelamento = dataCancelamento;
    }
    public String getNumeroCupomFiscal() {
        return this.numeroCupomFiscal;
    }
    
    public void setNumeroCupomFiscal(String numeroCupomFiscal) {
        this.numeroCupomFiscal = numeroCupomFiscal;
    }
    public Set getPagamentovendas() {
        return this.pagamentovendas;
    }
    
    public void setPagamentovendas(Set pagamentovendas) {
        this.pagamentovendas = pagamentovendas;
    }
    public Set getVendaitems() {
        return this.vendaitems;
    }
    
    public void setVendaitems(Set vendaitems) {
        this.vendaitems = vendaitems;
    }




}


