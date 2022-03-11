package com.danilo.domen;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Adresa implements Serializable, OpstiDomen {
private int idAdresa;
private String ulica;
private String broj;
private int idGrad;

public Adresa() {
	
}



	public int getIdAdresa() {
	return idAdresa;
}



public void setIdAdresa(int idAdresa) {
	this.idAdresa = idAdresa;
}



public String getUlica() {
	return ulica;
}



public void setUlica(String ulica) {
	this.ulica = ulica;
}



public String getBroj() {
	return broj;
}



public void setBroj(String broj) {
	this.broj = broj;
}



public int getIdGrad() {
	return idGrad;
}



public void setIdGrad(int idGrad) {
	this.idGrad = idGrad;
}



	@Override
	public String nazivTabele() {
		
		return "adresa";
	}

	@Override
	public String nazivKolone() {
		
		return "(ulica,broj,idGrad)";
	}

	@Override
	public String vrednostKolone() {
		
		return "values (?,?,?)";
	}

	@Override
	public String getID() {
		
		return "idAdresa";
	}

	@Override
	public PreparedStatement vrati(PreparedStatement preparedStatement) {
		try {
			preparedStatement.setString(1, ulica);
			preparedStatement.setString(2, broj);
			preparedStatement.setInt(3, idGrad);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return preparedStatement;
	}

	@Override
	public List<OpstiDomen> vratiSelect(ResultSet resultSet) {
		List<OpstiDomen>listAdresa = new ArrayList<>();
		try {
			if(resultSet.next()) {
				Adresa adresa = new Adresa();
				ulica = resultSet.getString("ulica");
				adresa.setUlica(ulica);
				broj = resultSet.getString("broj");
				adresa.setBroj(broj);
				idAdresa = resultSet.getInt("idAdresa");
				adresa.setIdAdresa(idAdresa);
		    	listAdresa.add(adresa);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listAdresa;
	}

}
