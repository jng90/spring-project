package pl.sda.pol92.mvc;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class DemoController {

    @RequestMapping(value = "/message", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public void message(HttpServletRequest request, HttpServletResponse response) throws IOException {
        final String name = request.getParameter("name");
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        if (name != null) {
            response.getWriter().println("<Html><body><h3>Hello " + name + "</h3></body></html>");
        } else {
            response.getWriter().println("<Html><body><h3>Brak imienia</h3></body></html>");
        }

    }
}
