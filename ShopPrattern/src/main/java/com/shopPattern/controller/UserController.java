package com.shopPattern.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shopPattern.entity.User;
import com.shopPattern.service.MailSenderService;
import com.shopPattern.service.UserService;



@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private MailSenderService mailSenderService;
	
	@RequestMapping(value="/registration",method=RequestMethod.POST)
	public void registration(@RequestBody User user){
		
		String uuid = UUID.randomUUID().toString();
        user.setUuid(uuid);
        userService.save(user);
        String theme = "ShopPattern";
		String mailBody = "<html lang='uk'><head><meta http-equiv='Content-Type' content='text/html; charset=utf-8' /></head><body style='background:black;'><center><div style='background:yellow;width:400px;height:70px'><p>Welcome to site administration ShopPattern</p><p>if you want to continue to register at the site ShopPattern Click on the <a href='http://localhost:8080/ShopPattern/confirm/"
				+ uuid + "'>link</a></p><div></center></html></body>";

		mailSenderService.sendMail(theme, mailBody, user.getEmail());
	}
	   @RequestMapping(value = "/confirm/{uuid}", method = RequestMethod.GET)
	    public String confirm(@PathVariable String uuid) {

	        User user = userService.findByUUID(uuid);
	        user.setEnabled(true);
	        userService.update(user);

	        return "redirect:/";
	    }
}
