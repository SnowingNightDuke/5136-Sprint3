package com.fit5136.team60.sprint3;

public class Conference {

    private String name;
    private String title;
    private String topic;

    public Conference(String name, String title, String topic){
        this.topic = topic;
        this.name = name;
        this.title = title;
    }

    private void setName(String name){
        this.name = name;
    }

    private void setTitle(String title){
        this.title = title;
    }

    private void setTopic(String topic){
        this.topic = topic;
    }

    public String getName(){
        return name;
    }

    public String getTitle(){
        return title;
    }

    public String getTopic(){
        return topic;
    }

    @Override
    public String toString() {
        return name;
    }
}

