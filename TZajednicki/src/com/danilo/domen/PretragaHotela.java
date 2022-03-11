package com.danilo.domen;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PretragaHotela implements Serializable{
private String kljucnaRec;
private String brZvezdica;
private String nazivHotel;
private List<Hotel>listaPretrazenihHotela;
public PretragaHotela() {
	listaPretrazenihHotela = new ArrayList<Hotel>();
}

	public String getNazivHotel() {
	return nazivHotel;
}

public List<Hotel> getListaPretrazenihHotela() {
		return listaPretrazenihHotela;
	}

	public void setListaPretrazenihHotela(List<Hotel> listaPretrazenihHotela) {
		this.listaPretrazenihHotela = listaPretrazenihHotela;
	}

public void setNazivHotel(String nazivHotel) {
	this.nazivHotel = nazivHotel;
}

	public String getKljucnaRec() {
	return kljucnaRec;
}

public String getBrZvezdica() {
		return brZvezdica;
	}

	public void setBrZvezdica(String brZvezdica) {
		this.brZvezdica = brZvezdica;
	}

public void setKljucnaRec(String kljucnaRec) {
	this.kljucnaRec = kljucnaRec;
}

}
