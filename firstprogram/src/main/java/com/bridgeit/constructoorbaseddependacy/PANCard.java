package com.bridgeit.constructoorbaseddependacy;

public class PANCard {

	private String pancardnumber;
	private String pancardholdername;
	public String getPancardnumber() {
		return pancardnumber;
	}
	public void setPancardnumber(String pancardnumber) {
		this.pancardnumber = pancardnumber;
	}
	public String getPancardholdername() {
		return pancardholdername;
	}
	public void setPancardholdername(String pancardholdername) {
		this.pancardholdername = pancardholdername;
	}
	@Override
	public String toString() {
		return "PANCard [pancardnumber=" + pancardnumber + ", pancardholdername=" + pancardholdername + "]";
	}
	
}
