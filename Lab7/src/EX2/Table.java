package EX2;

class Table implements DocumentElement {
    private int rows;
    private int columns;

    public Table(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
