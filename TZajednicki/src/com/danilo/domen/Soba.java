package com.danilo.domen;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Soba implements OpstiDomen,Serializable {
private int idSobe;
private String tipSobe;
private int povrsinaSobe;
private int spratSobe;
private int brSobe;
private int cenaSobe;
private int idHotel;
private List<Soba>listSoba;
private SobaSlike slike;
private List<String>url;
public Soba() {
	listSoba = new ArrayList<>();
	slike = new SobaSlike();
	url=new ArrayList<>();
}


	public int getIdSobe() {
	return idSobe;
}


public void setIdSobe(int idSobe) {
	this.idSobe = idSobe;
}


public String getTipSobe() {
	return tipSobe;
}


public void setTipSobe(String tipSobe) {
	this.tipSobe = tipSobe;
}


public int getPovrsinaSobe() {
	return povrsinaSobe;
}


public void setPovrsinaSobe(int povrsinaSobe) {
	this.povrsinaSobe = povrsinaSobe;
}


public int getSpratSobe() {
	return spratSobe;
}


public void setSpratSobe(int spratSobe) {
	this.spratSobe = spratSobe;
}


public int getBrSobe() {
	return brSobe;
}


public void setBrSobe(int brSobe) {
	this.brSobe = brSobe;
}


public int getCenaSobe() {
	return cenaSobe;
}


public void setCenaSobe(int cenaSobe) {
	this.cenaSobe = cenaSobe;
}


	public int getIdHotel() {
	return idHotel;
}


public void setIdHotel(int idHotel) {
	this.idHotel = idHotel;
}



	public List<Soba> getListSoba() {
	return listSoba;
}


public void setListSoba(List<Soba> listSoba) {
	this.listSoba = listSoba;
}



	public SobaSlike getSlike() {
	return slike;
}


public void setSlike(SobaSlike slike) {
	this.slike = slike;
}


	public List<String> getUrl() {
	return url;
}


public void setUrl(List<String> url) {
	this.url = url;
}


	@Override
	public String nazivTabele() {
		
		return "soba";
	}

	@Override
	public String nazivKolone() {
		
		return "(tipSobe,povrsina,cena,brSobe,sprat,idHotel)";
	}

	@Override
	public String vrednostKolone() {
		
		return "values (?,?,?,?,?,?)";
	}

	@Override
	public String getID() {
		
		return "idSobe";
	}

	@Override
	public PreparedStatement vrati(PreparedStatement preparedStatement) {
	try {
		preparedStatement.setString(1, tipSobe);
		preparedStatement.setInt(2, povrsinaSobe);
		preparedStatement.setInt(3, cenaSobe);
		preparedStatement.setInt(4, brSobe);
		preparedStatement.setInt(5, spratSobe);
		preparedStatement.setInt(6, idHotel);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return preparedStatement;
	}

	@Override
	public List<OpstiDomen> vratiSelect(ResultSet resultSet) {
		List<OpstiDomen>list = new ArrayList<>();
		try {
			while(resultSet.next()) {
				Soba soba = new Soba();
				idSobe = resultSet.getInt("idSobe");
				soba.setIdSobe(idSobe);
				brSobe = resultSet.getInt("brSobe");
				spratSobe = resultSet.getInt("sprat");
				soba.setBrSobe(brSobe);
				soba.setSpratSobe(spratSobe);
				idHotel = resultSet.getInt("idHotel");
				soba.setIdHotel(idHotel);
				list.add(soba);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
