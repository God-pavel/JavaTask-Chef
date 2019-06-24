import com.company.model.OtherComponents;
import com.company.model.Salad;
import com.company.model.SaladComponent;
import com.company.model.Vegetables;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс тест для класса Салат
 * @autor Павел Панкратов
 * @version 1.0
 */

public class TestSalad {
    /** Метод тестировки метода подсчета калорийности  */
    @Test
    public void testCalculateSaladCalories(){
        Salad salad = new Salad();
        int result = salad.calculateSaladCalories();
        Assert.assertEquals (1346,result);
    }
    /** Метод тестировки метода поиска компонентов салата за калорийностью  */
    @Test
    public void testFindByCalorie(){
        Salad salad = new Salad();
        List<SaladComponent> result1 = salad.findByCalorie(1,10);
        List<SaladComponent> result2 = salad.findByCalorie(0,1);
        List<SaladComponent> result3 = salad.findByCalorie(1000,1050);
        List<SaladComponent> expected1 = new ArrayList<>();
        List<SaladComponent> expected2 = new ArrayList<>();
        List<SaladComponent> expected3 = new ArrayList<>();
        expected1.add(OtherComponents.LEMON_JUICE);
        Assert.assertEquals(expected1,result1);
        Assert.assertEquals(expected2,result2);
        Assert.assertEquals(expected3,result3);
    }
    /** Метод тестировки метода сортировки компонентов салата за калорийностью  */
    @Test
    public void testSortByCalorie(){
        Salad salad = new Salad();
        salad.sortByCalorie();
        List<SaladComponent> expected = new ArrayList<>();
        expected.add(OtherComponents.LEMON_JUICE);
        expected.add(Vegetables.CUCUMBER);
        expected.add(Vegetables.LETTUCE);
        expected.add(Vegetables.BELL_PEPPER);
        expected.add(Vegetables.ONION);
        expected.add(Vegetables.TOMATO);
        expected.add(OtherComponents.OLIVE_OIL);
        expected.add(OtherComponents.FETA);
        Assert.assertEquals (expected, salad.getComponents());
    }
}
