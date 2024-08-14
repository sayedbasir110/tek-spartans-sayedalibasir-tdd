package WrokWithTestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActivityTwo {
    public String getFullName(String firstName, String lastName) {
        if (firstName == null || lastName == null)
            throw new RuntimeException("FirstName or Last Name can NOT be null");

        if (firstName.isEmpty() || lastName.isEmpty())
            throw new RuntimeException("First Name or Last Name can NOT be Empty");

        lastName = lastName.trim();
        firstName = firstName.trim();

        return lastName.toUpperCase() + ", " +
                firstName.substring(0, 1).toUpperCase() +
                firstName.substring(1).toLowerCase();
    }
    @DataProvider (name="positive")
    public String [][] positiveTestData(){
        String [][] name ={
                {"    john    ","  doe    ","DOE, John"},
                {"j","Doe","DOE, J"},
                {"john paul", "doe carlos", "DOE CARLOS, John paul"},
                {"john","doe","DOE, John"},
                {"jOHn","dOE","DOE, John"}
        };
        return  name;
    }
    @Test(dataProvider = "positive")
    public void positiveTest(String firstName, String lastName, String expectedFullName) {
        String actualFullName = getFullName(firstName, lastName);
        Assert.assertEquals(actualFullName, expectedFullName);
    }
    // negative test: should throw Runtime exception
    @Test(expectedExceptions = RuntimeException.class)
    public void negativeTest (){
        getFullName(null,"Doe");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void negativeTestTwo(){
        getFullName(null,null);
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void negativeTestThree(){
        getFullName("john",null);
    }


}
