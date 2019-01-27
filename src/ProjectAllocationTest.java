import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class ProjectAllocationTest {

    @Test
    public void projectAllocationRequest() throws ParseException {
        SalesOrManagerImp salesOrManagerImp = new SalesOrManagerImp();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateInString = sdf.format(new Date());
        Date date = sdf.parse(dateInString);
        String projectDetails = "Curefit Lis is the module which gonna to be replaced with live health. The skill Set Required Spring Boot, Java8";
        int noOfPeopleRequired = 3;
        assertEquals("Completely",String.valueOf(salesOrManagerImp.projectAllocationRequest(date, projectDetails, noOfPeopleRequired)));
     }
}