package factorypractice.lab;

/**
 *
 * @author jlombardo
 */
public class TipService {
    private TipCalculator tipCalculator;

    public TipService(TipCalculatorSpecification spec, ServiceQuality quality, double amount){
        this.tipCalculator=TipCalculatorFactory.createTipCalculator(spec,quality,amount);
    }
    
    public TipService(TipCalculator tipCalculator) {
        this.tipCalculator = tipCalculator;
    }
    
    public double getTip() {
        return tipCalculator.getTip();
    }
}
