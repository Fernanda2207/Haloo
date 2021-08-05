package com.halloworld.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hallo")

public class HalloController {
	
	@GetMapping
	public String hello( ) {
    return " Hallo Generation!!! ";
    }


}