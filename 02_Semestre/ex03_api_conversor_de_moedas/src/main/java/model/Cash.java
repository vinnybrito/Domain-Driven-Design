package model;

public class Cash {
	private CashDetails USDBRL;
	private CashDetails EURBRL;
	private CashDetails BTCBRL;
	
	public CashDetails getUSDBRL() {
		return USDBRL;
	}
	
	public void setUSDBRL(CashDetails uSDBRL) {
		USDBRL = uSDBRL;
	}
	
	public CashDetails getEURBRL() {
		return EURBRL;
	}
	
	public void setEURBRL(CashDetails eURBRL) {
		EURBRL = eURBRL;
	}
	
	public CashDetails getBTCBRL() {
		return BTCBRL;
	}
	
	public void setBTCBRL(CashDetails bTCBRL) {
		BTCBRL = bTCBRL;
	}

}
