import java.util.Date;

public class SalesOrManagerImp implements AllocationRequest {

    @Override
    public AllocationRequestStatus projectAllocationRequest(Date date, String projectDetails, int noOfPeopleRequired) {
        AllocationTeam allocationTeam = new AllocationTeam();
        AllocationRequestStatus allocationRequestStatus = allocationTeam.projectAllocationRequestToAllocationTeam(date,projectDetails,noOfPeopleRequired);
      return  allocationRequestStatus;
    }
 }
