
package com.project.code;

public class User {
    
    private String Fullname;
    private String username;//="Farzana";
    private String password;//="123";
    private String email;
    private String address;
    private String DateofBirth;
    private String phoneno;

    public void edit(String Fullname, String email, String phoneno ,String address, String DateofBirth) {
        this.Fullname = Fullname;
        this.email = email;
        this.address = address;
        this.DateofBirth = DateofBirth;
        this.phoneno = phoneno;
    }

    public User(String Fullname, String username, String password) {
        this.Fullname = Fullname;
        this.username = username;
        this.password = password;
        //System.out.println("Name = "+Fullname);
    }

    public String getFullname() {
        return Fullname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getDateofBirth() {
        return DateofBirth;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public User() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public boolean match(String usern,String pass){
        if(usern.equalsIgnoreCase(username) && pass.equals(password))
            return true;
        else 
            return false;
    }
}
