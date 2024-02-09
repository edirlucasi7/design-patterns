package br.com.patterns.user;

import java.util.Optional;

import static java.util.Optional.*;

public class User {

    private Long id;
    private String name;
    private String email;
    private int enrollment;

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public User(Long id, String name, int enrollment) {
        this.id = id;
        this.name = name;
        this.enrollment = enrollment;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getEnrollment() {
        return enrollment;
    }

    // simula um repository/ida ao banco
    public static Optional<User> findUserByEmail(String userKey) {
        if ("icetylucas@gmail.com".equals(userKey)) {
            return of(new User(1L, "Edir Lucas Icety", "icetylucas@gmail.com"));
        }
        return empty();
    }

    // simula um repository/ida ao banco
    public static Optional<User> findUserByCustomKey(String userKey) {
        if ("21062020".equals(userKey)) {
            return Optional.of(new User(2L, "Pedro Mirage Icety", 21062020));
        }
        return empty();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", customKey='" + enrollment + '\'' +
                '}';
    }
}
