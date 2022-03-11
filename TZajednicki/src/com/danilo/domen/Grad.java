package com.danilo.domen;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Grad implements Serializable,OpstiDomen{
	private int idGrad;
	private String imeGrada;
	private int idDrzave;
	
	public Grad() {
		
	}

	
	
	public int getIdGrad() {
		return idGrad;
	}



	public void setIdGrad(int idGrad) {
		this.idGrad = idGrad;
	}



	public String getImeGrada() {
		return imeGrada;
	}



	public void setImeGrada(String imeGrada) {
		this.imeGrada = imeGrada;
	}



	public int getIdDrzave() {
		return idDrzave;
	}



	public void setIdDrzave(int idDrzave) {
		this.idDrzave = idDrzave;
	}



	@Override
	public String nazivTabele() {
	
		return "grad";
	}

	@Override
	public String nazivKolone() {
		
		return "(grad,idDrzave)";
	}

	@Override
	public String vrednostKolone() {
		
		return "values (?,?)";
	}

	@Override
	public String getID() {
		
		return "idGrad";
	}

	@Override
	public PreparedStatement vrati(PreparedStatement preparedStatement) {
		try {
			preparedStatement.setString(1,imeGrada);
			preparedStatement.setInt(2, idDrzave);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return preparedStatement;
	}

	@Override
	public List<OpstiDomen> vratiSelect(ResultSet resultSet) {
		List<OpstiDomen>listGrad = new ArrayList<OpstiDomen>();
		try {
			if(resultSet.next()) {
				Grad grad = new Grad();
				idGrad = resultSet.getInt("idGrad");
				grad.setIdGrad(idGrad);
				imeGrada = resultSet.getString("grad");
				grad.setImeGrada(imeGrada);
				idDrzave = resultSet.getInt("idDrzave");
				grad.setIdDrzave(idDrzave);
				listGrad.add(grad);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listGrad;
	}

}
