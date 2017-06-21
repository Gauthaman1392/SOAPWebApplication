package trng.soap.service.loan;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "LoanEligibilityService", targetNamespace = "http://www.example.org/LoanEligibilityService/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class LoanEligibilityServiceImpl implements LoanEligibilityService {

	
    @WebMethod(operationName = "NewOperation", action = "http://www.example.org/LoanEligibilityService/NewOperation")
    @WebResult(name = "getLoanEligibilityResponse", targetNamespace = "http://www.example.org/LoanEligibilityService/", partName = "parameters")
	public LoanResponse newOperation(LoanRequest parameters) {

    	LoanResponse response = new LoanResponse();
    	LoanRequest request = new LoanRequest();
    	
    	int age = 30;
		if(age < 20){
			response.setEligibilityCode("100");
			response.setEligibilityMessage("Not Eligible");
			return response;
		}else if ((age > 20 && age < 25) && request.getAnnualSalary() > 60000 && request.getAmount() < 20000){
			response.setEligibilityCode("200");
			response.setEligibilityMessage("Eligible");
			return response;
		}else if ((age > 25 && age < 30) && request.getAnnualSalary() > 80000 && request.getAmount() < 20000){
			response.setEligibilityCode("200");
			response.setEligibilityMessage("Eligible");
			return response;
		}else if ((age > 30 && age < 50) && request.getAnnualSalary() > 100000 && request.getAmount() < 50000){
			response.setEligibilityCode("200");
			response.setEligibilityMessage("Eligible");
			return response;
		}else{
			response.setEligibilityCode("100");
			response.setEligibilityMessage("Not Eligible");
			return response;
		}
	}

}
