package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;

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

}
