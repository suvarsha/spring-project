package com.example.demo.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stockexchange")
public class StockExchange {

			@Id
			private Integer id;
			private String stockEx;
			private String brief;
			private String contactAddress;
			private String remarks;
			@Override
			public String toString() {
				return "stockEx [id=" + id + ", stockEx=" + stockEx + ", brief=" + brief
						+ ", contactAddress=" + contactAddress + ", remarks=" + remarks + "]";
			}
			

			public Integer getId() {
				return id;
			}
			public void setId(Integer id) {
				this.id = id;
			}
			public String getstockEx() {
				return stockEx;
			}
			public void setstockEx(String stockEx) {
				this.stockEx = stockEx;
			}
			public String getBrief() {
				return brief;
			}
			public void setBrief(String brief) {
				this.brief = brief;
			}
			public String getContactAddress() {
				return contactAddress;
			}
			public void setContactAddress(String contactAddress) {
				this.contactAddress = contactAddress;
			}
			public String getRemarks() {
				return remarks;
			}
			public void setRemarks(String remarks) {
				this.remarks = remarks;
			}
			}
