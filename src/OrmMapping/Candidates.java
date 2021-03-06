package OrmMapping;
// Generated Mar 17, 2017 5:20:45 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Candidates generated by hbm2java
 */
public class Candidates  implements java.io.Serializable {


     private Integer id;
     private String name;
     private int age;
     private String ville;
     private String email;
     private String linkedinUrl;
     private Set candidatesEntretiens = new HashSet(0);
     private Set candidatesJobses = new HashSet(0);

    public Candidates() {
    }

	
    public Candidates(String name, int age, String ville, String email) {
        this.name = name;
        this.age = age;
        this.ville = ville;
        this.email = email;
    }
    public Candidates(String name, int age, String ville, String email, String linkedinUrl, Set candidatesEntretiens, Set candidatesJobses) {
       this.name = name;
       this.age = age;
       this.ville = ville;
       this.email = email;
       this.linkedinUrl = linkedinUrl;
       this.candidatesEntretiens = candidatesEntretiens;
       this.candidatesJobses = candidatesJobses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    public String getVille() {
        return this.ville;
    }
    
    public void setVille(String ville) {
        this.ville = ville;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getLinkedinUrl() {
        return this.linkedinUrl;
    }
    
    public void setLinkedinUrl(String linkedinUrl) {
        this.linkedinUrl = linkedinUrl;
    }
    public Set getCandidatesEntretiens() {
        return this.candidatesEntretiens;
    }
    
    public void setCandidatesEntretiens(Set candidatesEntretiens) {
        this.candidatesEntretiens = candidatesEntretiens;
    }
    public Set getCandidatesJobses() {
        return this.candidatesJobses;
    }
    
    public void setCandidatesJobses(Set candidatesJobses) {
        this.candidatesJobses = candidatesJobses;
    }




}


