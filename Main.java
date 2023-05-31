public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		SaveAble saveable = new Persister(user);
        saveable.save();

        ReportAble reportable = new Report(user);
        reportable.report();
	}
}