package twitter.controller

import org.springframework.web.bind.annotation.*

@RestController
class TwitterApiController {

    @GetMapping("/hello")
    fun hello(@RequestParam(value = "name", defaultValue = "World") name: String) =
            "Hello, $name"
}