package Students;


import Payment.*;

public class Management implements DonationFee, TutionFee{
		public void donationFee() {
			System.out.println("Management Student pays both DonationFee as well as TuitionFee.");
			System.out.println("Management Student pays DonationFee of 1000000/-.");
		}
		public void tuitionFee() {
			System.out.println("Management Student pays TuitionFee of 100000/-.");
		}
}