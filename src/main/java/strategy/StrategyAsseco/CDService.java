package strategy.StrategyAsseco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import strategy.StrategyAsseco.domain.CD;
import strategy.StrategyAsseco.domain.Vat;

@Service
public class CDService {

    @Autowired
    Vat vat;

    public void printCD_Result(CD cd) {
        System.out.println(cd.price(vat));
    }
}
