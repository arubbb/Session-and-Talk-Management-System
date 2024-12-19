package Practical_11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


//The Talk class implements comparable<Talk> to be able to sort talks based upon their startTime.
public class Talk implements Comparable<Talk> {

    //Private variables to store the Talk details.
    private String talkId;
    private String speaker;
    private String title;
    private LocalDateTime startTime;


    //Constructor to initialize the Talk details, ID , speaker, title, startTime.
    public Talk(String talkId, String speaker, String title, String startTime) {
        this.talkId = talkId;
        this.speaker = speaker;
        this.title = title;
        this.startTime = LocalDateTime.parse(startTime, DateTimeFormatter.ISO_DATE_TIME);   //Parses the startTime into LocalDateTime using ISO_DATE_TIME format.
    }

    //Getter and setter Methods for each variable.
    public String getTalkId() {
        return talkId;
    }

    public void setTalkId(String talkId) {
        this.talkId = talkId;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }



    //Override compareTo method to compare talks based on their startTime.
    @Override
    public int compareTo(Talk otherTalk) {
        return this.startTime.compareTo(otherTalk.startTime);
    }


    //Override toString Method to provide string representation.
    @Override
    public String toString() {
        return "Talk{" +
                "talkId='" + talkId + '\'' +
                ", speaker='" + speaker + '\'' +
                ", title='" + title + '\'' +
                ", startTime=" + startTime +
                '}';
    }
}
