package org.onlineexam.repository;
import java.util.*;
import org.onlineexam.model.ExamScheduleModel;

public class ExamScheduleRepository {
	QuestionRepository qRepo = new QuestionRepository();
	ExamScheduleModel emodel;
	public boolean scheduleExam(ExamScheduleModel emodel)
	{
		this.emodel=emodel;
		boolean b=false;
		ArrayList al=qRepo.getAllQuestion();
		if(al.size()>0)
		{
			emodel.setAl(al);
			b=true;
		}
		return b;
	}
	public ExamScheduleModel getSchedulModel()
	{
		return emodel;
	}
}
