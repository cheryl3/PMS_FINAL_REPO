/**
 * @author Nevil Dsouza
 *
 *	Main controller
 *	DEPENDENCIES: , , 
 */

package org.crce.interns.controller;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.crce.interns.beans.PersonalProfileBean;
import org.crce.interns.beans.ProfessionalProfileBean;
import org.crce.interns.beans.UserDetailsBean;
import org.crce.interns.model.PersonalProfile;
import org.crce.interns.service.CheckRoleService;
import org.crce.interns.service.NfService;
import org.crce.interns.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

@Controller
public class NfController {
	
	@Autowired
	private NfService nfService;
	
	@RequestMapping(value="/checkNf", method = RequestMethod.GET)
	public ModelAndView checkNf() {
		
		System.out.println("Inside NfController");
		nfService.checkNf();
		
		ModelAndView model=null;
		
		model = new ModelAndView("index");
		
		return model;
	}
	
	
}