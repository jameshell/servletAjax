/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author james
 */
@Entity
@Table(name = "persona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
    @NamedQuery(name = "Persona.findByCedulaPersona", query = "SELECT p FROM Persona p WHERE p.cedulaPersona = :cedulaPersona"),
    @NamedQuery(name = "Persona.findByNombrePersona", query = "SELECT p FROM Persona p WHERE p.nombrePersona = :nombrePersona"),
    @NamedQuery(name = "Persona.findByApellidoPersona", query = "SELECT p FROM Persona p WHERE p.apellidoPersona = :apellidoPersona"),
    @NamedQuery(name = "Persona.findByTelefonoPersona", query = "SELECT p FROM Persona p WHERE p.telefonoPersona = :telefonoPersona"),
    @NamedQuery(name = "Persona.findByCelularPersona", query = "SELECT p FROM Persona p WHERE p.celularPersona = :celularPersona")})
public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cedulaPersona")
    private Integer cedulaPersona;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombrePersona")
    private String nombrePersona;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "apellidoPersona")
    private String apellidoPersona;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telefonoPersona")
    private int telefonoPersona;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "celularPersona")
    private String celularPersona;

    public Persona() {
    }

    public Persona(Integer cedulaPersona) {
        this.cedulaPersona = cedulaPersona;
    }

    public Persona(Integer cedulaPersona, String nombrePersona, String apellidoPersona, int telefonoPersona, String celularPersona) {
        this.cedulaPersona = cedulaPersona;
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.telefonoPersona = telefonoPersona;
        this.celularPersona = celularPersona;
    }

    public Integer getCedulaPersona() {
        return cedulaPersona;
    }

    public void setCedulaPersona(Integer cedulaPersona) {
        this.cedulaPersona = cedulaPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public int getTelefonoPersona() {
        return telefonoPersona;
    }

    public void setTelefonoPersona(int telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }

    public String getCelularPersona() {
        return celularPersona;
    }

    public void setCelularPersona(String celularPersona) {
        this.celularPersona = celularPersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedulaPersona != null ? cedulaPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.cedulaPersona == null && other.cedulaPersona != null) || (this.cedulaPersona != null && !this.cedulaPersona.equals(other.cedulaPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "VO.Persona[ cedulaPersona=" + cedulaPersona + " ]";
    }
    
}
