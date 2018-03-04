package cui.ssh.controller;

import cui.ssh.Service.PersonService;
import cui.ssh.Service.TestService;
import cui.ssh.Service.impl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @Autowired
    private TestService testService;
    @Autowired
    private PersonService personService;

    @RequestMapping(value="savePerson",method = RequestMethod.GET)
    @ResponseBody
    public String savePerson(){
        personService.savePerson();
        return "success";
    }

    @RequestMapping(value="springtest",method=RequestMethod.GET)
    public String springTest(){
        return testService.test();
    }
    @RequestMapping(value="test",method = RequestMethod.GET )
    public String test(){
        return "test";
    }
}
