public class Report implements ReportAble {

    private User user;

    public Report(User user){
        this.user = user;
    }
  
    @Override
    public void report() {
        System.out.println("Report for user: " + user.getName());
    }
}
