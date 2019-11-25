package com.lti.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Ticket {

	
	
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="tick_seq")
	@SequenceGenerator(sequenceName="tick_seq",name="tick_seq",allocationSize=1)
	int ticket_id;
	int no_of_passenger;
    LocalDate ticket_date ;
    
    @OneToOne
    @JoinColumn(name="bsl_id")
    BusServiceLog bslog;
    
    @OneToMany(mappedBy="ticket", fetch = FetchType.EAGER)
	List<PassengerNumber> pnlist;

	public int getTicket_id() {
		return ticket_id;
	}

	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}

	public int getNo_of_passenger() {
		return no_of_passenger;
	}

	public void setNo_of_passenger(int no_of_passenger) {
		this.no_of_passenger = no_of_passenger;
	}

	public LocalDate getTicket_date() {
		return ticket_date;
	}

	public void setTicket_date(LocalDate ticket_date) {
		this.ticket_date = ticket_date;
	}

	public BusServiceLog getBslog() {
		return bslog;
	}

	public void setBslog(BusServiceLog bslog) {
		this.bslog = bslog;
	}

	public List<PassengerNumber> getPnlist() {
		return pnlist;
	}

	public void setPnlist(List<PassengerNumber> pnlist) {
		this.pnlist = pnlist;
	}

//	@Override
//	public String toString() {
//		return "Ticket [ticket_id=" + ticket_id + ", no_of_passenger=" + no_of_passenger + ", ticket_date="
//				+ ticket_date + ", bslog=" + bslog + ", pnlist=" + pnlist + "]";
//	}

	public Ticket(int ticket_id, int no_of_passenger, LocalDate ticket_date, BusServiceLog bslog,
			List<PassengerNumber> pnlist) {
		super();
		this.ticket_id = ticket_id;
		this.no_of_passenger = no_of_passenger;
		this.ticket_date = ticket_date;
		this.bslog = bslog;
		this.pnlist = pnlist;
	}

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

}
