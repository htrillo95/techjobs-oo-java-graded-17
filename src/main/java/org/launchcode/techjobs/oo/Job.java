package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    //TASK #3 FIELDS GIVEN - STARTER CODE
    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    //TASK #3 - CONSTRUCTORS

    //Constructor #1 - initialize unique ID
    public Job() {
        id = nextId;
        nextId++;
    }

    //Constructor #2 - initialize fields & call first constructor
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this(); // Calls the first constructor to initialize the 'id' field
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    //TASK #3 - SETTERS & GETTERS
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    //TASK #5 - ADD CUSTOM TOSTRING METHOD
    @Override
    public String toString() {
        return "\n" +
                "ID: " + getId() + "\n" +
                "Name: " + (getName() != null && !getName().isEmpty() ? getName() : "Data not available") + "\n" +
                "Employer: " + (getEmployer() != null && getEmployer().getValue() != null && !getEmployer().getValue().isEmpty() ? getEmployer().getValue() : "Data not available") + "\n" +
                "Location: " + (getLocation() != null && getLocation().getValue() != null && !getLocation().getValue().isEmpty() ? getLocation().getValue() : "Data not available") + "\n" +
                "Position Type: " + (getPositionType() != null && getPositionType().getValue() != null && !getPositionType().getValue().isEmpty() ? getPositionType().getValue() : "Data not available") + "\n" +
                "Core Competency: " + (getCoreCompetency() != null && getCoreCompetency().getValue() != null && !getCoreCompetency().getValue().isEmpty() ? getCoreCompetency().getValue() : "Data not available") + "\n";
    }



    //TASK #3 - GENERATE EQUALS METHOD & HASHCODE
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
