package com.danilo.domen;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UslugeSoba  implements OpstiDomen,Serializable{
private int idUslugeSoba;
private boolean wiFi;
private boolean tv;
private boolean balcony;
private boolean pets;
private boolean cigarette;
private int idSoba;

public UslugeSoba() {
	
}

	public int getIdUslugeSoba() {
	return idUslugeSoba;
}

	
public int getIdSoba() {
		return idSoba;
	}

	public void setIdSoba(int idSoba) {
		this.idSoba = idSoba;
	}

public void setIdUslugeSoba(int idUslugeSoba) {
	this.idUslugeSoba = idUslugeSoba;
}

public boolean isWiFi() {
	return wiFi;
}

public void setWiFi(boolean wiFi) {
	this.wiFi = wiFi;
}

public boolean isTv() {
	return tv;
}

public void setTv(boolean tv) {
	this.tv = tv;
}

public boolean isBalcony() {
	return balcony;
}

public void setBalcony(boolean balcony) {
	this.balcony = balcony;
}

public boolean isPets() {
	return pets;
}

public void setPets(boolean pets) {
	this.pets = pets;
}

public boolean isCigarette() {
	return cigarette;
}

public void setCigarette(boolean cigarette) {
	this.cigarette = cigarette;
}

	@Override
	public String nazivTabele() {
		// TODO Auto-generated method stub
		return "uslugeSoba";
	}

	@Override
	public String nazivKolone() {
		// TODO Auto-generated method stub
		return "(internet,televizor,terasa,kucni_ljubimci,pusenje,idSoba)";
	}

	@Override
	public String vrednostKolone() {
		// TODO Auto-generated method stub
		return "values (?,?,?,?,?,?)";
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement vrati(PreparedStatement preparedStatement) {
		try {
			preparedStatement.setBoolean(1, wiFi);
			preparedStatement.setBoolean(2, tv);
			preparedStatement.setBoolean(3, balcony);
			preparedStatement.setBoolean(4, pets);
			preparedStatement.setBoolean(5, cigarette);
			preparedStatement.setInt(6, idSoba);
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
