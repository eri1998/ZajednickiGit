package com.danilo.domen;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Drzava implements Serializable,OpstiDomen {
private int idDrzave;
private String drzava1;

public Drzava() {
	
}


	public int getIdDrzave() {
	return idDrzave;
}


public void setIdDrzave(int idDrzave) {
	this.idDrzave = idDrzave;
}


public String getDrzava() {
	return drzava1;
}


public void setDrzava(String drzava) {
	this.drzava1 = drzava;
}


	@Override
	public String nazivTabele() {
		
		return "drzava";
	}

	@Override
	public String nazivKolone() {
		
		return "(drzava)";
	}

	@Override
	public String vrednostKolone() {
		
		return " values (?)";
	}

	@Override
	public PreparedStatement vrati(PreparedStatement preparedStatement) {
		try {
			preparedStatement.setString(1, drzava1);
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
			if(resultSet.next()) {
				Drzava drzava = new Drzava();
				drzava1 = resultSet.getString("drzava");
				drzava.setDrzava(drzava1);
				idDrzave = resultSet.getInt("idDrzave");
				drzava.setIdDrzave(idDrzave);
				list.add(drzava);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}


	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return "idDrzave";
	}

}
