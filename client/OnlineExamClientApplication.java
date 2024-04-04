package org.onlineexam.client;
import java.util.*;

import org.onlineexam.model.ExamScheduleModel;
import org.onlineexam.model.Question;
import org.onlineexam.model.StudentModel;
import org.onlineexam.service.ExamScheduleService;
import org.onlineexam.service.QuestionService;
public class OnlineExamClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentModel sModel= new StudentModel();
		ExamScheduleModel Emodel= new ExamScheduleModel();
		QuestionService qService=new QuestionService();
		ExamScheduleService eService= new ExamScheduleService();
		do
		{
			System.out.println("1. Add question");
			System.out.println("2. View all Question");
			System.out.println("3. Add new Exam schedul"); 
			System.out.println("4. View exam schedul with Question");
			System.out.println("5. Student Exam Space");
			System.out.println("6. Delete Question");
			System.out.println("Enter the choice");
			Scanner sc= new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				sc.nextLine();
				System.out.println("Enter the question and options and answer");
				String qname=sc.nextLine();
				String op1=sc.nextLine();
				String op2=sc.nextLine();
				String op3=sc.nextLine();
				String op4=sc.nextLine();
				String answer=sc.nextLine();
				Question q= new Question(qname,op1,op2,op3,op4,answer);
				boolean b=qService.isAddQuestion(q);
				if(b)
				{
					System.out.println("question is add ");
				}
				else
				{
					System.out.println("question is NOT add");
				}
				break;
			case 2:
				ArrayList al=qService.getAllQuestion();
				if(al!=null)
				{
					
					for(Object obj:al)
					{
						Question ques=(Question)obj;
						System.out.println("Question ID "+ques.getId()+"\nQuestion "+ques.getName()+
								"\na) "+ques.getOp1()+"\tb) "+ques.getOp2()+"\tc) "+ques.getOp3()+"\td) "+ques.getOp4()+
								"\nAnswer "+ques.getAnswer());
					}
				}
				else
				{
					System.out.println("Question is not present!!!");
				}
				break;
			case 3:
				System.out.println("enter the exam schedul data: ");
				System.out.println("Enetr the Exam id: ");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("enter the Exam name: ");
				String name=sc.nextLine();
				System.out.println("enter the Exam date: ");
				String date=sc.nextLine();
				System.out.println("enter the Starting time: ");
				String startT=sc.nextLine();
				System.out.println("enter the end time: ");
				String endT=sc.nextLine();
				Emodel.setEid(id);
				Emodel.setName(name);
				Emodel.setDate(date);
				Emodel.setStartT(startT);
				Emodel.setEndT(endT);
				boolean b1=eService.scheduleExam(Emodel);
				if(b1)
				{
					System.out.println("exam is schedul ...");
				}
				else
				{
					System.out.println("exam is NOT schedul ...");
				}
				break;
			case 4:
				Emodel=eService.getSchedulModel();
				System.out.println("E_ID:- "+Emodel.getEid()+"\tE_Name:- "+Emodel.getName()+"\tE_Date:- "+Emodel.getDate()
				+"\tE_sTime:- "+Emodel.getStartT()+"\tE_eTime:- "+Emodel.getEndT());
				System.out.println("Questions");
				al=Emodel.getAl();
				for(Object obj:al)
				{
					q=(Question)obj;
					System.out.println(q.getId()+")\t"+q.getName()+"\noption:-\n"+q.getOp1()+
							"\t"+q.getOp2()+"\t"+q.getOp3()+"\t"+q.getOp4()+"\nAnswer:- "+q.getAnswer());
				}
				break;
			case 5:
				System.out.println("enter the Student id and name");
				id =sc.nextInt();
				sc.nextLine();
				name=sc.nextLine();
				sModel.setId(id);
				sModel.setName(name);
				if(Emodel!=null)
				{
					sModel.setModel(Emodel);
					al=Emodel.getAl();
					int index=0;
					System.out.println("student id: "+sModel.getId());
					System.out.println("student Name: "+sModel.getName());
					do {
						q=(Question)al.get(index);
						System.out.println("Q)"+q.getName());
						System.out.println("a)"+q.getOp1());
						System.out.println("b)"+q.getOp2());
						System.out.println("c)"+q.getOp3());
						System.out.println("d)"+q.getOp4());
						System.out.println("enter the Answer");
						answer=sc.nextLine();
						if(answer.equals(q.getAnswer()))
						{
							q.setStatus(true);
						}
						else
						{
							q.setStatus(false);
						}
						index++;
					}while(index<al.size());
					System.out.println("Result is");
					int count=0;
					for(Object obj:al) {
						q=(Question)obj;
						if(q.getisStatus())
						{
							count++;
						}
					}
					System.out.println(count+" question is write");
				}
				else
				{
					System.out.println("Exam is not schedule");
				}
				
				break;
			case 6:
				System.out.println("enter the id for delete Question");
				id=sc.nextInt();
				al=qService.getAllQuestion();
				for(Object obj:al)
				{
					q=(Question)obj;
					if(q.getId()==id)
					{
						System.out.println("delete id is "+q.getId());
						al.remove(q.getId());
					}
				}
				break;
			}
			if(choice==11)
			{
				break;
			}
			
		}while(true);
	}

}
