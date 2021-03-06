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

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView adminLogin(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Admin admin = adminService.login(username,password);
        if(admin!=null) {
            if(admin.getUsername().equals("admin")&admin.getPassword().equals(password)) {
                modelAndView.addObject("admin",admin.getUsername());
                modelAndView.setViewName("index");
            }else {
               modelAndView.setViewName("test");
            }
        }else {
            modelAndView.setViewName("test");
        }
        return modelAndView;

    }
}
