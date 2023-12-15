/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 84362
 */
public class TableDiemThi extends AbstractTableModel{
    private String name[]={"Mã môn","Tên môn","Số TC","TB KTTX","Điểm thi","Điểm 10","Điểm 4","Điểm chữ","Xếp loại"};
    private Class classes[]={String.class,String.class,Integer.class,Float.class,Float.class,Float.class,Float.class,String.class,String.class};

    ArrayList<Subject> SubjectList = new ArrayList<>();
    
    public TableDiemThi(ArrayList<Subject> list){
        SubjectList = list;
    }

    @Override
    public int getRowCount() {
        return SubjectList.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
            case 0: return SubjectList.get(rowIndex).getID(); 
            case 1: return SubjectList.get(rowIndex).getTen();
            case 2: return SubjectList.get(rowIndex).getSTC();
            case 3: return SubjectList.get(rowIndex).getTBTX();
            case 4: return SubjectList.get(rowIndex).getDiemThi();
            case 5: return SubjectList.get(rowIndex).getDiem10();
            case 6: return SubjectList.get(rowIndex).getDiem4();
            case 7: return SubjectList.get(rowIndex).getDiemChu();
            case 8: return SubjectList.get(rowIndex).getXepLoai();
            default :return null;
        }
    }
    
    @Override
    public Class getColumnClass(int columnIndex)
    {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column)
    {
        return name[column];
    }
}
