package controller;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public void addUser(){
		userService.register(user);
		return new ModelAndView("userLogin","user",user);
	}
}
