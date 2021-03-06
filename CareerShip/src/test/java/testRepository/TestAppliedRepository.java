package testRepository;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.vjf.Repository.ImpEmployerRepository;
import com.vjf.Repository.ImpJobSeekerRepository;
import com.vjf.Repository.ImplEmployerJobPostRepository;
import com.vjf.Repository.ImplEmplyerShortlistedRepository;
import com.vjf.Repository.ImplJobSeekerApplyJobRepository;
import com.vjf.car.model.AddToShortListPojo;
import com.vjf.car.model.EmployerJobPostPojo;
import com.vjf.car.model.EmployerLoginPojo;
import com.vjf.car.model.JobSeekerBioDataPojo;
import com.vjf.car.model.JobSeekerJobApplyPojo;
import com.vjf.car.model.JobSeekerLoginPojo;

public class TestAppliedRepository {

	final String DB_URL = "jdbc:mysql://localhost/VJF_MOCK";

	ImplEmplyerShortlistedRepository repo=new ImplEmplyerShortlistedRepository();
	ImpEmployerRepository repo2 = new ImpEmployerRepository();
	ImplEmployerJobPostRepository repo1 = new ImplEmployerJobPostRepository();
	ImpJobSeekerRepository repo3=new  ImpJobSeekerRepository();
	ImplJobSeekerApplyJobRepository repo4=new ImplJobSeekerApplyJobRepository();
	public TestAppliedRepository() {
		
		super();
		repo.setConnection(DB_URL);
		repo1.setConnection(DB_URL);
		repo2.setConnection(DB_URL);
		repo3.setConnection(DB_URL);
		
		// TODO Auto-generated constructor stub
	}
	
	  @Test
	   public void testDataBaseConnection() {
			
		  assertNotNull(repo.conn);  
		  assertNotNull(repo1.conn); 
		  assertNotNull(repo2.conn);  
		  assertNotNull(repo3.conn);
		   
	   }
	  @Test
		public void test() {
		  
		  EmployerLoginPojo employerLoginPojo = new EmployerLoginPojo();
		   
		   employerLoginPojo.setCompany_name("ADP ADP");
		   employerLoginPojo.setEmail("testpojo1@adp");
		   employerLoginPojo.setPhone(1234);
		   employerLoginPojo.setPassword("adp");
		  
		   
		    repo2.addUser(employerLoginPojo);
		    EmployerJobPostPojo employerPostJobTest = new EmployerJobPostPojo()
					   ;
			   
			   employerPostJobTest.setCompany_name("ADP ADP");
			   employerPostJobTest.setPost_email("testpojo1@adp");
			   employerPostJobTest.setDesc("SQL DEvelpoer full time");
			   employerPostJobTest.setLocation("New york");
			   employerPostJobTest.setTitle("Job 1");
			   
			   assertTrue(repo1.addJob(employerPostJobTest));
			   JobSeekerLoginPojo jobSeekerLoginPojo=new JobSeekerLoginPojo();
				jobSeekerLoginPojo.setEmail("nathalapooja123@biodata");
				jobSeekerLoginPojo.setPassword("Pnathala123");
				jobSeekerLoginPojo.setFirst_name("Pooja Reddy");
				jobSeekerLoginPojo.setMiddle_name(null);
				jobSeekerLoginPojo.setLast_name("Nathala");
				
				 assertTrue(repo3.addUser(jobSeekerLoginPojo));
				
				JobSeekerBioDataPojo jobSeekerBioDataPojo= new JobSeekerBioDataPojo();
				jobSeekerBioDataPojo.setjFirstName("Pooja Reddy");
				jobSeekerBioDataPojo.setjLastName("Nathala");
				jobSeekerBioDataPojo.setjEmail("nathalapooja123@biodata");
				jobSeekerBioDataPojo.setjPhone(1234567890);
				jobSeekerBioDataPojo.setjSchool("MVSR");
				jobSeekerBioDataPojo.setjDegree("B.E");
				jobSeekerBioDataPojo.setjFStudy("Electronics");
				jobSeekerBioDataPojo.setjSStudyMonth("August");
				jobSeekerBioDataPojo.setjSStudyYear("2010");
				jobSeekerBioDataPojo.setjEStudyMonth("May");
				jobSeekerBioDataPojo.setjEStudyYear("2014");
				jobSeekerBioDataPojo.setjWJobTitle("SQL Developer");
				jobSeekerBioDataPojo.setjWCompany("ADP");
				jobSeekerBioDataPojo.setjWCountry("India");
				jobSeekerBioDataPojo.setjWCity("Hyderabad");
				jobSeekerBioDataPojo.setjSWorkMonth("September");
				jobSeekerBioDataPojo.setjSWorkYear("2014");
				jobSeekerBioDataPojo.setjEWorkMonth("December");
				jobSeekerBioDataPojo.setjEWorkYear("2016");
				assertTrue(repo3.addBioData(jobSeekerBioDataPojo));
				JobSeekerBioDataPojo jobSeekerBioDataPojo1;	
				jobSeekerBioDataPojo1=repo3.getBioData("nathalapooja123@biodata");
				assertEquals("Pooja Reddy",jobSeekerBioDataPojo1.getjFirstName());
				assertEquals("Nathala",jobSeekerBioDataPojo1.getjLastName());
				assertEquals("nathalapooja123@biodata",jobSeekerBioDataPojo1.getjEmail());
				assertEquals("123456890",jobSeekerBioDataPojo1.getjPhone());
				assertEquals("MVSR",jobSeekerBioDataPojo1.getjSchool());
				assertEquals("B.E",jobSeekerBioDataPojo1.getjDegree());
				assertEquals("Electronics",jobSeekerBioDataPojo1.getjFStudy());
				assertEquals("August",jobSeekerBioDataPojo1.getjSStudyMonth());
				assertEquals("2010",jobSeekerBioDataPojo1.getjSStudyYear());
				assertEquals("May",jobSeekerBioDataPojo1.getjEStudyMonth());
				assertEquals("2014",jobSeekerBioDataPojo1.getjEStudyYear());
				assertEquals("SQL Developer",jobSeekerBioDataPojo1.getjWJobTitle());
				assertEquals("ADP",jobSeekerBioDataPojo1.getjWCompany());
				assertEquals("India",jobSeekerBioDataPojo1.getjWCountry());
				assertEquals("Hyderabad",jobSeekerBioDataPojo1.getjWCity());
				assertEquals("September",jobSeekerBioDataPojo1.getjSWorkMonth());
				assertEquals("2014",jobSeekerBioDataPojo1.getjSWorkYear());
				assertEquals("December",jobSeekerBioDataPojo1.getjEWorkMonth());
				assertEquals("2016",jobSeekerBioDataPojo1.getjEWorkYear());


				
				
				JobSeekerJobApplyPojo jobSeekerJobApplyPojo=new JobSeekerJobApplyPojo();
				//jobSeekerJobApplyPojo.setJob_apply_id(1);
				jobSeekerJobApplyPojo.setJob_post_id(14);
				jobSeekerJobApplyPojo.setJobseeker_email("nathalapooja123@biodata");
				
				repo4.applyPostData(jobSeekerJobApplyPojo);
				 
		   
	      List<AddToShortListPojo> addToShortListPojos=new ArrayList<>();
	       addToShortListPojos=repo.processAppliedCandidates("testpojo1@adp");
	       assertTrue("Size is 1",addToShortListPojos.size()>0);
	       
	  }

}



