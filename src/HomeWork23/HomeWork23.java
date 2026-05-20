package HomeWork23;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Домашнее задание №23
 * Данный класс содержит комплексное решение задач по теме XML документы.
 * Основные темы:

 *   - XML документы
 *   - Dom
 *   - Json

 * @author Arsen Shaternik ★
 * @author inspector Nikita Shaternik ★
 * @version New
 * @see javax.xml.parsers.DocumentBuilder
 * @since 20.05.2026

 * Json Dom XML
 **/
public class HomeWork23 {
    public static void main(String[] args) {
        try {
            // Микита измени тут свой путь
            File xmlFile = new File("D:\\JavaTeach\\src\\HomeWork23\\HomeWork23.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            String firstName = doc.getElementsByTagName("firstName").item(0).getTextContent();
            String lastName = doc.getElementsByTagName("lastName").item(0).getTextContent();
            String title = doc.getElementsByTagName("title").item(0).getTextContent();
            String outputFileName = firstName + "_" + lastName + "_" + title + ".txt";
            System.out.println("Создаем файл с именем: " + outputFileName);
            NodeList lineNodes = doc.getElementsByTagName("line");
            try (FileWriter writer = new FileWriter(outputFileName)) {
                for (int i = 0; i < lineNodes.getLength(); i++) {
                    String lineText = lineNodes.item(i).getTextContent();
                    writer.write(lineText + System.lineSeparator());
                }
                System.out.println("Запись успешно завершена! Проверьте корень проекта.");
            } catch (IOException e) {
                System.err.println("Ошибка при записи в файл: " + e.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Ошибка при парсинге XML: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


