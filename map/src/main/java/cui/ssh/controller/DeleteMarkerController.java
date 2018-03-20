package cui.ssh.controller;

import cui.ssh.Service.impl.MarkerServiceImpl;
import cui.ssh.entity.Marker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DeleteMarkerController {

    @Autowired
    private MarkerServiceImpl markerService;

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public ModelAndView deleteMarker(String deltype,String delposition){
        markerService.delete(delposition);
        System.out.println(delposition);
        Marker marker = new Marker();
        marker.setDes("this is"+deltype);
        marker.setType(deltype);
        ModelAndView modelAndView = new ModelAndView("redirect:/marker?type="+marker.getType()+"&who="+marker.getDes());
        return modelAndView;
    }
}
