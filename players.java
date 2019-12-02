package Number3;

import java.time.LocalDate;

class players extends members {

     boolean player;

     public void setPlayer(boolean player) {
         this.player = player;
     }
     public boolean getPlayer() {
         return player;
     }
     String firstName;
     String lastName;
     String gender;
     String nationality;
     LocalDate Dob;
     int age;

     public players(String firstName, String lastName, String gender, String nationality, String dob, int age) {
         super(firstName,lastName, gender, nationality, dob, age);
     }
}
