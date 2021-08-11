package commandPattern;

public class AddMemberCommand implements Command{

	private String emailAddress;
	private String listName;
	private EWSService receiver;

	public AddMemberCommand(String email, String listName, EWSService receiver) {
		// TODO Auto-generated constructor stub
		this.emailAddress = email;
		this.listName = listName;
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiver.addMember(emailAddress, listName);
		
	}
	
}
