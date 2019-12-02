package Number3;

public class members {
    String firstName;
    String lastName;
    String gender;
    String nationality;
    String dob;
    int age;


    public members(String firstName, String lastName, String gender, String nationality, String dob, int age) {
        super();
        this. firstName =firstName;
        this.lastName = lastName;
        this.gender =gender;
        this.nationality = nationality;
        this.dob =dob;
        this.age = age;

    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int indexOf (members p) {
        // TODO Auto-generated method stub
        return 0;
    }

}
