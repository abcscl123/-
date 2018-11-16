package com.ldz.action.testaction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ldz.action.base.BaseAction;
import com.ldz.model.test.Answer;
import com.ldz.model.test.Number;
import com.ldz.model.test.Problem;
import com.ldz.model.test.Results;
import com.ldz.service.testservice.NumberService;
import com.ldz.service.testservice.ProblemService;
import com.ldz.service.testservice.ResultService;
import com.ldz.service.testservice.TestAnswerService;

@Controller
public class TestAction {
	public static final String TESTUI = "testUI";
	
	@Autowired
	TestAnswerService answerService;
	@Autowired
	NumberService numberService;
	@Autowired
	ProblemService problemService;
	@Autowired
	ResultService resultService;

	public TestAnswerService getAnswerService() {
		return answerService;
	}

	public void setAnswerService(TestAnswerService answerService) {
		this.answerService = answerService;
	}

	public NumberService getNumberService() {
		return numberService;
	}

	public void setNumberService(NumberService numberService) {
		this.numberService = numberService;
	}

	public ProblemService getProblemService() {
		return problemService;
	}

	public void setProblemService(ProblemService problemService) {
		this.problemService = problemService;
	}

	public ResultService getResultService() {
		return resultService;
	}

	public void setResultService(ResultService resultService) {
		this.resultService = resultService;
	}

	public String testUI() throws Exception{
		System.out.println("testUI");
		
		List<Number> numberList = numberService.getBeanByShow();
		HttpServletRequest request = ServletActionContext.getRequest();
		if(numberList.size() != 0){
			Number number = numberList.get(0);
			List<Problem> problemList = new ArrayList<Problem>(number.getProblemSet());
			List<Problem> newProblemList = new ArrayList<Problem>();
			List<Results> resultList = new ArrayList<Results>(number.getResultSet());
			List<Results> newResultList = new ArrayList<Results>();

			for(int i=0;i<problemList.size();i++){
				Problem problem = (Problem) problemService.getBean(problemList.get(i).getId());
				newProblemList.add(problem);
			}
			
			for(int i=0;i<resultList.size();i++){
				Results result = (Results) resultService.getBean(resultList.get(i).getId());
				newResultList.add(result);
			}

			Set<Problem> problemSet = new HashSet<Problem>(newProblemList);
			number.setProblemSet(problemSet);
			request.setAttribute("number", number);
			request.setAttribute("problemList", newProblemList);
			request.setAttribute("resultList", newResultList);
		}
		
		return TESTUI;
	}
}
