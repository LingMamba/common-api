package com.mcc.vo;

import java.io.Serializable;

public class BaseVo implements Serializable{
	private String cityn;
	private String period;
	
	public String getCityn() {
		return cityn;
	}
	public void setCityn(String cityn) {
		this.cityn = cityn;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	
}
