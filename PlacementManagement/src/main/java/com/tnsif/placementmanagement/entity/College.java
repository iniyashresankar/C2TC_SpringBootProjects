package com.tnsif.placementmanagement.entity;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "colleges")
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String collegeName;
    private String address;

    @OneToMany(mappedBy = "college")
    private List<Student> students;

    public College() {}

    public College(String collegeName, String address) {
        this.collegeName = collegeName;
        this.address = address;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCollegeName() { return collegeName; }
    public void setCollegeName(String collegeName) { this.collegeName = collegeName; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public List<Student> getStudents() { return students; }
    public void setStudents(List<Student> students) { this.students = students; }
}