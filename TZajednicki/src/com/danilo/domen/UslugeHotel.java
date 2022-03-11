package com.danilo.domen;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UslugeHotel implements OpstiDomen,Serializable {
	private int idUslugeHotel;
	private boolean pool;
	private boolean gym;
	private boolean bar;
	private boolean restoraunt;
	private boolean wellness;
	private int idHotel;
	
public UslugeHotel(){
	
}



	public int getIdUslugeHotel() {
	return idUslugeHotel;
}



public void setIdUslugeHotel(int idUslugeHotel) {
	this.idUslugeHotel = idUslugeHotel;
}



public boolean isPool() {
	return pool;
}



public void setPool(boolean pool) {
	this.pool = pool;
}



public boolean isGym() {
	return gym;
}



public void setGym(boolean gym) {
	this.gym = gym;
}



public boolean isBar() {
	return bar;
}



public void setBar(boolean bar) {
	this.bar = bar;
}



public boolean isRestoraunt() {
	return restoraunt;
}



public void setRestoraunt(boolean restoraunt) {
	this.restoraunt = restoraunt;
}



public boolean isWellness() {
	return wellness;
}



public void setWellness(boolean wellness) {
	this.wellness = wellness;
}



public int getIdHotel() {
	return idHotel;
}



public void setIdHotel(int idHotel) {
	this.idHotel = idHotel;
}



	@Override
	public String nazivTabele() {
		// TODO Auto-generated method stub
		return "uslugehotel";
	}

	@Override
	public String nazivKolone() {
		// TODO Auto-generated method stub
		return "(pool,bar,restoraunt,wellness,gym,idHotel)";
	}

	@Override
	public String vrednostKolone() {
		// TODO Auto-generated method stub
		return "values(?,?,?,?,?,?)";
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement vrati(PreparedStatement preparedStatement) {
		try {
			preparedStatement.setBoolean(1, pool);
			preparedStatement.setBoolean(2, bar);
			preparedStatement.setBoolean(3, restoraunt);
			preparedStatement.setBoolean(4, wellness);
			preparedStatement.setBoolean(5, gym);
			preparedStatement.setInt(6, idHotel);
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
