package org.onlineexam.service;

import org.onlineexam.model.ExamScheduleModel;
import org.onlineexam.repository.ExamScheduleRepository;

public class ExamScheduleService {
	ExamScheduleRepository eRepo= new ExamScheduleRepository();
	ExamScheduleModel emodel;
	public boolean scheduleExam(ExamScheduleModel emodel)
	{
		this.emodel=emodel;
		return eRepo.scheduleExam(emodel);
	}
	public ExamScheduleModel getSchedulModel()
	{
		if(eRepo.getSchedulModel()!=null)
		{
			return emodel;
		}
		else
		{
			return emodel;
		}
		//return emodel;
	}
}
