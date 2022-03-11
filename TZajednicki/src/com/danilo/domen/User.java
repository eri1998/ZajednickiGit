package com.danilo.domen;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class User implements OpstiDomen,Serializable{
private int idUser;
private String username;
private String fullName;
private String email;
private String password;
public int getIdUser() {
	return idUser;
}
public User() {
	
}
public void setIdUser(int idUser) {
	this.idUser = idUser;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String nazivTabele() {
	// TODO Auto-generated method stub
	return "user";
}
@Override
public String nazivKolone() {
	// TODO Auto-generated method stub
	return "(username,fullName,email,password)";
}
@Override
public String vrednostKolone() {
	// TODO Auto-generated method stub
	return " values (?,?,?,?)";
}
@Override
public PreparedStatement vrati(PreparedStatement preparedStatement) {
try {
		
		preparedStatement.setString(1, username);
		preparedStatement.setString(2, fullName);
		preparedStatement.setString(3, email);
		preparedStatement.setString(4, password);
		
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
@Override
public String getID() {
	// TODO Auto-generated method stub
	return null;
}


}
