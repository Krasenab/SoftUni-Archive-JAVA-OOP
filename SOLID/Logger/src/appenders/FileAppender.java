package appenders;

import files.LogFile;
import interfaces.Appenders;
import interfaces.Layout;

public class FileAppender implements Appenders {
	private LogFile fileLog;
	private Layout interfaceLayout;
	
	public FileAppender(Layout layout,LogFile lgFile) 
	{
		interfaceLayout = layout;
		fileLog = lgFile;
	}
	@Override
	public void appendMessage(String dateTime, String reportLevel, String message) {			
		String txtForWrite = interfaceLayout.format(dateTime, reportLevel, message);
		fileLog.write(txtForWrite);
	}

}
