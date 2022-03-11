package com.danilo.domen;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SobaSlike implements OpstiDomen,Serializable {
private int idSobaSlike;
private String urlSlike;
//private List<String>urlSlikeBack;
private int idSobe;

public SobaSlike() {
	
}


	public int getIdSobaSlike() {
	return idSobaSlike;
}


public void setIdSobaSlike(int idSobaSlike) {
	this.idSobaSlike = idSobaSlike;
}


public String getUrlSlike() {
	return urlSlike;
}


public void setUrlSlike(String urlSlike) {
	this.urlSlike = urlSlike;
}


public int getIdSobe() {
	return idSobe;
}


public void setIdSobe(int idSobe) {
	this.idSobe = idSobe;
}


	@Override
	public String nazivTabele() {
		
		return "sobaSlike";
	}

	@Override
	public String nazivKolone() {

		return "(urlSlike,idSobe)";
	}

	@Override
	public String vrednostKolone() {
		
		return " values (?,?)";
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement vrati(PreparedStatement preparedStatement) {
		try {
			preparedStatement.setString(1, urlSlike);
			preparedStatement.setInt(2, idSobe);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return preparedStatement;
	}

	@Override
	public List<OpstiDomen> vratiSelect(ResultSet resultSet) {
		// TODO Auto-generated method stub
		return null;
	}


	

}
