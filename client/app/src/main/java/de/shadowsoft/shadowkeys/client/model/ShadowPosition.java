package de.shadowsoft.shadowkeys.client.model;

public class ShadowPosition {

    private int column;
    private int row;

    public ShadowPosition() {
    }

    public ShadowPosition(final int column, final int row) {
        this.column = column;
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(final int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(final int row) {
        this.row = row;
    }
}
    
    