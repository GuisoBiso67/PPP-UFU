package EX2;

class WordCountVisitor implements Visitor {

    private int wordCount = 0;

    @Override
    public void visit(Paragraph paragraph) {
        String[] words = paragraph.getText().split("\\s+");
        wordCount += words.length;
    }

    @Override
    public void visit(Image image) {
        // Imagem não conta palavras
    }

    @Override
    public void visit(Table table) {
        // Pode ignorar ou implementar lógica própria
    }

    public int getWordCount() {
        return wordCount;
    }
}
