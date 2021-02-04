package org.launchcode.techjobs_oo;

import java.lang.reflect.Field;
import java.util.Objects;

public class Job {

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

    public Job(){
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

//    public void outputToString(Job job){
//
//        if(job.getName().toString().equals("")&&job.getEmployer().toString().equals("")&&
//                job.getLocation().toString().equals("")&&job.getPositionType().toString().equals("")&&
//                job.getCoreCompetency().toString().equals("")){
//            System.out.println("OOPS! This job does not seem to exist...");
//        } else {
//
//            System.out.println("ID: " + job.getId());
//
//            if (job.getName().toString().equals("")) {
//                System.out.println("Name: *Data Not Available*");
//            } else {
//                System.out.println("Name: " + job.getName().toString());
//            }
//
//            if (job.getEmployer().toString().equals("")) {
//                System.out.println("Employer: *Data Not Available*");
//            } else {
//                System.out.println("Employer: " + job.getEmployer().toString());
//            }
//
//            if (job.getLocation().toString().equals("")) {
//                System.out.println("Location: *Data Not Available*");
//            } else {
//                System.out.println("Location: " + job.getLocation().toString());
//            }
//
//            if (job.getPositionType().toString().equals("")) {
//                System.out.println("Position Type: *Data Not Available*");
//            } else {
//                System.out.println("Position Type: " + job.getPositionType().toString());
//            }
//
//            if (job.getCoreCompetency().toString().equals("")) {
//                System.out.println("Core Competency: *Data Not Available*");
//            } else {
//                System.out.println("Core Competency: " + job.getCoreCompetency().toString());
//            }
//            System.out.println("\n");
//        }
//
//
//    }

    public String toString(Job job){
        return "\n" +
                "ID: "+job.getId()+"\n"+
                "Name: "+job.getName()+"\n"+
                "Employer: "+job.getEmployer().toString()+"\n"+
                "Location: "+job.getLocation().toString()+"\n"+
                "Position Type: "+job.getPositionType().toString()+"\n"+
                "Core Competency: "+job.getCoreCompetency().toString()+"\n"+
                "\n";
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
