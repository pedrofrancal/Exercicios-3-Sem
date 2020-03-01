package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SistemaController {
	private String identifyOS() {
		return System.getProperty("os.name");
	}

	public void processRunning() {
		String SO = identifyOS();
		if (SO.contains("Windows")) {
			readProcess("tasklist");
		}
	}

	public void killProcess(String param) {
		String cmPid = "TASKKILL /PID";
		String cmNome = "TASKKILL /IM";
		int pid = 0;
		StringBuffer buffer = new StringBuffer();

		try {
			pid = Integer.parseInt(param);
			buffer.append(cmPid);
			buffer.append(" ");
			buffer.append(pid);
		} catch (NumberFormatException e) {
			buffer.append(cmNome);
			buffer.append(" ");
			buffer.append(param);
		}
		callProcess(buffer.toString());
	}

	private void callProcess(String command) {
		try {
			Runtime.getRuntime().exec(command);
		} catch (IOException e) {
			if (e.getMessage().contains("740")) {
				StringBuffer buffer = new StringBuffer();
				buffer.append("cmd /c");
				buffer.append(" ");
				buffer.append(command);
				try {
					Runtime.getRuntime().exec(buffer.toString());
				} catch (IOException e1) {
					System.err.println(e1.getMessage());
				}
			} else {
				System.err.println("Commando inválido");
			}
		}
	}

	private void readProcess(String command) {
		try {
			Process p;
			p = Runtime.getRuntime().exec(command);
			InputStream stream = p.getInputStream();
			InputStreamReader reader = new InputStreamReader(stream);
			BufferedReader buffer = new BufferedReader(reader);
			String line = buffer.readLine();

			while (line != null) {
				System.out.println(line);
				line = buffer.readLine();

			}
			buffer.close();
			reader.close();
			stream.close();

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
