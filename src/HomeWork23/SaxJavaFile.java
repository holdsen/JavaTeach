package HomeWork23;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import java.io.FileWriter;
import java.io.IOException;

public class SaxJavaFile extends DefaultHandler {
    private String firstName = "";
    private String lastName = "";
    private String title = "";

    private StringBuilder elementValue = new StringBuilder();
    private FileWriter writer = null;
    private String outputFileName = "";

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        elementValue.setLength(0);
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        elementValue.append(ch, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        String text = elementValue.toString().trim();
        if (qName.equalsIgnoreCase("firstName")) {
            firstName = text;
        } else if (qName.equalsIgnoreCase("lastName")) {
            lastName = text;
        } else if (qName.equalsIgnoreCase("title")) {
            title = text;
        } else if (qName.equalsIgnoreCase("line")) {
            try {
                if (writer == null) {
                    outputFileName = firstName + "_" + lastName + "_" + title + ".txt";
                    writer = new FileWriter(outputFileName);
                    System.out.println("[SAX] Создаем файл: " + outputFileName);
                }
                writer.write(text + System.lineSeparator());
            } catch (IOException e) {
                System.err.println("Ошибка записи SAX: " + e.getMessage());
            }
        }
    }
    @Override
    public void endDocument() {
        if (writer != null) {
            try {
                writer.close();
                System.out.println("[SAX] Парсинг завершен успешно!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
