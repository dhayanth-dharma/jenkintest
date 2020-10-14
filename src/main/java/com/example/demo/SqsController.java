package com.example.demo;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/api/")

@CrossOrigin
public class SqsController {
	// Name of the queue. Developers are free to choose their queue name.
    private static final String QUEUE = "test";
 
    public static final Logger LOGGER = LoggerFactory.getLogger(SqsController.class);

    
//    @GetMapping("/send/{message}")
    @CrossOrigin
	@RequestMapping(method=RequestMethod.GET, value="test" )
    public ResponseEntity<String> sendMessageQueue() {
    	  LOGGER.info("================>>>>>>You reached the place.");
           
    	return new ResponseEntity("Hello from docker jenkins ec2", HttpStatus.OK); 
   
    }
    
  
	  
	  
}
