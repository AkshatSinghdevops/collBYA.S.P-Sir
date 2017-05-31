package com.niit.collaboration.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Autowired
	private HttpSession session;
	
	
	
	@RequestMapping(value= {("/"),("/Home")})
	public ModelAndView showHomePage()
	{
		ModelAndView mv = new ModelAndView("/Home");
		mv.addObject("msg","Welcome To Collaboration Home Page");
		return mv;
		
	}
	
	@RequestMapping("/singIn")
	public ModelAndView showSinginPage()
	{
		 ModelAndView mv = new ModelAndView("/Home");
		 mv.addObject("isUserClickedsingInPage", "true");
		 return mv;
	}
	
	@RequestMapping("/singUp")
	public ModelAndView showSingUpPage()
	{
		 ModelAndView mv = new ModelAndView("/Home");
		 mv.addObject("isUserClickedsingUpPage", "true");
		 return mv;
	}
	
	@RequestMapping("/Blog")
	public ModelAndView showBlogPage()
	{
		 ModelAndView mv = new ModelAndView("/Home");
		 mv.addObject("isUserClickedBlogPage", "true");
		 return mv;
	}
	
	@RequestMapping("/Forum")
	public ModelAndView showForumPage()
	{
		 ModelAndView mv = new ModelAndView("/Home");
		 mv.addObject("isUserClickedForumPage", "true");
		 return mv;
	}
	
	@RequestMapping("/Chat")
	public ModelAndView showChatPage()
	{
		 ModelAndView mv = new ModelAndView("/Home");
		 mv.addObject("isUserClickedChatPage", "true");
		 return mv;
	}
	
	@RequestMapping("/AboutUs")
	public ModelAndView showAboutusPage()
	{
		 ModelAndView mv = new ModelAndView("/Home");
		 mv.addObject("isUserClickedAboutUsPage", "true");
		 return mv;
	}
	
	@RequestMapping("/Profile")
	public ModelAndView showProfilePage()
	{
		 ModelAndView mv = new ModelAndView("/Home");
		 mv.addObject("isUserClickedProfilePage", "true");
		 return mv;
	}
	
	@RequestMapping("/validate")
	public ModelAndView validateCredentials(@RequestParam("userID") String id,@RequestParam("password") String pwd)
	{
		ModelAndView mv = new ModelAndView("/Home");
		
		
		if(id.equals("niit") && pwd.equals("niit"))
		{
			mv.addObject("successMessage","Valid Credentials");
			
			session.setAttribute("loginMessage","Welcome :" + id);
					
					
		}
		else
		{
			mv.addObject("errorMessage","Invalid Credentials...please try again");
		}
		return mv;
		
		
		
}
	
	
	
	

}
