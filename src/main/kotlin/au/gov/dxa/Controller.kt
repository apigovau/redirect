package au.gov.dxa

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import java.net.URLDecoder
import javax.servlet.http.HttpServletRequest


@Controller
class Controller {

    @RequestMapping("/**")
    fun index(model:MutableMap<String, Any?>, request:HttpServletRequest ): String{

        val baseRedirect = System.getenv("BaseRedirectURI")?: throw RuntimeException("No environment variable: BaseRedirectURI")
        model["BaseRedirectURI"] = baseRedirect 
        model["RedirectPath"] = request.getRequestURI()
        return "about"

    }

}
