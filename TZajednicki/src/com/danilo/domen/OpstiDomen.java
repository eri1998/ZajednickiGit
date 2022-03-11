package com.danilo.domen;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public interface OpstiDomen {
	public String nazivTabele();
	public String nazivKolone();
	public String vrednostKolone();
	public String getID();
	public PreparedStatement vrati(PreparedStatement preparedStatement);
	public List<OpstiDomen> vratiSelect(ResultSet resultSet);
}
