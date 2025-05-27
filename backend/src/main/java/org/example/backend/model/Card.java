package org.example.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public class Card {

    @Id
    private String id;
    private String topicID;
    private String question;
    private String answer;
    private String image;

    public Card() {
        this.id = UUID.randomUUID().toString();
    }

    public Card(String id, String topicID, String question, String answer, String image) {
        this.id = UUID.randomUUID().toString();
        this.topicID = topicID;
        this.question = question;
        this.answer = answer;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTopicID() {
        return topicID;
    }

    public void setTopicID(String topicID) {
        this.topicID = topicID;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
