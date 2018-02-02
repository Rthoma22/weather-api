package com.newproject.demo;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic>getAllTopics(){
        return topicService.getAllTopics();
    }

    //GET BY ID
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){  // String id = {id}
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    //PUT
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(id,topic);
    }

    //Delete
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }



}
