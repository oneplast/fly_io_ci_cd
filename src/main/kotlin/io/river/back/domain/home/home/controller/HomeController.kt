package io.river.back.domain.home.home.controller

import io.river.back.standard.extensions.logger
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.net.InetAddress

@Controller
class HomeController {

    private val log = logger()

    @GetMapping
    @ResponseBody
    fun main(): String {
        val localhost = InetAddress.getLocalHost()
        val hostname = localhost.hostName

        log.debug("개발/테스트 환경에서만 출력")

        return "main, hostname : $hostname"
    }
}