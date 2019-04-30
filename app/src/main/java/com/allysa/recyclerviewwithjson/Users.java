package com.allysa.recyclerviewwithjson;

public class Users {
    private String Id;
    private String name;
    private String email;

    public Users(String id, String name, String email) {
        this.Id = id;
        this.name= name;
        this.email = email;

    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
