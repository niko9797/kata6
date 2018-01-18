
package kata6.model;

public class Person {
    
    private final int id;
    private final String name, birthdate, mail;
    private final Character gender;
    private final Float weight;

    public Person(int id, String name, Character gender, String birthdate, Float weight, String mail) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthdate = birthdate;
        this.weight = weight;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getMail() {
        return mail;
    }

    public Character getGender() {
        return gender;
    }

    public Float getWeight() {
        return weight;
    }

}