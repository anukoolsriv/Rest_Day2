package com.lti.rest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.lti.rest.Passenger.Gender;
import com.lti.rest.Passenger.Status;

public class PnrDao {

	public PnrDetails fetchPnrDetails(long pnrNo) {
		// jdbc code missing right now
		PnrDetails pnrDetails = new PnrDetails();
		pnrDetails.setPnrNo(pnrNo);
		pnrDetails.setTrainNo(122111);
		pnrDetails.setTravelDate(LocalDate.of(2020, 07, 15));

		List<Passenger> passengers = new ArrayList<>();
		Passenger passenger1 = new Passenger();
		passenger1.setAge(32);
		passenger1.setName("Sheetal");
		passenger1.setGender(Gender.FEMALE);
		passenger1.setStatus(Status.WAITING);

		Passenger passenger2 = new Passenger();
		passenger2.setAge(23);
		passenger2.setName("Sakura");
		passenger2.setGender(Gender.FEMALE);
		passenger2.setStatus(Status.CONFIRMED);

		Passenger passenger3 = new Passenger();
		passenger3.setName("Anukool");
		passenger3.setAge(23);
		passenger3.setGender(Gender.MALE);
		passenger3.setStatus(Status.WAITING);

		passengers.add(passenger1);
		passengers.add(passenger2);
		passengers.add(passenger3);

		pnrDetails.setPassengers(passengers);

		return pnrDetails;
	}

}
