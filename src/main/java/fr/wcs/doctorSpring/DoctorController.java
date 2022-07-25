package fr.wcs.doctorSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {
    @GetMapping("/")
    public String getIndex() {
      return "index.html";
    }

    @GetMapping("/doctor/1")
    @ResponseBody
     public String infoDoctor1() {
         return "William Hartnell";
     }
 
     @GetMapping("/doctor/10")
     @ResponseBody
      public String infoDoctor2() {
          return "David Tennant";
      }
      @GetMapping("/doctor/13")
      @ResponseBody
       public String infoDoctor3() {
           return "Jodie Whittaker";
       }

}
