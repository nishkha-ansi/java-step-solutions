class ApplicantDetails {

    static int totalApplicants = 0;

    ApplicantDetails() {
        totalApplicants++;
    }
}

public class Applicant {

    public static void main(String[] args) {

        ApplicantDetails applicant1 = new ApplicantDetails();
        ApplicantDetails applicant2 = new ApplicantDetails();
        ApplicantDetails applicant3 = new ApplicantDetails();

        System.out.println(
                "Total applicants: " +
                ApplicantDetails.totalApplicants
        );
    }
}
