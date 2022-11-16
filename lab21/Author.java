package ru.mirea.lab21;

public class Author {
    public String name;
    public String email;
    public char gender;

    public Author(String name, String email, char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

    public String GetName(){return name;}

    public String GetEmail(){return email;}

    public void SetEmail(String email){this.email=email;}

    public char GetGender(){return gender;}

    public String toString(){
        return "name "+name+
                " email "+email+
                " gender "+gender;
    }
}
