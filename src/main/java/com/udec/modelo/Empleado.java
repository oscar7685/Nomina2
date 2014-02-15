/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.udec.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Oscar
 */
@Entity
@Table(name = "empleado", catalog = "nomina2", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e"),
    @NamedQuery(name = "Empleado.findByCodigo", query = "SELECT e FROM Empleado e WHERE e.codigo = :codigo"),
    @NamedQuery(name = "Empleado.findByCedula", query = "SELECT e FROM Empleado e WHERE e.cedula = :cedula"),
    @NamedQuery(name = "Empleado.findByNombre", query = "SELECT e FROM Empleado e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Empleado.findBySalario", query = "SELECT e FROM Empleado e WHERE e.salario = :salario"),
    @NamedQuery(name = "Empleado.findByTipo", query = "SELECT e FROM Empleado e WHERE e.tipo = :tipo"),
    @NamedQuery(name = "Empleado.findByEstado", query = "SELECT e FROM Empleado e WHERE e.estado = :estado"),
    @NamedQuery(name = "Empleado.findByNumeroCuenta", query = "SELECT e FROM Empleado e WHERE e.numeroCuenta = :numeroCuenta")})
public class Empleado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "cedula")
    private String cedula;
    @Column(name = "nombre")
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "salario")
    private Float salario;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "estado")
    private String estado;
    @Column(name = "numero_cuenta")
    private String numeroCuenta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleadoCodigo")
    private List<Nomina> nominaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleadoCodigo")
    private List<Novedadxconcepto> novedadxconceptoList;
    @JoinColumn(name = "cargo_cargoid", referencedColumnName = "cargoid")
    @ManyToOne(optional = false)
    private Cargo cargoCargoid;
    @JoinColumn(name = "banco_idbanco", referencedColumnName = "idbanco")
    @ManyToOne
    private Banco bancoIdbanco;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleadoCodigo")
    private List<Novedadmedic> novedadmedicList;

    public Empleado() {
    }

    public Empleado(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @XmlTransient
    public List<Nomina> getNominaList() {
        return nominaList;
    }

    public void setNominaList(List<Nomina> nominaList) {
        this.nominaList = nominaList;
    }

    @XmlTransient
    public List<Novedadxconcepto> getNovedadxconceptoList() {
        return novedadxconceptoList;
    }

    public void setNovedadxconceptoList(List<Novedadxconcepto> novedadxconceptoList) {
        this.novedadxconceptoList = novedadxconceptoList;
    }

    public Cargo getCargoCargoid() {
        return cargoCargoid;
    }

    public void setCargoCargoid(Cargo cargoCargoid) {
        this.cargoCargoid = cargoCargoid;
    }

    public Banco getBancoIdbanco() {
        return bancoIdbanco;
    }

    public void setBancoIdbanco(Banco bancoIdbanco) {
        this.bancoIdbanco = bancoIdbanco;
    }

    @XmlTransient
    public List<Novedadmedic> getNovedadmedicList() {
        return novedadmedicList;
    }

    public void setNovedadmedicList(List<Novedadmedic> novedadmedicList) {
        this.novedadmedicList = novedadmedicList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udec.modelo.Empleado[ codigo=" + codigo + " ]";
    }
    
}
