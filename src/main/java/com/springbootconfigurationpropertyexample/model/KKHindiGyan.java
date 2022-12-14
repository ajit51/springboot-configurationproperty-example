package com.springbootconfigurationpropertyexample.model;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "myapp") //instead of @Bean
//@Component
public class KKHindiGyan {

    private Integer channelId;
    private String channelName;
    private String websitUrl;

    private Technology technology;
    private List<String> topics;
    private Map<String, Integer> Techfee;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getWebsitUrl() {
        return websitUrl;
    }

    public void setWebsitUrl(String websitUrl) {
        this.websitUrl = websitUrl;
    }

    public Technology getTechnology() {
        return technology;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public Map<String, Integer> getTechfee() {
        return Techfee;
    }

    public void setTechfee(Map<String, Integer> techfee) {
        Techfee = techfee;
    }

    @Override
    public String toString() {
        return "KKHindiGyan{" +
                "channelId=" + channelId +
                ", channelName='" + channelName + '\'' +
                ", websitUrl='" + websitUrl + '\'' +
                ", technology=" + technology +
                ", topics=" + topics +
                ", Techfee=" + Techfee +
                '}';
    }
}
