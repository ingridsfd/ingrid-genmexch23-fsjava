package com.example.blumen.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="usuarios_tienen_direcciones")
public class UsuarioTieneDireccionModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Long Id_usuario_tiene_direccion;
    
    @OneToOne
    private UsuarioModel Usuarios_Id_usuario;
    
    @OneToOne
    private DireccionModel Direcciones_Id_direccion;

	public UsuarioTieneDireccionModel() {
		
	}

	public UsuarioTieneDireccionModel(Long id_usuario_tiene_direccion, UsuarioModel usuarios_Id_usuario,
			DireccionModel direcciones_Id_direccion) {
		super();
		Id_usuario_tiene_direccion = id_usuario_tiene_direccion;
		Usuarios_Id_usuario = usuarios_Id_usuario;
		Direcciones_Id_direccion = direcciones_Id_direccion;
	}

	public Long getId_usuario_tiene_direccion() {
		return Id_usuario_tiene_direccion;
	}

	public void setId_usuario_tiene_direccion(Long id_usuario_tiene_direccion) {
		Id_usuario_tiene_direccion = id_usuario_tiene_direccion;
	}

	public UsuarioModel getUsuarios_Id_usuario() {
		return Usuarios_Id_usuario;
	}

	public void setUsuarios_Id_usuario(UsuarioModel usuarios_Id_usuario) {
		Usuarios_Id_usuario = usuarios_Id_usuario;
	}

	public DireccionModel getDirecciones_Id_direccion() {
		return Direcciones_Id_direccion;
	}

	public void setDirecciones_Id_direccion(DireccionModel direcciones_Id_direccion) {
		Direcciones_Id_direccion = direcciones_Id_direccion;
	}
	
	
}