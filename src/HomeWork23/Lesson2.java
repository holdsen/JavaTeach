package HomeWork23;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson2 {
    public static Scanner scanner = new Scanner(System.in);
    private static final String XML_PATH = "D:\\JavaTeach\\src\\HomeWork23\\HomeWork23.xml";
    public static void main(String[] args) {
        File xmlFile = new File(XML_PATH);
        if (!xmlFile.exists()) {
            System.out.println("Ошибка: Файл " + XML_PATH + " не найден !");
            return;
        }
        while (true) {
            System.out.println("Введите цифру (1 - SAX парсер, 2 - DOM парсер):");
            try {
                int choice = scanner.nextInt();
                if (choice == 1) {
                    runSaxParser(xmlFile);
                    break;
                } else if (choice == 2) {
                    runDomParser(xmlFile);
                    break;
                } else if (choice == 3) {
                    System.out.println("Пока");
                    System.exit(9);
                } else {
                    System.out.println("Неверно! Нужно ввести  1 или 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Вы ввели буквы. Введите цифру от 1 до 2.");
                scanner.next();
            }
        }
    }
    private static void runSaxParser(File file) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            SaxJavaFile handler = new SaxJavaFile();
            saxParser.parse(file, handler);
        } catch (Exception e) {
            System.err.println("Ошибка SAX парсинга: " + e.getMessage());
        }
    }
    private static void runDomParser(File file) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);
            doc.getDocumentElement().normalize();
            String firstName = doc.getElementsByTagName("firstName").item(0).getTextContent();
            String lastName = doc.getElementsByTagName("lastName").item(0).getTextContent();
            String title = doc.getElementsByTagName("title").item(0).getTextContent();

            String outputFileName = firstName + "_" + lastName + "_" + title + ".txt";
            System.out.println("[DOM] Создаем файл: " + outputFileName);

            NodeList lineNodes = doc.getElementsByTagName("line");
            try (FileWriter writer = new FileWriter(outputFileName)) {
                for (int i = 0; i < lineNodes.getLength(); i++) {
                    writer.write(lineNodes.item(i).getTextContent() + System.lineSeparator());
                }
                System.out.println("[DOM] Парсинг завершен успешно!");
            }
        } catch (Exception e) {
            System.err.println("Ошибка DOM парсинга: " + e.getMessage());
        }
    }
}
