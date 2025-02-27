import java.util.ArrayList;
import java.util.List;
import commandPatternIntefaces.ICommand;

public class ModifyPrice {
		
	private final List<ICommand> commands;
	private ICommand command;
	
		public ModifyPrice() 
		{
			this.commands = new ArrayList<>();
		}
		
		public void setCommand(ICommand command) 
		{
			this.command = command;
		}
		
		public void invoke() 
		{
			commands.add(this.command);
			this.command.executeAction();
		}
}
