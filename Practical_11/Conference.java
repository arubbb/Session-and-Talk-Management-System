package Practical_11;
public class Conference {

    //Creates multiple talk objects with specific details such as speakers, subjects etc.
    public static void main(String[] args) {
        Talk talk1 = new Talk("t01", "speaker1", "math", "2023-08-31T10:30:00");
        System.out.println(talk1);
        Talk talk2 = new Talk("t02", "speaker2", "geog", "2023-08-31T12:30:00");
        System.out.println(talk2);
        Talk talk3 = new Talk("t03", "speaker3", "compsci", "2023-08-31T13:30:00");
        System.out.println(talk3);
        Talk talk4 = new Talk("t04", "speaker4", "english", "2023-08-31T14:30:00");
        System.out.println(talk4);
        Talk talk5 = new Talk("t05", "speaker5", "databases", "2023-08-31T15:30:00");
        System.out.println(talk5);
        Talk talk6 = new Talk("t06", "speaker6", "algorithms", "2023-08-31T17:30:00");
        System.out.println(talk6);
        Talk talk7 = new Talk("t07", "speaker7", "AI", "2023-08-31T19:30:00");
        System.out.println(talk7);
        Talk talk8 = new Talk("t08", "speaker8", "Maths", "2023-08-31T20:30:00");
        System.out.println(talk8);

    //Creates multiple session objects with details such as ID and location.
        Session session1 = new Session("s01", "OA/02");
        Session session2 = new Session("s02", "CS/02");
        Session session3 = new Session("s03", "BLG/10");
        Session session4 = new Session("s04", "HA2/15");

    //Allows the Talks to be scheduled for each session.
        session1.scheduleTalk(talk1);
        session1.scheduleTalk(talk2);

        session2.scheduleTalk(talk3);
        session2.scheduleTalk(talk4);

        session3.scheduleTalk(talk5);
        session3.scheduleTalk(talk6);

        session4.scheduleTalk(talk7);
        session4.scheduleTalk(talk8);
    //Allows the Talks to be cancelled.
        session4.cancelTalk(talk8);
        session2.cancelTalk(talk4);



    //Prints the details of each session.
        System.out.println("Session 1 Details:");
        System.out.println(session1);

        System.out.println("\nSession 2 Details:");
        System.out.println(session2);

        System.out.println("\nSession 3 Details:");
        System.out.println(session3);

        System.out.println("\nSession 4 Details:");
        System.out.println(session4);
    }
}



