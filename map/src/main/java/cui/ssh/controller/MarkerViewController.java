package cui.ssh.controller;

import com.xiaoleilu.hutool.json.JSONArray;
import com.xiaoleilu.hutool.json.JSONObject;
import cui.ssh.Service.MarkerService;
import cui.ssh.Service.impl.MarkerServiceImpl;
import cui.ssh.entity.Marker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MarkerViewController {

    @Autowired
    private MarkerService markerService;
    @RequestMapping(value = "/marker",method = RequestMethod.GET)
    public ModelAndView findAll( HttpServletRequest request){
        String id = request.getParameter("type");
        ModelAndView modelAndView = new ModelAndView();
        List<Marker> markerList = markerService.findAll(id);
        //list转为json
        JSONArray jsonArray = new JSONArray();
        for (Marker markersJson:markerList){
            JSONObject jo = new JSONObject();
            jo.put("type",markersJson.getType());
            jo.put("des",markersJson.getDes());
            jo.put("position",markersJson.getPosition());
            jsonArray.put(jo);
        }
        System.out.println(jsonArray.toString());
        modelAndView.setViewName("map");
        modelAndView.addObject("jsonData",jsonArray);
        return modelAndView;
    }
}
