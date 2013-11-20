package tallerweb.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import tallerweb.springmvc.objetos.persona;

@Controller
@RequestMapping("/prueba")
public class ClaseDePruebaController {
	
	@RequestMapping("/prueba")
	public ModelAndView CreaHtml(@RequestParam("nombre") String nombre) {

		String message = "Buen Día, " + nombre + "!";
		return new ModelAndView("prueba", "message", message);

	}
	
	@RequestMapping("/salta")
	public ModelAndView SaltaHtml() {
		
	persona p1 = new persona();
		
		return new ModelAndView("prueba", "mensajecriollo",p1);

	}


}
