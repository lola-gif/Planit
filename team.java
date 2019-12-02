package Number3;

import java.util.ArrayList;

public class team {
    private ArrayList<members> tango = new ArrayList<>();

    public void createTeam(String typeOfTeam, int teamSize) {
        ArrayList<members> memb = sport.getMembers();

        boolean x = true;
        int i = 0;

        switch (typeOfTeam) {
            case "M":

                while (x) {

                    if (memb.get(i).getGender() == ("Male") &&
                            memb.get(i).getAge() > 25) {
                        players player = new
                                players(memb.get(i).getFirstName(), memb.get(i).getLastName(), memb.get(i).getGender(),
                                memb.get(i).getNationality(), memb.get(i).getDob(), memb.get(i).getAge());
                        tango.add(player);
                        i++;
                        if (teamSize == tango.size()) {
                            x = false;

                        }
                    } else {
                        i++;
                    }
                }
            case "m":
                while (x) {

                    if (memb.get(i).getGender() == ("Male") &&
                            memb.get(i).getAge() < 26) {
                        players player = new
                                players(memb.get(i).getFirstName(), memb.get(i).getLastName(), memb.get(i).getGender(),
                                memb.get(i).getNationality(), memb.get(i).getDob(), memb.get(i).getAge());
                        tango.add(player);
                        i++;

                        if (teamSize == tango.size()) {
                            x = false;

                        }
                    } else {
                        i++;
                    }

                }
            case "f":
                while (x) {
                    if (memb.get(i).getGender() == ("Female") &&
                            memb.get(i).getAge() < 26) {
                        players player = new
                                players(memb.get(i).getFirstName(), memb.get(i).getLastName(), memb.get(i).getGender(),
                                memb.get(i).getNationality(), memb.get(i).getDob(), memb.get(i).getAge());
                        tango.add(player);
                        i++;
                        if (teamSize == tango.size()) {
                            x = false;

                        }
                    } else {
                        i++;
                    }
                }
            case "X":
                while (x) {
                    if (memb.get(i).getGender().contains("ale") &&
                            memb.get(i).getAge() > 25) {
                        players player = new
                                players(memb.get(i).getFirstName(), memb.get(i).getLastName(), memb.get(i).getGender(),
                                memb.get(i).getNationality(), memb.get(i).getDob(), memb.get(i).getAge());
                        tango.add(player);
                        i++;
                        if (teamSize == tango.size()) {
                            x = false;
                        }
                    } else {
                        i++;
                    }
                }
        }

        System.out.println("As the oldest person, the coach for this team is " +cName);
    }
    
}
