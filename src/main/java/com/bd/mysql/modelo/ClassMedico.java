package com.bd.mysql.modelo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
@Table(name="tbl_medicocl3")
public class ClassMedico {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int  idmedicocl3;
	private String nombrecl3;
	private String apellidocl3;
	private String Email;
	private String dnicl3;
	private String estadocivilcl3;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso=ISO.DATE)
	private Date fechanacimcl3;
	
	
	public int getIdmedicocl3() {
		return idmedicocl3;
	}
	public void setIdmedicocl3(int idmedicocl3) {
		this.idmedicocl3 = idmedicocl3;
	}
	public String getNombrecl3() {
		return nombrecl3;
	}
	public void setNombrecl3(String nombrecl3) {
		this.nombrecl3 = nombrecl3;
	}
	public String getApellidocl3() {
		return apellidocl3;
	}
	public void setApellidocl3(String apellidocl3) {
		this.apellidocl3 = apellidocl3;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDnicl3() {
		return dnicl3;
	}
	public void setDnicl3(String dnicl3) {
		this.dnicl3 = dnicl3;
	}
	public String getEstadocivilcl3() {
		return estadocivilcl3;
	}
	public void setEstadocivilcl3(String estadocivilcl3) {
		this.estadocivilcl3 = estadocivilcl3;
	}
	public Date getFechanacimcl3() {
		return fechanacimcl3;
	}
	public void setFechanacimcl3(Date fechanacimcl3) {
		this.fechanacimcl3 = fechanacimcl3;
	}
	public ClassMedico(int idmedicocl3, String nombrecl3, String apellidocl3, String email, String dnicl3,
			String estadocivilcl3, Date fechanacimcl3) {
		//super();
		
		this.idmedicocl3 = idmedicocl3;
		this.nombrecl3 = nombrecl3;
		this.apellidocl3 = apellidocl3;
		Email = email;
		this.dnicl3 = dnicl3;
		this.estadocivilcl3 = estadocivilcl3;
		this.fechanacimcl3 = fechanacimcl3;
	}
	public ClassMedico() {
		//super();//
	}
	
	
	
	
}
