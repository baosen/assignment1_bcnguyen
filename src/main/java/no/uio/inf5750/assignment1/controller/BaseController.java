package no.uio.inf5750.assignment1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;

 
@Controller
public class BaseController {

        @RequestMapping(value="/", method = RequestMethod.GET)
        public String welcome(ModelMap model) {

                model.addAttribute("message", "Maven Web Project + Spring 3 MVC - welcome()");

                //Spring uses InternalResourceViewResolver and return back index.jsp
                return "index"; // in less complicated mumbo jumbo: returns the name of .jsp-file.

        }

        @RequestMapping(value="/welcome/{name}", method = RequestMethod.GET)
        public String welcomeName(@PathVariable String name, ModelMap model) {

                model.addAttribute("message", "Maven Web Project + Spring 3 MVC - " + name);
                return "index";

        }

        @RequestMapping(value="/hello/{name}", method = RequestMethod.GET)
        public String helloName(@PathVariable String name, ModelMap model) {
        	model.addAttribute("message", "Hello " + name + " and hello world.");    
        	return "index";
        }
}