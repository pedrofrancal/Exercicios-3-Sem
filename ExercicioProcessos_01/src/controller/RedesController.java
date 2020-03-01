package controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {
	public void ip(String SO) {
		String command = null;
		if (SO.contains("Windows")) {
			command = "cmd /c ipconfig";
		} else {
			command = "ifconfig";
		}
		chamarProcesso(command);
	}

	private void chamarProcesso(String command) {
		try {
			Process p = Runtime.getRuntime().exec(command);
			InputStream input = p.getInputStream();
			InputStreamReader reader = new InputStreamReader(input);
			BufferedReader buffer = new BufferedReader(reader);
			String line = buffer.readLine();

			double media = 0;
			String adaptador = "";
			while (line != null) {
				if (command.contains("config")) {
					if (line.contains("Ethernet")) {
						adaptador = line;
					}
					if (line.contains("IPv4")) {
						int index = line.lastIndexOf(" ");
						index++;
						System.out.println(adaptador + "\n" + line.substring(index));
					}
				}else {
					int start = 0, end = 0;
					if(line.contains("Resposta")) {
						start = line.lastIndexOf("tempo=");
						start+=6;
						end = line.lastIndexOf("TTL");
						end-=3;
					}
					String newLine = line.substring(start, end);
					if(!newLine.equals("")){
						media+=Integer.parseInt(newLine);
					}
					if(!line.substring(start, end).equals("")) {
						System.out.println(newLine+"ms");
					}
				}
				line = buffer.readLine();
			}
			if(media > 0) {
				media/=10;
				System.out.println("Media de "+media+"ms");
			}
			buffer.close();
			reader.close();
			input.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public void ping(String SO) {
		if (SO.contains("Windows")) {
			chamarProcesso("cmd /c ping /n 10 www.google.com.br");
		}
	}
}
