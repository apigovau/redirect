
package au.gov.dxa

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class APIController {

    @GetMapping("/api/**")
    fun feedback(@RequestParam params:Map<String,String>):String{
        val baseRedirect = System.getenv("BaseRedirectURI")?: throw RuntimeException("No environment variable: BaseRedirectURI")
        return "This API has moved to " + baseRedirect 
    }


}
