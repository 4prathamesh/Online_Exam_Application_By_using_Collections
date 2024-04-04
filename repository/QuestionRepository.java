package org.onlineexam.repository;
import java.util.*;

import org.onlineexam.model.Question;
public class QuestionRepository {	//stap 4
	static ArrayList al= new ArrayList();  //stap 4  tempory repository
	
	public int getId()
	{
		return al.size();
	}
	public boolean isAddQuestion(Question q)
	{
		boolean b=al.add(q);
		return b;
	}
	public ArrayList getAllQuestion()
	{
		return al;
	}
}
