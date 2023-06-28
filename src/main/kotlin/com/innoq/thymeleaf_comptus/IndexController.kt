package com.innoq.component_challenge.thymeleaf_comptus

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class IndexController {

    @GetMapping("/")
    fun index(model: Model): String {
        model.addAttribute("list", mapOf(Pair("foo", "bar"), Pair("fnd", "saarland")))
        return "pages/index"
    }
}
