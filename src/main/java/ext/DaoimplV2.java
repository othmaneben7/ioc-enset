package ext;

import dao.IDao;

public class DaoimplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version web service");
        double t=77;
        return t;
    }
}
