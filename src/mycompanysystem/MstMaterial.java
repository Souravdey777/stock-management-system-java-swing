/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompanysystem;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author SOURAV
 */
@Entity
@Table(name = "mst_material", catalog = "inventory_system", schema = "")
@NamedQueries({
    @NamedQuery(name = "MstMaterial.findAll", query = "SELECT m FROM MstMaterial m")
    , @NamedQuery(name = "MstMaterial.findByMaterialCode", query = "SELECT m FROM MstMaterial m WHERE m.materialCode = :materialCode")
    , @NamedQuery(name = "MstMaterial.findByMaterialName", query = "SELECT m FROM MstMaterial m WHERE m.materialName = :materialName")
    , @NamedQuery(name = "MstMaterial.findByMaterialType", query = "SELECT m FROM MstMaterial m WHERE m.materialType = :materialType")
    , @NamedQuery(name = "MstMaterial.findByBrandName", query = "SELECT m FROM MstMaterial m WHERE m.brandName = :brandName")
    , @NamedQuery(name = "MstMaterial.findByActiveMaterial", query = "SELECT m FROM MstMaterial m WHERE m.activeMaterial = :activeMaterial")})
public class MstMaterial implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MATERIAL_CODE")
    private Integer materialCode;
    @Basic(optional = false)
    @Column(name = "MATERIAL_NAME")
    private String materialName;
    @Basic(optional = false)
    @Column(name = "MATERIAL_TYPE")
    private String materialType;
    @Basic(optional = false)
    @Column(name = "BRAND_NAME")
    private String brandName;
    @Basic(optional = false)
    @Column(name = "ACTIVE_MATERIAL")
    private String activeMaterial;

    public MstMaterial() {
    }

    public MstMaterial(Integer materialCode) {
        this.materialCode = materialCode;
    }

    public MstMaterial(Integer materialCode, String materialName, String materialType, String brandName, String activeMaterial) {
        this.materialCode = materialCode;
        this.materialName = materialName;
        this.materialType = materialType;
        this.brandName = brandName;
        this.activeMaterial = activeMaterial;
    }

    public Integer getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(Integer materialCode) {
        Integer oldMaterialCode = this.materialCode;
        this.materialCode = materialCode;
        changeSupport.firePropertyChange("materialCode", oldMaterialCode, materialCode);
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        String oldMaterialName = this.materialName;
        this.materialName = materialName;
        changeSupport.firePropertyChange("materialName", oldMaterialName, materialName);
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        String oldMaterialType = this.materialType;
        this.materialType = materialType;
        changeSupport.firePropertyChange("materialType", oldMaterialType, materialType);
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        String oldBrandName = this.brandName;
        this.brandName = brandName;
        changeSupport.firePropertyChange("brandName", oldBrandName, brandName);
    }

    public String getActiveMaterial() {
        return activeMaterial;
    }

    public void setActiveMaterial(String activeMaterial) {
        String oldActiveMaterial = this.activeMaterial;
        this.activeMaterial = activeMaterial;
        changeSupport.firePropertyChange("activeMaterial", oldActiveMaterial, activeMaterial);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (materialCode != null ? materialCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MstMaterial)) {
            return false;
        }
        MstMaterial other = (MstMaterial) object;
        if ((this.materialCode == null && other.materialCode != null) || (this.materialCode != null && !this.materialCode.equals(other.materialCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mycompanysystem.MstMaterial[ materialCode=" + materialCode + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
