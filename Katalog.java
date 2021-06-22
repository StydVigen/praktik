
import java.io.*;
import java.io.FileWriter;
import java.io.FileNotFoundException;
public class Katalog {
    private String Nstr;
    private String Tstr;
    private int Cstr;

    public String getNstr() {
        return Nstr;
    }
    public String getTstr() {
        return Tstr;
    }
    public int getCstr() {
        return Cstr;
    }

    public void setNstr(String Nstr) {
        this.Nstr = Nstr;
    }
    public void setTstr(String Tstr) {
        this.Tstr = Tstr;
    }
    public void setCstr(int Cstr) {
        this.Cstr = Cstr;
    }
    public void printAboutObject() {
        System.out.println("Название стрижки:"+Nstr);
        System.out.println("Тип стрижки:"+Tstr);
        System.out.println("Стоимость стрижки:"+Cstr);

    }

    public Katalog (String ns, String ts, int cs) throws IOException {
        Nstr = ns;
        Tstr = ts;
        Cstr = cs;
    }

    public void inputFile() throws FileNotFoundException {
        try(FileWriter writer = new FileWriter("Katalog.txt", true))
        {
            try {
                writer.write( "\nНазвание стрижки:" + this.Nstr + "/Тип стрижки:"+this.Tstr  +"/Стоимость стрижки:" +this.Cstr+"\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

