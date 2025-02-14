package dhc.efiling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



import dhc.efiling.service.LoginService;

@Controller
public class LoginController {
	    @Autowired
	    private LoginService loginService;
	    
	    @GetMapping("/login")
	    public String showLoginPage() {
	        return "login";
	    }

	    @PostMapping("/LogonSubmit")
	    public String logonSubmit(@RequestParam("username") String username,
	                              @RequestParam("password") String password,
	                              Model model) {
	        String result = loginService.authenticate(username, password);
	        if ("success".equals(result)) {
	            return "dashboard"; // Resolves to index.html (or index.jsp) in your templates
	        } else {
	            model.addAttribute("error", result);
	            return "login"; // Returns login view with error message
	        }
	    }
	
	                            

}
