package com.danilo.domen;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Hotel implements Serializable,OpstiDomen {
	private int idHotel;
	private String kljucnaRec;
	private String nazivHotel;
	private String brZvezdica;
	private String grad;
	private String drzava;
	HotelSlike hotelSlike;
	private List<String> urlSlika;
	private List<Integer>statusFotografije;
    private int idAdresa;
    private int idUser;
    private List<Hotel>listHotels;
public Hotel() {
	listHotels = new ArrayList<>();
	urlSlika = new ArrayList<>();
	hotelSlike = new HotelSlike();
	statusFotografije=new ArrayList<>();
	
}


	public List<Hotel> getListHotels() {
	return listHotels;
}


public void setListHotels(List<Hotel> listHotels) {
	this.listHotels = listHotels;
}


	public String getKljucnaRec() {
	return kljucnaRec;
}


public void setKljucnaRec(String kljucnaRec) {
	this.kljucnaRec = kljucnaRec;
}


public String getGrad() {
	return grad;
}


public void setGrad(String grad) {
	this.grad = grad;
}


public String getDrzava() {
	return drzava;
}


public void setDrzava(String drzava) {
	this.drzava = drzava;
}


public List<String> getUrlSlika() {
	return urlSlika;
}


public void setUrlSlika(List<String> string) {
	this.urlSlika = string;
}


	public int getIdHotel() {
	return idHotel;
}


public void setIdHotel(int idHotel) {
	this.idHotel = idHotel;
}


public String getNazivHotel() {
	return nazivHotel;
}


public void setNazivHotel(String nazivHotel) {
	this.nazivHotel = nazivHotel;
}


	public String getBrZvezdica() {
	return brZvezdica;
}

public void setBrZvezdica(String brZvezdica) {
	this.brZvezdica = brZvezdica;
}



	public int getIdAdresa() {
	return idAdresa;
}


public void setIdAdresa(int idAdresa) {
	this.idAdresa = idAdresa;
}


public int getIdUser() {
	return idUser;
}


public void setIdUser(int idUser) {
	this.idUser = idUser;
}


	public HotelSlike getHotelSlike() {
	return hotelSlike;
}


public void setHotelSlike(HotelSlike hotelSlike) {
	this.hotelSlike = hotelSlike;
}



	public List<Integer> getStatusFotografije() {
	return statusFotografije;
}


public void setStatusFotografije(List<Integer> statusFotografije) {
	this.statusFotografije = statusFotografije;
}


	@Override
	public String nazivTabele() {
		
		return "hotel";
	}

	@Override
	public String nazivKolone() {
		
		return "(naziv,brZvezdica,idAdresa,idUser)";
	}

	@Override
	public String vrednostKolone() {
		
		return " values (?,?,?,?)";
	}

	@Override
	public PreparedStatement vrati(PreparedStatement preparedStatement) {
		try {
			preparedStatement.setString(1,nazivHotel);
			preparedStatement.setString(2, brZvezdica);
			preparedStatement.setInt(3, idAdresa);
			preparedStatement.setInt(4, idUser);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return preparedStatement;
	}


	@Override
	public List<OpstiDomen> vratiSelect(ResultSet resultSet) {
		List<OpstiDomen>listHotel = new ArrayList<OpstiDomen>();
		try {
			while(resultSet.next()) {
				idHotel = resultSet.getInt("idHotel");
				nazivHotel = resultSet.getString("naziv");
				brZvezdica = resultSet.getString("brZvezdica");
                
			
				Hotel hotel = new Hotel();
				hotel.setBrZvezdica(brZvezdica);
				hotel.setNazivHotel(nazivHotel);
				hotel.setIdHotel(idHotel);
				
				listHotel.add(hotel);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listHotel;
	}


	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return "idHotel";
	}

}
