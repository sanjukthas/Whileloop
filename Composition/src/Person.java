
public class Person {

			//composition has-a relationship
		private Job job;
		private Education education;
		public Person(){
		    this.job=new Job();
		    job.setSalary(1000L);
		}
		public long getSalary() {
		    return job.getSalary();
		}
 @Overwrite
		public String toString(){
       this.education=new Education();
      	education.setname("abc");
	return education.getname();
 }
public char[] getname() {
	// TODO Auto-generated method stub
	return null;
}
 
		}