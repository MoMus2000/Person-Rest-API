package io.javabrains.springbootstarter.hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "SpringFrameWOrk", "JAVA"),
			new Topic("javascript","JAVASCRIPT FRAMEWORK","JAVASCRIPT"),
			new Topic("python","Django","Flask")));
	
	public List<Topic> getAllTopics(){
		return topics;
	}

	public Topic getTopic(String id) {
		for(int i=0; i<topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				return topics.get(i);
			}
		}
		return null;
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		// TODO Auto-generated method stub
		for(int i=0;i<topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
		
	}

	public boolean deleteTopic(String id) {
		// TODO Auto-generated method stub
		for(int i=0;i<topics.size();i++) {
			if(topics.get(i).getId().equals(id)) {
				topics.remove(i);
				return true;
			}
		}
		return false;
	}
}
