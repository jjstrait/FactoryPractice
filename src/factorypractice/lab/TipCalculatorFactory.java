/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypractice.lab;

/**
 *
 * @author jstra
 */
public class TipCalculatorFactory {
    public static TipCalculator createTipCalculator(TipCalculatorSpecification spec, ServiceQuality quality, double amount) {
        TipCalculator calc = null;
        
        switch(spec) {
            case BAGGAGE:
                calc = new BaggageServiceTipCalculator(quality,(int)amount);
                break;
            case FOOD:
                calc = new FoodServiceTipCalculator(quality, amount);
                break;
            
        }
  
        return calc;
    }
}
