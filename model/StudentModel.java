package org.onlineexam.model;

public class StudentModel {
	private int id;
	private String name;
	private ExamScheduleModel model;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ExamScheduleModel getModel() {
		return model;
	}
	public void setModel(ExamScheduleModel model) {
		this.model = model;
	}
	
	
}
