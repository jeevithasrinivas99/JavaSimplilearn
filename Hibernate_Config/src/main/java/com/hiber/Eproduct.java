package com.hiber;

import java.math.BigDecimal;
import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Eproduct {
	private long ID;
    private String name;
    private BigDecimal price;
    public Date dop ;
	
	
        public long getID() {
			return ID;
		}
		
		
		public void setID(long iD) {
			ID = iD;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public BigDecimal getPrice() {
			return price;
		}
		public void setPrice(BigDecimal price) {
			this.price = price;
		}
			public Date getDop() {
				return dop;
			}
			public void setDop(Date dop) {
				this.dop = dop;
			}


			@Override
			public String toString() {
				return "Eproduct [ID=" + ID + ", name=" + name + ", price=" + price + ", dop=" + dop + "]";
			}


}
			