package fr.yas.matchup.utils.processexecution;

import java.io.IOException;

public class ProcessManager {
	public static final String WAMP= "C:\\wamp64\\wampmanager.exe";
	
	private Process process;
	private String programName;
	
	public ProcessManager(String program) {
		programName=program;
		try {
			System.out.println("Openning "+programName);
			Runtime runTime = Runtime.getRuntime();
			process = runTime.exec(programName); 
			
			try {
				Thread.sleep(7000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	
	public void close() {	
		System.out.println("Closing "+programName);
		process.destroy(); 
	}
}
