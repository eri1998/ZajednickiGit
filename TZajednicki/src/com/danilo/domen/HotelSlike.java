package com.danilo.domen;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HotelSlike implements OpstiDomen,Serializable {
private int idHotelSlike;
private String urlSlike;
private int statusForografije;
private int idHotel;
	
	public HotelSlike() {
		
	}
	
	
	public int getStatusForografije() {
		return statusForografije;
	}


	public void setStatusForografije(int statusForografije) {
		this.statusForografije = statusForografije;
	}


	public int getIdHotelSlike() {
		return idHotelSlike;
	}


	public void setIdHotelSlike(int idHotelSlike) {
		this.idHotelSlike = idHotelSlike;
	}


	public String getUrlSlike() {
		return urlSlike;
	}


	public void setUrlSlike(String urlSlike) {
		this.urlSlike = urlSlike;
	}


	public int getIdHotel() {
		return idHotel;
	}


	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}


	@Override
	public String nazivTabele() {
		
		return "hotelSlike";
	}

	@Override
	public String nazivKolone() {
		
		return "(urlSlike,statusFotografije,idHotel)";
	}

	@Override
	public String vrednostKolone() {
		
		return "values (?,?,?)";
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
			preparedStatement.setInt(2, statusForografije);
			preparedStatement.setInt(3, idHotel);
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
				HotelSlike hotelSlike = new HotelSlike();
				statusForografije=resultSet.getInt("statusFotografije");
				hotelSlike.setStatusForografije(statusForografije);
				list.add(hotelSlike);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
