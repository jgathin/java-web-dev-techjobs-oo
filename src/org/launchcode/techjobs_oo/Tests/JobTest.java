package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.CoreCompetency;

import static org.junit.Assert.assertEquals;

public class JobTest
{
//    Job job1;
//    Job job2;
//@Before



@Test
public void testSettingJobId(){
    Job job1 = new Job();
    Job job2 = new Job();
    assertFalse(job1.getId()==job2.getId());
}

    private void assertFalse(boolean b) {
    }

    private void assertTrue(boolean b) {
    }

@Test
public void testSettingJobId2(){
    Job job1 = new Job();
    Job job2 = new Job();
    assertEquals(1, job2.getId() - job1.getId(), 0.01);
}

@Test
    public void testJobConstructorSetsAllFields(){

    Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
            new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", job1.getName());
        assertEquals("ACME", job1.getEmployer().toString());
        assertEquals("Desert", job1.getLocation().toString());
        assertEquals("Quality control", job1.getPositionType().toString());
        assertEquals("Persistence", job1.getCoreCompetency().toString());


}

@Test
    public void testJobsForEquality(){

    Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
            new PositionType("Quality control"), new CoreCompetency("Persistence"));

    Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
            new PositionType("Quality control"), new CoreCompetency("Persistence"));

    assertFalse(job1.equals(job2));
}

    @Test
    public void testToStringObjectOutput(){

        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
    //job1.toString();

    assertTrue(job1.toString(job1).startsWith("\n"));
    assertTrue(job1.toString(job1).endsWith("\n"));


    }

    @Test
    public void testOutputLines(){

        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("ID: "+1+"\n", "ID: "+job1.getId()+"\n");
        assertEquals("Name: Product tester\n", "Name: "+job1.getName()+"\n");
        assertEquals("Employer: ACME\n", "Employer: "+job1.getEmployer().toString()+"\n");
        assertEquals("Location: Desert\n", "Location: "+job1.getLocation().toString()+"\n");
        assertEquals("Position Type: Quality control\n", "Position Type: "+job1.getPositionType().toString()
        +"\n");
        assertEquals("Core Competency: Persistence\n", "Core Competency: "+job1.getCoreCompetency()
        .toString()+"\n");
    }

    @Test
    public void  testIfFieldIsEmpty(){

        Job job1 = new Job("Product tester", new Employer(""), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Employer: Data not available", "Employer: "+job1.getEmployer().toString());

    }
}
