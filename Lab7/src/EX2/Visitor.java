package EX2;

interface Visitor {
    void visit(Paragraph paragraph);
    void visit(Image image);
    void visit(Table table);
}
