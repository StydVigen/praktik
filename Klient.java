import java.io.*;
import java.io.FileWriter;
import java.io.FileNotFoundException;
public class Klient  {
    private String surname;
    private String name;
    private String Middlename;
    private int Kstr;
    private boolean Pklient;


    public String getsurname() {
        return surname;
    }
    public String getname() {
        return name;
    }
    public String getMiddlename() {
        return Middlename;
    }
    public int getKstr() {
        return Kstr;
    }
    public boolean getPklient() {
        return Pklient;
    }
    public void setsurname(String surname) {
        this.surname = surname;
    }
    public void setname(String name) {
        this.name = name;
    }
    public void setMiddlename(String Middlename) {
        this.Middlename = Middlename;
    }
    public void setKstr(int Kstr) {
        this.Kstr = Kstr;
    }
    public void setPklient(boolean Pklient) {
        this.Pklient = Pklient;
    }
    public void printAboutObject() {
        System.out.println("Фамилия:"+surname);
        System.out.println("Имя:"+name);
        System.out.println("Отчество:"+Middlename);
        System.out.println("Кол-во стрижек:"+Kstr);
        System.out.println("Постоянный клиент:"+Pklient);
    }

    public Klient(String s, String n, String m, int k,boolean p) throws IOException {
        surname = s;
        name = n;
        Middlename = m;
        Kstr = k;
        Pklient = p;
    }

    public Klient() throws IOException {
        surname = "Фамилия не указана";
        name = "Имя не указано";
        Middlename = "-";
        Kstr = 0;
        Pklient = false;
    }

    public void inputFile() throws FileNotFoundException {
        try(FileWriter writer = new FileWriter("klient.txt", true))
        {
            try {
                if (Kstr > 5) {Pklient = true;}
                else {Pklient = false;}
                writer.write( "\nФамилия:" + this.surname + "\nИмя:"+this.name +"\nОтчество:" +this.Middlename+"\nКол-во стрижек:" + this.Kstr+"\nПостоянный клиент:"+this.Pklient+"\n");
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
