package com.team430.zeus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;
import com.team430.zeus.models.Topic;
import com.team430.zeus.repositories.*;

@Controller
public class TopicController {

	@Autowired
	TopicRepository topicRepository;

    @RequestMapping(value = "/topics", method = RequestMethod.GET)
    public @ResponseBody List<Topic> index(){
        //List<Topic> topics = new ArrayList<Topic>();

        return topicRepository.findAll();
    }
}
