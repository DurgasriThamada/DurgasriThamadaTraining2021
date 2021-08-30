package mvc.quest10;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController10 {
	List<Employee> list= Arrays.asList(
			new Employee(1,"Jon",2346574L),
			new Employee(2,"Sowmya",857186L),
			new Employee(3,"Satya",52524524L),
			new Employee(4,"Tara",4556363L),
			new Employee(5,"Sara",5344668L),
			new Employee(6,"Akar",8786456L),
			new Employee(7,"Sam",28674687L),
			new Employee(8,"Nadh",8458864L),
			new Employee(9,"vat",97721654L),
			new Employee(10,"Par",2767875L),
			new Employee(11,"Viya",54758786L),
			new Employee(12,"Tiny",5445453L),
			new Employee(13,"san",5875757L)
			);

	@RequestMapping(value="/report", method=RequestMethod.GET)
	public ModelAndView employeeXls(HttpServletRequest req, HttpServletResponse res) {
		
		String type= req.getParameter("type");
		
		if(type!=null && type.equals("xls"))
			return new ModelAndView(new ExcelView(), "employeeList", list);
		
		return new ModelAndView("Quest10/EmployeeListReport", "employeeList", list);
	}
}
