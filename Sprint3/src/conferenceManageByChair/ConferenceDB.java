package conferenceManageByChair;

import entity.Conference;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class ConferenceDB {
    private ArrayList<Conference> conferenceArrayList;
    private final String database = "ConferenceDB.txt";
    URL path = ConferenceDB.class.getResource(database);



    public ConferenceDB() throws IOException {
        conferenceArrayList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path.getFile()))) {
            String line = reader.readLine();
            while (line != null){
                String[] confString = line.trim().split("#");
                String name = confString[0];
                String title = confString[1];
                String topic = confString[2];
                String chairs = confString[3];
                String date = confString[4];
                String dueDate = confString[5];
                Conference conference = new Conference(name, title, topic, chairs, date, dueDate);
                //conference.setConferenceId();
                conferenceArrayList.add(conference);
                line = reader.readLine();
            }
        }

//        conferenceArrayList.add(fr.read());
    }

    public ArrayList<Conference> getConferenceList() {
        return conferenceArrayList;
    }

    private void editConference(Conference conference) {

    }

    private void addConference(Conference conference) throws IOException {
        FileWriter fw = new FileWriter(database);
        fw.write(conference.toWriter());
    }
}
