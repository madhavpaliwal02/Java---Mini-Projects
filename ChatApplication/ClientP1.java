package Projects.ChatApplication;
import java.io.*;
import java.net.*;

public class ClientP1 {

    Socket s;

    BufferedReader br;
    PrintWriter out;

    ClientP1(){
        try{
            System.out.println("Sending request to server");
            s = new Socket("localhost", 3000 );
            System.out.println("Connected !!!");

            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            out = new PrintWriter(s.getOutputStream());

            startReading();
            startWriting();

        } catch(Exception e) {e.printStackTrace();}
    }

    public void startReading(){
        Runnable r1=()->{
            System.out.println("Reader Started...");
            try{
              while(true){
                  String str = br.readLine();
                  if (str.equals("end")){
                      System.out.println("Server Terminated!!!");
                      s.close();
                      break;
                  }
                  System.out.println("Server Says: " + str);
              }
            } catch (Exception e) {e.printStackTrace();}
        };
        new Thread(r1).start();
    }

    public void startWriting(){
        Runnable r2=()->{
            System.out.println("Writer Started...");
            try{
                while(!s.isClosed()){
                    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
                    String str = br1.readLine();
                    out.println(str);
                    out.flush();

                    if(str.equals("end")){
                        System.out.println("Client Terminated...");
                        s.close();
                        break;
                    }
                }
            } catch(Exception e) {e.printStackTrace();}
        };
        new Thread(r2).start();
    }

    public static void main(String[] args) {
        new ClientP1();
    }

}
