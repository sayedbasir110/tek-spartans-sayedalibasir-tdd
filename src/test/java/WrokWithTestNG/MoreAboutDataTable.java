package WrokWithTestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MoreAboutDataTable {


    @DataProvider(name = "testingData1")
    public Object[][] testDataWithObject(){
        Object [][] data = {
                {"ALi", 3},
                {"John", 4},
                {"Mohammad", 8}
        };
        return data;
    }
    @Test(dataProvider = "testingData1")
    public void someTesting (String name, Integer expectedLength){
        Assert.assertEquals(name.length(), expectedLength,"Name length should match");
    }

    @DataProvider
    public Person[] testWithCustomPOJO (){
        Person[] data ={new Person("Ali",3), new Person("Alen",4)};
        return data;
    }
    @Test(dataProvider = "testWithCustomPOJO")
    public void test(Person person){
        Assert.assertEquals(person.getName().length(), person.getLength(), "Name length should match");
    }


}
