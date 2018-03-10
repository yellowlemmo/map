package cui.ssh.controller;

import cui.ssh.Service.MarkerService;
import cui.ssh.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @Autowired
    private PersonService personService;
    @Autowired
    private MarkerService markerService;

    @RequestMapping(value="savePerson",method = RequestMethod.GET)
    @ResponseBody
    public String savePerson(){
        personService.savePerson();
        return "success";
    }

    @RequestMapping(value="/main",method = RequestMethod.POST )
    public ModelAndView test(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
//    @RequestMapping(value = "/marker1",method = RequestMethod.GET)
//    public ModelAndView findAll( HttpServletRequest request){
//        String id = request.getParameter("type");
//        ModelAndView modelAndView = new ModelAndView();
//        List<Marker> markerList = markerService.findAll(id);
//        //list转为json
//        JSONArray jsonArray = new JSONArray();
//        for (Marker markersJson:markerList){
//            JSONObject jo = new JSONObject();
//            jo.put("type",markersJson.getType());
//            jo.put("des",markersJson.getDes());
//            jo.put("position",markersJson.getPosition());
//            jsonArray.put(jo);
//        }
//        System.out.println(jsonArray.toString());
//        modelAndView.setViewName("map");
//        modelAndView.addObject("jsonData",jsonArray);
//        return modelAndView;
//    }
//    @RequestMapping(value = "/marker",method = RequestMethod.GET)
//    public String addMarker(){
//        markerService.addMarker("gas","123");
//        return "map";
//    }
}
