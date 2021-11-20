package pl.sda.pol92.mvc;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class DemoController {


    @RequestMapping(value = "/power", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public void power(HttpServletRequest request, HttpServletResponse response) throws IOException {
        final String power = request.getParameter("power");
        double number = Integer.parseInt(request.getParameter("number"));
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        if ( (power != null)) {
            response.getWriter().println("<Html><body><h3>null</h3></body></html>");
        } else {
            response.getWriter().println("<Html><body><h3>Power of " + number + " is " +Math.pow(number, number) + "</h3></body></html>");
        }
    }

    @RequestMapping(value = "/message", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public void message(HttpServletRequest request, HttpServletResponse response) throws IOException {
        final String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        if (name != null) {
            response.getWriter().println("<Html><body><h3>Hello " + name + "</h3></body></html>");
        } else {
            response.getWriter().println("<Html><body><h3>Brak imienia</h3></body></html>");
        }
    }

    @GetMapping(value = "/newmessage", produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String messageImp(@RequestParam(defaultValue = "Braaak imienia") String name, @RequestParam(defaultValue = "20") int age) {
        return "Your name " + name + " and age " + age;
    }

    @GetMapping("/power")
    @ResponseBody
    public String power (Double number){
        if(number == null){
            return "musisz podac parametr number!";
        }
        double result = Math.pow(number, 2);
        return "wynik: " + result;

    }

}
