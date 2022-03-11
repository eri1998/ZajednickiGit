package com.danilo.transferKlasa;

import java.io.Serializable;

public class TransferKlasa implements Serializable {
private int operacija;
private Object klijent_objekat_request;
private Object server_objekat_response;
private String poruka;

public Object getKlijent_objekat_request() {
	return klijent_objekat_request;
}
public void setKlijent_objekat_request(Object klijent_objekat_request) {
	this.klijent_objekat_request = klijent_objekat_request;
}
public Object getServer_objekat_response() {
	return server_objekat_response;
}
public void setServer_objekat_response(Object server_objekat_response) {
	this.server_objekat_response = server_objekat_response;
}
public int getOperacija() {
	return operacija;
}
public void setOperacija(int operacija) {
	this.operacija = operacija;
}
public String getPoruka() {
	return poruka;
}
public void setPoruka(String poruka) {
	this.poruka = poruka;
}

}
