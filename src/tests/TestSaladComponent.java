package tests;

import com.company.model.OtherComponents;
import com.company.model.SaladComponent;
import com.company.model.Vegetables;
import org.junit.Assert;
import org.junit.Test;

public class TestSaladComponent {
    @Test
    public void testCalcCalories(){
        SaladComponent comp1 = Vegetables.CUCUMBER;
        SaladComponent comp2 = OtherComponents.OLIVE_OIL;
        double result1 = comp1.calcCalories();
        double result2 = comp2.calcCalories();
        Assert.assertEquals(40,result1,0.0005);
        Assert.assertEquals(432,result2,0.00005);
    }
}
