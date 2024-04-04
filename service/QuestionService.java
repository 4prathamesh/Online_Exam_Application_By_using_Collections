package org.onlineexam.service;
import java.util.ArrayList;

import org.onlineexam.model.Question;
import org.onlineexam.repository.QuestionRepository;

public class QuestionService {
	
	QuestionRepository qRepo = new QuestionRepository();  // object of repository  stap 5
	public boolean isAddQuestion(Question q)
	{
		int pid=qRepo.getId();
		pid+=1;
		q.setId(pid);
		boolean b=qRepo.isAddQuestion(q);
		return b;
	}
	public ArrayList getAllQuestion()
	{
		ArrayList al=qRepo.getAllQuestion();
		
		return al.size()>0 ? al:null;
	}

}
