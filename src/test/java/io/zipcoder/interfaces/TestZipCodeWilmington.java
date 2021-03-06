package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void hostLectureTest(){
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getINSTANCE();
        zipCodeWilmington.hostLecture(1, 12);
        Double expected = 4.0;
        Student student = zipCodeWilmington.students.findById(1);
        Double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);
    }
}
