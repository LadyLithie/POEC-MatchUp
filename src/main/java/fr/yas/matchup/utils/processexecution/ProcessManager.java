/**
 * 
 */
package fr.yas.matchup.utils.processexecution;

import java.io.IOException;


/**
 * @author Audrey
 *
 *Allow to launch any application I want and close it
 */
public class ProcessManager {

	public static final String WAMP = "C:\\wamp64\\wampmanager.exe";
	private Process process = null;
	private String programName;

	public ProcessManager(String program) {
		programName = program;
		try {
			System.out.println("Opening "+ programName);
			Runtime runTime = Runtime.getRuntime();
			process  = runTime.exec(program);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		System.out.println("Closing " + programName);
		process.destroy();
		}

}
