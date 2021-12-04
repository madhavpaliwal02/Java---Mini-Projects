package Projects.ChatApplication;
import java.net.*;
import java.io.*;

public class ServerP {
    ServerSocket ss;
    Socket s;

    BufferedReader br;
    PrintWriter out;

    public ServerP(){
    try{
        ss = new ServerSocket(3000);
        System.out.println("Server is ready to accept connection");
        System.out.println("Waiting");
        s = ss.accept();

        br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        out = new PrintWriter(s.getOutputStream());

        startReading();
        startWriting();

    } catch(Exception e){ e.printStackTrace(); }
    } // End of constructor

    public void startReading(){
        Runnable r1=()->{
            System.out.println("Reader Started...");
            try{
                while(true){
                    String str = br.readLine();
                    if (str.equals("end")) {
                        System.out.println("Client terminated...");
                        s.close();
                        break;
                    }
                    System.out.println("Client Says: " + str);
                }
            } catch (Exception e){ e.printStackTrace(); }
        };
        new Thread(r1).start();
    }

    public void startWriting(){
        Runnable r2=()->{
            System.out.println("Writer Started...");
            try{
                while(!s.isClosed()){
                    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
                    String msg = br1.readLine();
                    out.println(msg);
                    out.flush();

                    if(msg.equals("end")){
                        s.close();
                        break;
                    }
                }
            } catch (Exception e) {e.printStackTrace();}
        };
        new Thread(r2).start();
    }

    public static void main(String[] args) {
        new ServerP();
    }
}
