package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport reportText = new TextReport();
        HtmlReport reportHtml = new HtmlReport();
        JSONReport reportJSON = new JSONReport();
        String text = reportText.generate("Name", "Body");
        String html = reportHtml.generate("Name", "Body");
        String json = reportJSON.generate("Name", "Body");
        System.out.println(text + "\n");
        System.out.println(html + "\n");
        System.out.println(json);
    }
}
