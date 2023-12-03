package ui.custom.grid.table;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import data.models.User;

public class UserTableModel extends AbstractTableModel{
    private ArrayList<User> users;
    private String[] columns = {"Name", "description", "type", "price"};
    public UserTableModel(ArrayList<User> users) {
        this.users = users;
    }
    public void addRow(User user) {
        this.users.add(user);
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return this.users.size();
    }

    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        User user = this.users.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return user.getname();
            case 1:
                return user.getdescription();
            case 2:
                return user.gettype();
            case 3:
                return user.getprice();
            default:
                return null;
        }
    }
    
}
