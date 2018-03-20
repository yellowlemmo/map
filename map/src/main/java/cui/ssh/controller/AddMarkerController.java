package cui.ssh.controller;

import cui.ssh.Service.AddMarkerService;
import cui.ssh.entity.Marker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AddMarkerController {
    @Autowired
    private AddMarkerService addMarkerService;
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ModelAndView addMarker(String type, String position, HttpServletRequest request){
        Marker marker = new Marker();
        marker.setType(type);
        marker.setPosition(position);
        marker.setDes("this is"+type);
        addMarkerService.save(marker);
        ModelAndView modelAndView = new ModelAndView("redirect:/marker?type="+marker.getType()+"&who="+marker.getDes());
        return modelAndView;
    }
}
