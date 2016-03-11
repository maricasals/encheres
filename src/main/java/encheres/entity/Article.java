/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encheres.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author admin
 */
@Entity
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(length = 64)
    private String nom;
    
    private long prixActuel;
    private long prixDepart;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateVente;
    
    @Enumerated(EnumType.STRING)
    private StatusVente status;
    
    @ManyToOne
    @JoinColumn(name = "UTILISATEUR_ID")
    private Utilisateur utilisateur;
    
    @OneToMany(mappedBy = "article")
    private List<Enchere> encheres = new ArrayList<>();
    
    @ManyToOne
    @JoinColumn(name = "CATEGORIE_ID")
    private Categorie categorie;
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public long getPrixActuel() {
        return prixActuel;
    }

    public void setPrixActuel(long prixActuel) {
        this.prixActuel = prixActuel;
    }

    public long getPrixDepart() {
        return prixDepart;
    }

    public void setPrixDepart(long prixDepart) {
        this.prixDepart = prixDepart;
    }

    public Date getDateVente() {
        return dateVente;
    }

    public void setDateVente(Date dateVente) {
        this.dateVente = dateVente;
    }

    public StatusVente getStatus() {
        return status;
    }

    public void setStatus(StatusVente status) {
        this.status = status;
    }

    public Article() {
    }

    public Article(String nom, long prixDepart, Date dateVente, StatusVente status) {
        this.nom = nom;
        this.prixDepart = prixDepart;
        this.dateVente = dateVente;
        this.status = status;
    }

    public Article(String nom, long prixDepart, StatusVente status) {
        this.nom = nom;
        this.prixDepart = prixDepart;
        this.status = status;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Article)) {
            return false;
        }
        Article other = (Article) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "encheres.entity.Article[ id=" + id + " ]";
    }
    
}
