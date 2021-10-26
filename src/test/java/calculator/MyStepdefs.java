package calculator;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private Calculator calculator;
    private int value1;
    private int value2;
    private int result;
    private String op;
    private double res_op;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values, ([-+]?\\d+) and ([-+]?\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }


    @When("^I add the two values$")
    public void iAddTheTwoValues() {
        result = calculator.add(value1, value2);
        System.out.print(result);
    }

    @Then("^I expect the result ([-+]?\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);

    }

    @Given("^One input value, ([-+]?\\d+) and one operation (\\w+)$")
    public void oneInputValueAndOneOperation(int arg0, String arg1) {
        value1 = arg0;
        op = arg1;
    }


    @When("^I operate the value$")
    public void iOperateTheValue() {
        res_op = calculator.operate(value1, op);
        System.out.print(res_op);
    }


    @Then("^I expect the operation result (\\d+)\\.(\\d+)$")
    public void iExpectTheOperationResult(int arg0, int arg1) {
        int len = String.valueOf(arg1).length();
        double final_res = arg1 / Math.pow(10, len) + arg0;
        Assert.assertEquals(final_res, res_op, 0.0001);
    }

    @Then("^I expect the operation result -(\\d+)\\.(\\d+)$")
    public void iExpectTheOperationResultMinus(int arg0, int arg1) {
        int len = String.valueOf(arg1).length();
        double final_res = arg1 / Math.pow(10, len) + arg0;
        Assert.assertEquals(-final_res, res_op, 0.0001);
    }

    @Then("^I expect the operation result ([-+]?\\d+)$")
    public void iExpectTheOperationResult(int arg0) {
        Assert.assertEquals(arg0, res_op, 0.0001);
    }

}
