/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abinash.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author abinash
 */
@Entity
@Table(name = "exceptionInfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExceptionInfo.findAll", query = "SELECT e FROM ExceptionInfo e"),
    @NamedQuery(name = "ExceptionInfo.findByIdexceptionInfo", query = "SELECT e FROM ExceptionInfo e WHERE e.idexceptionInfo = :idexceptionInfo"),
    @NamedQuery(name = "ExceptionInfo.findByCategory", query = "SELECT e FROM ExceptionInfo e WHERE e.category = :category"),
    @NamedQuery(name = "ExceptionInfo.findByTopic", query = "SELECT e FROM ExceptionInfo e WHERE e.topic = :topic")})
public class ExceptionInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idexceptionInfo")
    private Integer idexceptionInfo;
    @Size(max = 45)
    @Column(name = "category")
    private String category;
    @Size(max = 45)
    @Column(name = "topic")
    private String topic;
    @Lob
    @Size(max = 65535)
    @Column(name = "detail")
    private String detail;
    @Lob
    @Size(max = 65535)
    @Column(name = "solution")
    private String solution;
    @Lob
    @Size(max = 65535)
    @Column(name = "solutionref")
    private String solutionref;

    public ExceptionInfo() {
    }

    public ExceptionInfo(Integer idexceptionInfo) {
        this.idexceptionInfo = idexceptionInfo;
    }

    public Integer getIdexceptionInfo() {
        return idexceptionInfo;
    }

    public void setIdexceptionInfo(Integer idexceptionInfo) {
        this.idexceptionInfo = idexceptionInfo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getSolutionref() {
        return solutionref;
    }

    public void setSolutionref(String solutionref) {
        this.solutionref = solutionref;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idexceptionInfo != null ? idexceptionInfo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExceptionInfo)) {
            return false;
        }
        ExceptionInfo other = (ExceptionInfo) object;
        if ((this.idexceptionInfo == null && other.idexceptionInfo != null) || (this.idexceptionInfo != null && !this.idexceptionInfo.equals(other.idexceptionInfo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.abinash.entities.ExceptionInfo[ idexceptionInfo=" + idexceptionInfo + " ]";
    }
    
}
