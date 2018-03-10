package cui.ssh.controller;

import cui.ssh.Service.AdminService;
import cui.ssh.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AdminLoginController {
    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView adminLogin(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Admin admin = adminService.login(username,password);
        System.out.println(admin.getPassword());
        System.out.println(password);
        ModelAndView modelAndView =  new ModelAndView();
        if(password.equals(admin.getPassword())){
        modelAndView.setViewName("index");
        return modelAndView;
        }
        else {
            modelAndView.setViewName("admin");
            return modelAndView;
        }
    }
}
