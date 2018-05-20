package pe.edu.sistemas.sisgr.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	protected final Log logger = LogFactory.getLog(LoginController.class);
	
	
	@RequestMapping(value= {"/", "/index"}, method = RequestMethod.GET)
	public ModelAndView homeBasico(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	
	@RequestMapping(value= "/login", method = RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
	@RequestMapping(value="/home", method = RequestMethod.GET)
		public ModelAndView homeUsuarios(){
			ModelAndView modelAndView = new ModelAndView();
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			GrantedAuthority authRol = auth.getAuthorities().iterator().next();
			logger.info("ROL: " + authRol.getAuthority());
			
			String rolName = authRol.getAuthority();
			
			switch(rolName){
				
				case "RECEPCIONISTA":
					modelAndView.setViewName("modulos/recepcionista/recepcionista");break;
				case "MESERO":
					modelAndView.setViewName("modulos/mesero/mesero");break;
				case "CAJERO":
					modelAndView.setViewName("modelos/cajero/cajero");break;
				case "COCINERO":
					modelAndView.setViewName("modulos/cocinero/cocinero");break;
				default: 					modelAndView.setViewName("home2");
			}
			
			return modelAndView;
		}
	
	@RequestMapping(value= "/reservaMesa", method = RequestMethod.GET)
	public ModelAndView reservaMesa(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("reservaMes");
		return modelAndView;
	}
	
	@RequestMapping(value= "/pedidoDistancia", method = RequestMethod.GET)
	public ModelAndView pedidoDistancia(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("pedidoDistancia");
		return modelAndView;
	}
	
	@RequestMapping(value= "/revisarCarta", method = RequestMethod.GET)
	public ModelAndView revisarCarta(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("revisarCarta");
		return modelAndView;
	}
}
