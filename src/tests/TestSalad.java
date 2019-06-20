package tests;

import com.company.model.OtherComponents;
import com.company.model.Salad;
import com.company.model.SaladComponent;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSalad {
    @Test
    public void testCalculateSaladCalories(){
        Salad salad = new Salad();
        int result = salad.calculateSaladCalories();
        Assert.assertEquals (1346,result);
    }
    @Test
    public void testFindByCalorie(){
        Salad salad = new Salad();
        List<SaladComponent> result = salad.findByCalorie(1,10);
        List<SaladComponent> expected = new ArrayList<>();
        expected.add(OtherComponents.LEMON_JUICE);
        Assert.assertEquals(expected,result);
    }
}
