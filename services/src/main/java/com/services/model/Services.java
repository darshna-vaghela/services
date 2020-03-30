package com.services.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "services")
@EntityListeners(AuditingEntityListener.class)
public class Services {

	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long categoryid;

	@Column(name = "services_category", nullable = false)
	private String servicescategory;

	@Column(name = "service_category_id", nullable = false)
	private String servicecategoryid;

	@Column(name = "service_time_hrs", nullable = false)
	private int servicetime;

	@Column(name = "service_id_name", nullable = false)
	private String serviceidname;

	@Column(name = "service_cost", nullable = false)
	private double servicecost;

	@Column(name = "service_details", nullable = false)
	private String servicedetails;

	public Services() {
		super();
	}

	public long getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(long categoryid) {
		this.categoryid = categoryid;
	}

	public String getServicescategory() {
		return servicescategory;
	}

	public void setServicescategory(String servicescategory) {
		this.servicescategory = servicescategory;
	}

	public String getServicecategoryid() {
		return servicecategoryid;
	}

	public void setServicecategoryid(String servicecategoryid) {
		this.servicecategoryid = servicecategoryid;
	}

	public int getServicetime() {
		return servicetime;
	}

	public void setServicetime(int servicetime) {
		this.servicetime = servicetime;
	}

	public String getServiceidname() {
		return serviceidname;
	}

	public void setServiceidname(String serviceidname) {
		this.serviceidname = serviceidname;
	}

	public double getServicecost() {
		return servicecost;
	}

	public void setServicecost(double servicecost) {
		this.servicecost = servicecost;
	}

	public String getServicedetails() {
		return servicedetails;
	}

	public void setServicedetails(String servicedetails) {
		this.servicedetails = servicedetails;
	}

	public Services(Long categoryid, String servicescategory, String servicecategoryid, int servicetime,
			String serviceidname, double servicecost, String servicedetails) {
		super();
		this.categoryid = categoryid;
		this.servicescategory = servicescategory;
		this.servicecategoryid = servicecategoryid;
		this.servicetime = servicetime;
		this.serviceidname = serviceidname;
		this.servicecost = servicecost;
		this.servicedetails = servicedetails;
	}

	@Override
	public String toString() {
		return "Services [ servicescategory=" + servicescategory + ", servicecategoryid="
				+ servicecategoryid + ", servicetime=" + servicetime + ", serviceidname=" + serviceidname
				+ ", servicecost=" + servicecost + ", servicedetails=" + servicedetails + "]";
	}

	


}