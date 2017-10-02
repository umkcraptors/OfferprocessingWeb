package com.bis.eps.offerprocessing.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bis.eps.common.entity.IEntity;

@Entity
@Table(name = "marketersproduct")

public class MarketerProduct implements IEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name = "Id")
	private long id;
	
	@Column(name = "MarketerId")
	private long MarketerId;
	
	@Column(name = "ProductId")
	private long Productid;
	
	@Column(name = "Price")
	private float Price;
	
	@Column(name = "Currency")
	private String Currency;
	
	@Column(name = "SKU")
	private String SKU;
	
	
	@Column(name = "CreatedTime")
	private Date CreatedTime;
	
	@Column(name = "CreatedBy")
	private String CreatedBy;
	
	@Column(name = "UpdatedTime")
	private Date UpdatedTime;
	
	@Transient
	private String updatedBy;
	

	@Transient
	private Boolean isActive;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public long getMarketerId() {
		return MarketerId;
	}


	public void setMarketerId(long marketerId) {
		MarketerId = marketerId;
	}


	public long getProductid() {
		return Productid;
	}


	public void setProductid(long productid) {
		Productid = productid;
	}


	public float getPrice() {
		return Price;
	}


	public void setPrice(float price) {
		Price = price;
	}


	public String getCurrency() {
		return Currency;
	}


	public void setCurrency(String currency) {
		Currency = currency;
	}


	public String getSKU() {
		return SKU;
	}


	public void setSKU(String sKU) {
		SKU = sKU;
	}


	public Date getCreatedTime() {
		return CreatedTime;
	}


	public void setCreatedTime(Date createdTime) {
		CreatedTime = createdTime;
	}


	public String getCreatedBy() {
		return CreatedBy;
	}


	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}


	public Date getUpdatedTime() {
		return UpdatedTime;
	}


	public void setUpdatedTime(Date updatedTime) {
		UpdatedTime = updatedTime;
	}


	public String getUpdatedBy() {
		return updatedBy;
	}


	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}


	public Boolean getIsActive() {
		return isActive;
	}


	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CreatedBy == null) ? 0 : CreatedBy.hashCode());
		result = prime * result + ((CreatedTime == null) ? 0 : CreatedTime.hashCode());
		result = prime * result + ((Currency == null) ? 0 : Currency.hashCode());
		result = prime * result + (int) (MarketerId ^ (MarketerId >>> 32));
		result = prime * result + Float.floatToIntBits(Price);
		result = prime * result + (int) (Productid ^ (Productid >>> 32));
		result = prime * result + ((SKU == null) ? 0 : SKU.hashCode());
		result = prime * result + ((UpdatedTime == null) ? 0 : UpdatedTime.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
		result = prime * result + ((updatedBy == null) ? 0 : updatedBy.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarketerProduct other = (MarketerProduct) obj;
		if (CreatedBy == null) {
			if (other.CreatedBy != null)
				return false;
		} else if (!CreatedBy.equals(other.CreatedBy))
			return false;
		if (CreatedTime == null) {
			if (other.CreatedTime != null)
				return false;
		} else if (!CreatedTime.equals(other.CreatedTime))
			return false;
		if (Currency == null) {
			if (other.Currency != null)
				return false;
		} else if (!Currency.equals(other.Currency))
			return false;
		if (MarketerId != other.MarketerId)
			return false;
		if (Float.floatToIntBits(Price) != Float.floatToIntBits(other.Price))
			return false;
		if (Productid != other.Productid)
			return false;
		if (SKU == null) {
			if (other.SKU != null)
				return false;
		} else if (!SKU.equals(other.SKU))
			return false;
		if (UpdatedTime == null) {
			if (other.UpdatedTime != null)
				return false;
		} else if (!UpdatedTime.equals(other.UpdatedTime))
			return false;
		if (id != other.id)
			return false;
		if (isActive == null) {
			if (other.isActive != null)
				return false;
		} else if (!isActive.equals(other.isActive))
			return false;
		if (updatedBy == null) {
			if (other.updatedBy != null)
				return false;
		} else if (!updatedBy.equals(other.updatedBy))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "MarketerProduct [id=" + id + ", MarketerId=" + MarketerId + ", Productid=" + Productid + ", Price="
				+ Price + ", Currency=" + Currency + ", SKU=" + SKU + ", CreatedTime=" + CreatedTime + ", CreatedBy="
				+ CreatedBy + ", UpdatedTime=" + UpdatedTime + ", updatedBy=" + updatedBy + ", isActive=" + isActive
				+ "]";
	}
	
	
	
	
	
	
	
	

}
