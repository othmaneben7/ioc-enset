package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier {
    @Autowired
    private IDao dao;

    public MetierImpl(IDao dao){
        this.dao=dao;
    }
    public MetierImpl(){

    }
    @Override
    public double calcul() {
        double t= dao.getData();
        double res=t*23;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}