package com.mini.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

/*
 * MariaDB [trainingDB]> desc tbl_news;
+--------------+--------------+------+-----+---------+-------+
| Field        | Type         | Null | Key | Default | Extra |
+--------------+--------------+------+-----+---------+-------+
| news_id      | int(11)      | NO   | PRI | NULL    |       |
| news_title   | varchar(50)  | NO   |     | NULL    |       |
| news_content | varchar(100) | NO   |     | NULL    |       |
| isOnhomepage | int(1)       | NO   |     | NULL    |       |
| start_date   | datetime     | NO   |     | NULL    |       |
| end_date     | datetime     | NO   |     | NULL    |       |
+--------------+--------------+------+-----+---------+-------+
 */

@Entity
@Table(name = "tbl_news")
public class News implements Serializable {
	static final long serialVersionUID = 123458l;
	
	@Id
	int news_id;
	String news_title;
	String news_content;
	int isOnhomepage;
	Date start_date;
	Date end_date;
	
	
	public int getNews_id() {
		return news_id;
	}
	public void setNews_id(int news_id) {
		this.news_id = news_id;
	}
	public String getNews_title() {
		return news_title;
	}
	public void setNews_title(String news_title) {
		this.news_title = news_title;
	}
	public String getNews_content() {
		return news_content;
	}
	public void setNews_content(String news_content) {
		this.news_content = news_content;
	}
	public int getIsOnhomepage() {
		return isOnhomepage;
	}
	public void setIsOnhomepage(int isOnhomepage) {
		this.isOnhomepage = isOnhomepage;
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
