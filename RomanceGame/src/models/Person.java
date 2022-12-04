package models;

import java.util.Random;

public class Person {
    private String _firstName;
    private String _lastName;
    private boolean _isPlayer;
    private boolean _isMale;
    private int _age;
    private String _job;


    public Person(String firstName, String LastName, int age, String job) {
        _firstName = firstName;
        _lastName = LastName;
        _isPlayer = false;
        _age = age;
        _job = job;
    }

    public Person(Random random) {
        _isPlayer = true;
        _age = random.nextInt(20, 30);
    }

    public String getFirstName() {
        return _firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public String getFullName() {
        return _firstName + ' ' + _lastName;
    }

    public String getJob() {
        return _job;
    }

    public String getGender() {
        return _isMale ? "male" : "female";
    }

    public boolean getIsPlayer() {
        return _isPlayer;
    }

    public int GetAge() {
        return _age;
    }

    public void setJob(String job) {
        _job = job;
    }

    public void setFirstName(String firstName) {
        _firstName = firstName;
    }

    public void setLastName(String lastName) {
        _lastName = lastName;
    }

    public void setGender(String gender) throws Exception {
        if (gender.equals("m") || gender.equals("f")) {
            _isMale = gender.equals("m");
        } else {
            throw new Exception("Incorrect choice. Please try again.");
        }
    }    

    @Override
    public String toString() {
        if (_isPlayer) {
            return String.format("Your name is %s %s, you are a %s, and  you are %s years old.", _firstName, _lastName, this.getGender(), _age);
        } else {
            return String.format("This person's name is %s %s, they are a %s,  and they are %s years old", _firstName, _lastName, this.getGender(), _age);
        }
    }
}
