package com.mini.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * MariaDB [trainingDB]> desc tbl_event;
+------------+-------------+------+-----+---------+-------+
| Field      | Type        | Null | Key | Default | Extra |
+------------+-------------+------+-----+---------+-------+
| event_id   | int(11)     | NO   | PRI | NULL    |       |
| event_name | varchar(25) | NO   |     | NULL    |       |
| start_date | datetime    | NO   |     | NULL    |       |
| end_date   | datetime    | NO   |     | NULL    |       |
+------------+-------------+------+-----+---------+-------+
 * 
 */

@Entity
@Table(name = "tbl_event")
public class Event implements Serializable {
	static final long serialVersionUID = 123451l;
	
	@Id
	int  event_id;
	String event_name;
	Date start_date;
	Date end_date;
	
	
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

}
