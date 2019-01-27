import java.util.Date;

public interface AllocationRequest {

     public AllocationRequestStatus projectAllocationRequest(Date startDate,String projectDetails, int noOfPeopleRequired);
}