public class CombinedTable {
    private int seats;
    private SingleTable table1;
    private SingleTable table2;

    public CombinedTable(SingleTable table1, SingleTable table2){
        this.table1 = table1;
        this.table2 = table2;
        seats = table1.getNumSeats() + table2.getNumSeats() - 2;
    }

    public boolean canSeat(int toSit){
        return toSit <= seats;
    }

    public double getDesirability(){
        if (table1.getHeight() == table2.getHeight()){
            return (table1.getViewQuality() + table2.getViewQuality()) / 2.0;
        }
        return ((table1.getViewQuality() + table2.getViewQuality()) / 2.0 ) - 10;
    }
}
