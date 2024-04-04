package org.onlineexam.model;
import java.util.*;
public class ExamScheduleModel {		// stap --9
	private int eid;
	private String name;
	private String date;
	private String startT;
	private String endT;
	private ArrayList al;
	public ExamScheduleModel()
	{
		
	}
	public ExamScheduleModel(int eid,String name,String date,String startT,String endT)
	{
		this.eid=eid;
		this.name=name;
		this.date=date;
		this.startT=startT;
		this.endT=endT;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStartT() {
		return startT;
	}
	public void setStartT(String startT) {
		this.startT = startT;
	}
	public String getEndT() {
		return endT;
	}
	public void setEndT(String endT) {
		this.endT = endT;
	}
	public ArrayList getAl() {
		return al;
	}
	public void setAl(ArrayList al) {
		this.al = al;
	}

}
