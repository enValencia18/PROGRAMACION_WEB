package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Distrito;
import pe.edu.upc.serviceinterface.IDistrito;

@Named
@RequestScoped
public class DistritoController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject
	
	private IDistrito dService;
	
	private Distrito d;
	List<Distrito> listaDistrito;
	
	@PostConstruct
	public void init() {
		this.listaDistrito = new ArrayList<Distrito>();
		this.d= new Distrito();
		this.listar();
	}
//metodos	
	public String newDistrito() {
		this.setD(new Distrito());
		return "distrito.xhtml";
	}

	public void insert() {
		try {
			dService.insert(d);
			cleanDistrito();
			this.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listar() {
		try {
			listaDistrito = dService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void cleanDistrito() {
		this.init();
	}
	
	
	public Distrito getD() {
		return d;
	}
	public void setD(Distrito d) {
		this.d = d;
	}
	public List<Distrito> getListaDistrito() {
		return listaDistrito;
	}
	public void setListaDistrito(List<Distrito> listaDistrito) {
		this.listaDistrito = listaDistrito;
	}
}
