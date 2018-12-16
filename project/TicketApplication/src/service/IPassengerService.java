package service;

import java.io.IOException;
import java.sql.SQLException;

import Exception.TrainException;
import TicketBean.BookTicket;
import TicketBean.Passenger;

public interface IPassengerService {
	public BookTicket Book_ticket(Passenger pr) throws ClassNotFoundException, SQLException, IOException;
	public String cancel_ticket(Passenger pr);
	public String add_Train(Passenger pr);
	//public Train viewTrainDetails() throws TrainException;
	
	public void validatePassenger(Passenger pr) throws TrainException;
}

