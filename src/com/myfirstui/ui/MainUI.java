package com.myfirstui.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class MainUI {
    private JPanel rootPanel;
    private JTable showTable;
    private JComboBox genreCombo;
    private JComboBox typeCombo;
    private JTextField minVotesField;
    private JButton episodeButton;
    private JButton imdbButton;

    public MainUI() {
        createTable();
        createGenreCombo();
        creattypeCombo();
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    private void createTable() {
        Object[][] data = {
                {"The Dark Knight", 2008, 9.0, 1886938},
                {"Star Wars: Episode V - The Empire Strike Back", 1980, 8.8, 962165},
                {"Inception", 2010, 8.8, 1675116},
                {"Matrix", 1999, 8.7, 1699463},
                {"Once upon a Time... in Hollywood", 2019, 7.6, 571708},
                {"Shogun", 1980, 8.1, 11695},
                {"Narcos", 2015, 8.8, 364029}
        };
        showTable.setModel(new DefaultTableModel(
                data,
                new String[] {"Title", "Year", "Rating", "Num Votes"}

        ));
        TableColumnModel columns = showTable.getColumnModel();
        columns.getColumn(0).setMinWidth(250);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        columns.getColumn(1).setCellRenderer(centerRenderer);
        columns.getColumn(2).setCellRenderer(centerRenderer);
        columns.getColumn(3).setCellRenderer(centerRenderer);

    }

    private void createGenreCombo() {
        genreCombo.setModel(
                new DefaultComboBoxModel(new String[] {"Action", "Fantasy", "Drama", "Romance", "Sci-Fi"}
        ));
    }

    private void creattypeCombo() {
        typeCombo.setModel(
                new DefaultComboBoxModel(new String[] {"Movie", "TV Series", "TV Episode", "Short"}
        ));
    }
}
