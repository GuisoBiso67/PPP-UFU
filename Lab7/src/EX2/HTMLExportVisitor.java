package EX2;

class HTMLExportVisitor implements Visitor {

    private StringBuilder html = new StringBuilder();

    @Override
    public void visit(Paragraph paragraph) {
        html.append("<p>").append(paragraph.getText()).append("</p>\n");
    }

    @Override
    public void visit(Image image) {
        html.append("<img src=\"").append(image.getUrl()).append("\" />\n");
    }

    @Override
    public void visit(Table table) {
        html.append("<table>\n");
        for (int i = 0; i < table.getRows(); i++) {
            html.append("<tr>");
            for (int j = 0; j < table.getColumns(); j++) {
                html.append("<td> </td>");
            }
            html.append("</tr>\n");
        }
        html.append("</table>\n");
    }

    public String getHTML() {
        return html.toString();
    }
}
