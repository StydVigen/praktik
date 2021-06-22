import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Kassa {
    private String surname;
    private String Nstr;
    private int Cstr;

    public String getNstr() { return Nstr; }
    public String getsurname() {
        return surname;
    }
    public int getCstr() { return Cstr; }

    public void setNstr(String Nstr) { this.Nstr = Nstr; }
    public void setsurname(String surname) {
        this.surname = surname;
    }
    public void setCstr(int Cstr) { this.Cstr = Cstr; }

    public void printAboutObject() {
        System.out.println("Фамилия:"+surname);
        System.out.println("Название стрижки:"+Nstr);
        System.out.println("Стоимость стрижки:"+Cstr);

    }
    public Kassa (String s,String ns,int cs) throws IOException {
        surname = s;
        Nstr = ns;
        Cstr = cs;


    }

    public void inputFile() throws FileNotFoundException {
        try(FileWriter writer = new FileWriter("kassa.txt", true))
        {

            try {
                writer.write( "\nФамилия:" + this.surname + "\nНазвание стрижки:" + this.Nstr + "\nСтоимость стрижки:" +this.Cstr+ "\n" );
            } catch (IOException e) {
                e.printStackTrace();
            }
            writer.flush();
            Date dateNow = new Date();
            SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");
            System.out.println("Текущая дата " + formatForDateNow.format(dateNow));
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}