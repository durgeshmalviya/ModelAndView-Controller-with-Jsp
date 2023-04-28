package dadalife;
import java.time.LocalDateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//Model And View Controller or request 
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;


@Controller
public class daController {
		@GetMapping("/hello")
		public String getData (Model model ) {
			model.addAttribute("name","Vision");
			model.addAttribute("sname","IAS ");
			model.addAttribute("age",29);			
			return "index";
			}		
		
		
		@PostMapping("/ok")
		public ModelAndView getForm
		(@RequestParam(name ="name") String name,
		@RequestParam (name ="sname")
		String sname ,@RequestParam(name ="age")
		String age ) {
			ModelAndView mv = new ModelAndView();
			mv.addObject("name",name);
			mv.addObject("sname",sname);
			mv.addObject("age",age);
			mv.addObject("Date",LocalDateTime.now());
			
			var a ="durgesh";
			var b= "JavaEE";
			var c = 27;
			var d= false;
			
			mv.addObject("a",a);
			mv.addObject("b",b);
			mv.addObject("c",c);
			mv.addObject("d",d);
			mv.setViewName("hello");
			return mv;
			}		
}
 

