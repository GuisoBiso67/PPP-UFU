package EX2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<DocumentElement> document = new ArrayList<>();

        document.add(new Paragraph("Paragrafo um"));
        document.add(new Image("imagem.png"));
        document.add(new Table(2, 3));
        document.add(new Paragraph("Mais um paragrafo aqui"));

        HTMLExportVisitor htmlVisitor = new HTMLExportVisitor();

        for (DocumentElement element : document) {
            element.accept(htmlVisitor);
        }

        System.out.println("HTML gerado:");
        System.out.println(htmlVisitor.getHTML());

        WordCountVisitor wordVisitor = new WordCountVisitor();

        for (DocumentElement element : document) {
            element.accept(wordVisitor);
        }

        System.out.println("Total de palavras: " + wordVisitor.getWordCount());
    }
}
