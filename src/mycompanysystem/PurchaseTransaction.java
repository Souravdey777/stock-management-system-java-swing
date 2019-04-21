/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompanysystem;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author SOURAV
 */
@Entity
@Table(name = "purchase_transaction", catalog = "inventory_system", schema = "")
@NamedQueries({
    @NamedQuery(name = "PurchaseTransaction.findAll", query = "SELECT p FROM PurchaseTransaction p")
    , @NamedQuery(name = "PurchaseTransaction.findByPurchaseId", query = "SELECT p FROM PurchaseTransaction p WHERE p.purchaseId = :purchaseId")
    , @NamedQuery(name = "PurchaseTransaction.findByMaterialCode", query = "SELECT p FROM PurchaseTransaction p WHERE p.materialCode = :materialCode")
    , @NamedQuery(name = "PurchaseTransaction.findByPurchaseQuantity", query = "SELECT p FROM PurchaseTransaction p WHERE p.purchaseQuantity = :purchaseQuantity")
    , @NamedQuery(name = "PurchaseTransaction.findByCostPrice", query = "SELECT p FROM PurchaseTransaction p WHERE p.costPrice = :costPrice")
    , @NamedQuery(name = "PurchaseTransaction.findByVendorId", query = "SELECT p FROM PurchaseTransaction p WHERE p.vendorId = :vendorId")
    , @NamedQuery(name = "PurchaseTransaction.findByUserId", query = "SELECT p FROM PurchaseTransaction p WHERE p.userId = :userId")
    , @NamedQuery(name = "PurchaseTransaction.findByPurchaseDate", query = "SELECT p FROM PurchaseTransaction p WHERE p.purchaseDate = :purchaseDate")
    , @NamedQuery(name = "PurchaseTransaction.findByPurchaseTime", query = "SELECT p FROM PurchaseTransaction p WHERE p.purchaseTime = :purchaseTime")})
public class PurchaseTransaction implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PURCHASE_ID")
    private Integer purchaseId;
    @Basic(optional = false)
    @Column(name = "MATERIAL_CODE")
    private int materialCode;
    @Basic(optional = false)
    @Column(name = "PURCHASE_QUANTITY")
    private int purchaseQuantity;
    @Basic(optional = false)
    @Column(name = "COST_PRICE")
    private double costPrice;
    @Column(name = "VENDOR_ID")
    private String vendorId;
    @Basic(optional = false)
    @Column(name = "USER_ID")
    private int userId;
    @Basic(optional = false)
    @Column(name = "PURCHASE_DATE")
    @Temporal(TemporalType.DATE)
    private Date purchaseDate;
    @Basic(optional = false)
    @Column(name = "PURCHASE_TIME")
    @Temporal(TemporalType.TIME)
    private Date purchaseTime;

    public PurchaseTransaction() {
    }

    public PurchaseTransaction(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public PurchaseTransaction(Integer purchaseId, int materialCode, int purchaseQuantity, double costPrice, int userId, Date purchaseDate, Date purchaseTime) {
        this.purchaseId = purchaseId;
        this.materialCode = materialCode;
        this.purchaseQuantity = purchaseQuantity;
        this.costPrice = costPrice;
        this.userId = userId;
        this.purchaseDate = purchaseDate;
        this.purchaseTime = purchaseTime;
    }

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        Integer oldPurchaseId = this.purchaseId;
        this.purchaseId = purchaseId;
        changeSupport.firePropertyChange("purchaseId", oldPurchaseId, purchaseId);
    }

    public int getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(int materialCode) {
        int oldMaterialCode = this.materialCode;
        this.materialCode = materialCode;
        changeSupport.firePropertyChange("materialCode", oldMaterialCode, materialCode);
    }

    public int getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public void setPurchaseQuantity(int purchaseQuantity) {
        int oldPurchaseQuantity = this.purchaseQuantity;
        this.purchaseQuantity = purchaseQuantity;
        changeSupport.firePropertyChange("purchaseQuantity", oldPurchaseQuantity, purchaseQuantity);
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        double oldCostPrice = this.costPrice;
        this.costPrice = costPrice;
        changeSupport.firePropertyChange("costPrice", oldCostPrice, costPrice);
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        String oldVendorId = this.vendorId;
        this.vendorId = vendorId;
        changeSupport.firePropertyChange("vendorId", oldVendorId, vendorId);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        int oldUserId = this.userId;
        this.userId = userId;
        changeSupport.firePropertyChange("userId", oldUserId, userId);
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        Date oldPurchaseDate = this.purchaseDate;
        this.purchaseDate = purchaseDate;
        changeSupport.firePropertyChange("purchaseDate", oldPurchaseDate, purchaseDate);
    }

    public Date getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(Date purchaseTime) {
        Date oldPurchaseTime = this.purchaseTime;
        this.purchaseTime = purchaseTime;
        changeSupport.firePropertyChange("purchaseTime", oldPurchaseTime, purchaseTime);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (purchaseId != null ? purchaseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PurchaseTransaction)) {
            return false;
        }
        PurchaseTransaction other = (PurchaseTransaction) object;
        if ((this.purchaseId == null && other.purchaseId != null) || (this.purchaseId != null && !this.purchaseId.equals(other.purchaseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mycompanysystem.PurchaseTransaction[ purchaseId=" + purchaseId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
