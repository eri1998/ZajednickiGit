package com.danilo.domen;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RezervacijaSobe  implements OpstiDomen,Serializable{
private int idRezervacije;
private String datumDolaska;
private String datumOdlaska;
private int brojDana;
private double cena;
private int idSobe;
private int idUser;



	public int getIdUser() {
	return idUser;
}

public void setIdUser(int idUser) {
	this.idUser = idUser;
}

	public String getDatumDolaska() {
	return datumDolaska;
}

public void setDatumDolaska(String datumDolaska) {
	this.datumDolaska = datumDolaska;
}

public String getDatumOdlaska() {
	return datumOdlaska;
}

public void setDatumOdlaska(String datumOdlaska2) {
	this.datumOdlaska = datumOdlaska2;
}

public int getBrojDana() {
	return brojDana;
}

public void setBrojDana(int brojDana) {
	this.brojDana = brojDana;
}

public double getCena() {
	return cena;
}

public void setCena(double cena) {
	this.cena = cena;
}

public int getIdSobe() {
	return idSobe;
}

public void setIdSobe(int idSobe) {
	this.idSobe = idSobe;
}

	@Override
	public String nazivTabele() {
		// TODO Auto-generated method stub
		return "rezervacije";
	}

	@Override
	public String nazivKolone() {
		// TODO Auto-generated method stub
		return "(datumDolaska,datumOdlaska,brojNocenja,ukupnaCena,idSobe,idUser)";
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
			preparedStatement.setString(1, datumDolaska);
			preparedStatement.setString(2, datumOdlaska);
			preparedStatement.setInt(3, brojDana);
			preparedStatement.setDouble(4, cena);
			preparedStatement.setInt(5, idSobe);
			preparedStatement.setInt(6, idUser);
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
				RezervacijaSobe rezervacijaSobe = new RezervacijaSobe();
				datumDolaska = resultSet.getString("datumDolaska");
				datumOdlaska = resultSet.getString("datumOdlaska");
				brojDana = resultSet.getInt("brojNocenja");
				cena = resultSet.getDouble("ukupnaCena");
				idSobe = resultSet.getInt("idSobe");
				idUser = resultSet.getInt("idUser");
				
				rezervacijaSobe.setBrojDana(brojDana);
				rezervacijaSobe.setCena(cena);
				rezervacijaSobe.setDatumDolaska(datumDolaska);
				rezervacijaSobe.setDatumOdlaska(datumOdlaska);
				rezervacijaSobe.setIdSobe(idSobe);
				rezervacijaSobe.setIdUser(idUser);
				
				list.add(rezervacijaSobe);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
