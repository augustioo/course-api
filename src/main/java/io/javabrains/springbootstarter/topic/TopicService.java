package io.javabrains.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
                new Topic("spring", "Spring Framework1", "Spring Framework Description"),
                new Topic("spring1", "Spring Framework2", "Spring Framework Description1"),
                new Topic("spring2", "Spring Framework3", "Spring Framework Description2")
        ));
    public List<Topic> getAllTopics(){
        return topics;
    }
    public Topic getTopic(String id){
        //way to iterate list and find specific item
        return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }
    public void addTopic(Topic topic){
        topics.add(topic);
        return;
    }

    public void deleteTopic(String id) {
        topics.removeIf(t->t.getId().equals(id));
        return;
    }
}
