package net.vidizzo.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.{GetMapping, PathVariable, RestController}

@RestController
class HelloWorldController {

  @GetMapping(Array("/hello/{name}"))
  def hello(@PathVariable name: String): ResponseEntity[String] = {
    ResponseEntity
      .ok()
      .body(s"Helloooo $name")
  }

}
