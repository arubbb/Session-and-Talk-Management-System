package Practical_11;

import java.util.Arrays;

public class Session {

    //Private variables to store the Session details.
    private String sessionId;
    private String location;
    private Talk[] talkList;    //Array to store talks scheduled in Session.
    private int currentSize;    //The current number of talks scheduled in Session.


    //Constructor to initialize the Session details, ID , Location.
    public Session(String sessionId, String location) {
        this.sessionId = sessionId;
        this.location = location;
        this.talkList = new Talk[4];    //Initialize the talkList array to a fixed size of 4.
        this.currentSize = 0;   //Initialized the currentSize to 0.
    }


    //Method to schedule a talk in the Session.
    public void scheduleTalk(Talk talk) {
        if (currentSize < talkList.length) {    //Checks whether there is space within the talkList array.
            int talkIndex = findTalkIndex(talk);    //Find the index of the talk in array.
            if (talkIndex == -1) {
                talkList[currentSize++] = talk;    //To add the talk into the array and ++ increment currentSize.
                Arrays.sort(talkList, 0, currentSize);    //Sort the array.
            } else {
                System.out.println("Talk already scheduled in session");    //If already scheduled will output the following.
            }
        }


    }


    //Method to cancel a talk in the Session.
    public void cancelTalk(Talk talk) {
        int talkIndex = findTalkIndex(talk);    //Finds the index of the talk in the array.
        if (talkIndex != -1) {
            System.arraycopy(talkList, talkIndex + 1, talkList, talkIndex, currentSize - talkIndex - 1);    //Removing the talk from the array and adjusting the size.
            talkList[--currentSize] = null;     //Decrement the currentSize and set last element to null.
        } else {
            System.out.println("Talk not scheduled in session");    //If not scheduled will output the following.
        }
    }


    //A private method to find a talk index in the Session.
    private int findTalkIndex(Talk talk) { //F
        for (int i = 0; i < currentSize; i++) {
            if (talkList[i].getTalkId().equals(talk.getTalkId())) {
                return i;   //If the talk is found in the array then return the index.

            }
        }
        return -1;  //If the talk is not found in the array then return -1.
    }



    //Getter and Setter methods for the following variables.
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCurrentSize() {
        return currentSize;
    }



    //String representation of the Session object using Override toString() method.
    @Override
    public String toString() {
        //String concatenation.
        StringBuilder result = new StringBuilder("Session{" +
                "sessionId='" + sessionId + '\'' +
                ", location='" + location + '\'' +
                ", currentSize=" + currentSize +
                ",talkList:\n");

        //Appending the talks to result string.
        for (int i = 0; i < currentSize; i++) {
            result.append("\t").append(talkList[i]).append("\n");
        }
        result.append('}');
        //Conversion of the StringBuilder to string and then return.
        return result.toString();
    }

}