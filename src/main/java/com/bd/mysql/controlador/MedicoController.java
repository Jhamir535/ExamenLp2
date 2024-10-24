package com.bd.mysql.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bd.mysql.modelo.ClassMedico;
import com.bd.mysql.servicio.IMedicoServicio;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
@RequestMapping("/Vistas")
public class MedicoController {
@Autowired
private IMedicoServicio imedicoservicio;

	@GetMapping("ListadoMedicos")
	public String ListadoMedico(Model modelo) {
		List<ClassMedico> listado=imedicoservicio.ListaMedico();
		modelo.addAttribute("listado",listado);
		return "/Vistas/ListadoMedicos";
	}
	@GetMapping("/RegistrarMedico")
    public String RegistrarMedico(Model modelo) {
		ClassMedico clmedico=new ClassMedico();
		modelo.addAttribute("regmedico",clmedico);
		return "/Vistas/FrmRegMedico";
	}
	@PostMapping("/GuardarMedico")
	public String GuardarMedico(@ModelAttribute ClassMedico clmed,
			Model modelo) {
		imedicoservicio.RegistrarMedico(clmed);
		System.out.print("dato registrado en bd");
		return "redirect:/Vistas/ListadoMedicos";	
	}
	@GetMapping("/editarmedico/{id}")
	public String Editar(@PathVariable("id")
	Integer idmedico,Model modelo) {
		ClassMedico clmedico=imedicoservicio.BuscarporId(idmedico);
		modelo.addAttribute("regmedico", clmedico);
		return "Vistas/FrmRegMedico";
	}
	@GetMapping("/eliminarmedico/{id}")
	public String Eliminar(@PathVariable("id")
	Integer idmedico,Model modelo) {
		imedicoservicio.EliminarMedico(idmedico);
		List<ClassMedico> listado=imedicoservicio.ListaMedico();
		modelo.addAttribute("listado",listado);
		return "redirect:/Vistas/ListadoMedicos";
	}
	
		
}
