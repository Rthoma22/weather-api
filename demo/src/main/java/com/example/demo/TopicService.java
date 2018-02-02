package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework", "SpringFrameWork Description"),
            new Topic("java", "Core Java", " Core Java Description")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        for (int x = 0; x < topics.size(); x++) {
            Topic t = topics.get(x);
            if (t.getId().equals(id)) {
                return t;
            }
            }
            return null;
        }

        public void addTopic(Topic t){
            topics.add(t);
        }

        public void updateTopic (String id, Topic topic){
            for (int x = 0; x < topics.size(); x++) {
                Topic t = topics.get(x);
                if (t.getId().equals(id)) {
                    topics.set(x, topic);
                    return;
                }
            }
        }

        public void deleteTopic (String id){
            for (int x = 0; x < topics.size(); x++) {
                Topic t = topics.get(x);
                if (t.getId().equals(id)) {
                   topics.remove(x);
                    return;
                }

            }

        }

}
