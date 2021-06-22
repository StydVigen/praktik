import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int action;
        do {
            System.out.println("\n\n1.Добвавить клиента в базу данных");
            System.out.println("2.Добавить стрижку в каталог");
            System.out.println("3.Занести информацию о стрижке в кассу");
            System.out.println("4.Список стрижек в каталоге");
            System.out.println("5.Список клиентов");
            System.out.println("6.Выход");

            Scanner SCAN = new Scanner(System.in);
            action = SCAN.nextInt();
            switch (action) {
                case 1: {
                    Klient n = new Klient("Иванов", "Иван", "Иванович", 1, false);
                    n.printAboutObject();
                    n.inputFile();
                    System.out.println();
                    break;
                }
                case 2: {
                    Katalog d = new Katalog("Полубокс", "муж", 350);
                    d.printAboutObject();
                    d.inputFile();
                    System.out.println();
                    break;
                }
                case 3: {
                    Kassa u = new Kassa("Иванов", "Модельная", 600);
                    u.printAboutObject();
                    u.inputFile();
                    System.out.println();

                    break;
                }
                case 4: {
                    try (FileReader reader = new FileReader("Katalog.txt")) {
                        char[] buf = new char[1000000];
                        int c;
                        while ((c = reader.read(buf)) > 0) {

                            if (c < 1000000) {
                                buf = Arrays.copyOf(buf, c);
                            }
                            System.out.print(buf);
                        }
                    } catch (IOException ex) {

                        System.out.println(ex.getMessage());
                    }
                    break;
                }
                case 5: {
                    try (FileReader reader = new FileReader("Klient.txt")) {
                        char[] buf = new char[1000000];
                        int c;
                        while ((c = reader.read(buf)) > 0) {

                            if (c < 1000000) {
                                buf = Arrays.copyOf(buf, c);
                            }
                            System.out.print(buf);
                        }
                    } catch (IOException ex) {

                        System.out.println(ex.getMessage());
                    }
                    break;
                }
                case 6: {
                    break;
                }
                default:
                    System.err.println("\nОшибка! Введено некоректное значение!");
            }
        } while (action != 0 && action != 6);
    }
}


