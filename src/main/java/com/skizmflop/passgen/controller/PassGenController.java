package com.skizmflop.passgen.controller;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.util.NumberUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skizmflop.passgen.common.constants.GlobalConstants;
import com.skizmflop.passgen.services.RandomStringService;

@Controller
@RequestMapping("/passgen/" + GlobalConstants.URN_VERSION)
public class PassGenController implements GlobalConstants {

	@GetMapping("/random/{size}")
	public String random(@PathParam(value="size") String size) {
		return RandomStringService.instance(NumberUtils.parseNumber(size, Integer.class)).generate();
	}
	
}
