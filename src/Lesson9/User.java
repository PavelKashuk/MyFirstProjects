package Lesson9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String sex;
    private String country;

    public User() {
    }

    public User(String name, String surname, String email, String pasword, String sex, String country) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = pasword;
        this.sex = sex;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pasword) {
        this.password = pasword;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public final void read(String string) {
        System.out.println(string);
    }

    public void write() throws IOException {
        System.out.println("Enter a username");
        String path = "src/Lesson9/user/user.txt";
        Path dirPath = Paths.get(path);
        if (!Files.exists(dirPath.getParent())) {
            Files.createDirectories(dirPath.getParent());
        }
        FileWriter fileWriter = new FileWriter(path, true);
        Scanner scanner = new Scanner(System.in);
        fileWriter.write(scanner.nextLine() + "\n");
        fileWriter.close();
    }
}