import java.util.Date;

class AllocationTeam {

    public AllocationRequestStatus projectAllocationRequestToAllocationTeam(Date date, String projectDetails, int noOfPeopleRequired) {
        int javaNoOfPeople = 4;
        if(noOfPeopleRequired <= javaNoOfPeople)
            return AllocationRequestStatus.Completely;
        else if(noOfPeopleRequired >= javaNoOfPeople)
            return AllocationRequestStatus.Partially;

        return AllocationRequestStatus.Denied;
    }
}