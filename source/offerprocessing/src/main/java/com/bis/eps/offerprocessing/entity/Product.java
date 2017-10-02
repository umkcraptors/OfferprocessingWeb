package com.bis.eps.offerprocessing.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bis.eps.common.entity.IEntity;

@Entity
@Table(name = "product")
public class Product implements IEntity {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -282333059996488865L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "Id")
	private long id;
	
	@Column(name = "Manufacturer")
	private String manufacturer;

	@Column(name = "Name")
	private String name;

	@Column(name = "Description")
	private String Description;

	@Column(name = "EAN")
	private String EAN;
	
	@Column(name = "GTIN")
	private String GTIN;
	
	@Column(name = "UOM")
	private String UOM;
	
	@Column(name = "CreatedTime")
	private Date CreatedDate;
	
	
	@Transient
	private String createdBy;
	
	@Column(name = "UpdatedTime")
	private Date UpdatedTime;

	@Transient
	private String updatedBy;
	
	@Transient
	private Date updatedDate;
	
	@Transient
	private Boolean isActive;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getEAN() {
		return EAN;
	}

	public void setEAN(String eAN) {
		EAN = eAN;
	}

	public String getGTIN() {
		return GTIN;
	}

	public void setGTIN(String gTIN) {
		GTIN = gTIN;
	}

	public String getUOM() {
		return UOM;
	}

	public void setUOM(String uOM) {
		UOM = uOM;
	}

	public Date getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(Date createdDate) {
		CreatedDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
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

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
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
		result = prime * result + ((CreatedDate == null) ? 0 : CreatedDate.hashCode());
		result = prime * result + ((Description == null) ? 0 : Description.hashCode());
		result = prime * result + ((EAN == null) ? 0 : EAN.hashCode());
		result = prime * result + ((GTIN == null) ? 0 : GTIN.hashCode());
		result = prime * result + ((UOM == null) ? 0 : UOM.hashCode());
		result = prime * result + ((UpdatedTime == null) ? 0 : UpdatedTime.hashCode());
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
		result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((updatedBy == null) ? 0 : updatedBy.hashCode());
		result = prime * result + ((updatedDate == null) ? 0 : updatedDate.hashCode());
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
		Product other = (Product) obj;
		if (CreatedDate == null) {
			if (other.CreatedDate != null)
				return false;
		} else if (!CreatedDate.equals(other.CreatedDate))
			return false;
		if (Description == null) {
			if (other.Description != null)
				return false;
		} else if (!Description.equals(other.Description))
			return false;
		if (EAN == null) {
			if (other.EAN != null)
				return false;
		} else if (!EAN.equals(other.EAN))
			return false;
		if (GTIN == null) {
			if (other.GTIN != null)
				return false;
		} else if (!GTIN.equals(other.GTIN))
			return false;
		if (UOM == null) {
			if (other.UOM != null)
				return false;
		} else if (!UOM.equals(other.UOM))
			return false;
		if (UpdatedTime == null) {
			if (other.UpdatedTime != null)
				return false;
		} else if (!UpdatedTime.equals(other.UpdatedTime))
			return false;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (id != other.id)
			return false;
		if (isActive == null) {
			if (other.isActive != null)
				return false;
		} else if (!isActive.equals(other.isActive))
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (updatedBy == null) {
			if (other.updatedBy != null)
				return false;
		} else if (!updatedBy.equals(other.updatedBy))
			return false;
		if (updatedDate == null) {
			if (other.updatedDate != null)
				return false;
		} else if (!updatedDate.equals(other.updatedDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", manufacturer=" + manufacturer + ", name=" + name + ", Description="
				+ Description + ", EAN=" + EAN + ", GTIN=" + GTIN + ", UOM=" + UOM + ", CreatedDate=" + CreatedDate
				+ ", createdBy=" + createdBy + ", UpdatedTime=" + UpdatedTime + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + ", isActive=" + isActive + "]";
	}
	
	
	
}
