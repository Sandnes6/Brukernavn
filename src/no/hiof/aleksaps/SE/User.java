package no.hiof.aleksaps.SE;

import javax.management.relation.Role;
import java.util.Set;

public class User {
    private Long id;
    private String brukernavn;
    private String passord;
    private String passordBekreftelse;
    private String klubb;
    private Set<Role> roller;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrukernavn() {
        return brukernavn;
    }

    public void setBrukernavn(String brukernavn) {
        this.brukernavn = brukernavn;
    }

    public String getPassord() {
        return passord;
    }

    public void setPassord(String passord) {
        this.passord = passord;
    }

    public String getPassordBekreftelse() {
        return passordBekreftelse;
    }

    public void setPassordBekreftelse(String passordBekreftelse) {
        this.passordBekreftelse = passordBekreftelse;
    }

    public Set<Role> getRoller() {
        return roller;
    }

    public void setRoller(Set<Role> roller) {
        this.roller = roller;
    }

    public String getKlubb() {
        return klubb;
    }

    public void setKlubb(String klubb) {
        this.klubb = klubb;
    }
}
