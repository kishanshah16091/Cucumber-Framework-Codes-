package steps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

import java.util.List;
import java.util.Map;

public class AddEmployeeSteps extends CommonMethods {

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        //older version of writing the code
        // WebElement pimOPtion = driver.findElement(By.xpath("abc"));
        // pimOPtion.click();
        click(employeeSearchPage.pimOption);
    }
    @When("user clicks on add employee option")
    public void user_clicks_on_add_employee_option() {
        click(employeeSearchPage.addEmployeeOption);
    }

    @When("user enters firstname middlename and lastname")
    public void user_enters_firstname_middlename_and_lastname() {
        sendText(addEmployeePage.firstNameField, "dasir");
        sendText(addEmployeePage.middleNameField, "hamilia");
        sendText(addEmployeePage.lastNameField, "tolom");
    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        click(addEmployeePage.saveButton);
    }
    @Then("employee added successfully")
    public void employee_added_successfully() {
        System.out.println("Employee added");
    }

    @When("user enters {string} {string} and {string}")
    public void user_enters_and(String firstNameValue, String middleNameValue, String lastNameValue) {
        sendText(addEmployeePage.firstNameField, firstNameValue);
        sendText(addEmployeePage.middleNameField, middleNameValue);
        sendText(addEmployeePage.lastNameField, lastNameValue);
    }

    @When("user provides {string} {string} and {string}")
    public void user_provides_and(String firstName, String middleName, String lastName) {
        sendText(addEmployeePage.firstNameField, firstName);
        sendText(addEmployeePage.middleNameField, middleName);
        sendText(addEmployeePage.lastNameField, lastName);
    }

    @When("user provides multiple employee data and verify they are added")
    public void user_provides_multiple_employee_data_and_verify_they_are_added(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> employeeNames =  dataTable.asMaps();
        for (Map<String, String> employee :employeeNames) {
            System.out.println(employee);
            String firstNameValue = employee.get("firstName");
            String middleNameValue = employee.get("middleName");
            String lastNameValue = employee.get("lastName");
            System.out.println(firstNameValue + " " + middleNameValue + " " + lastNameValue);
            sendText(addEmployeePage.firstNameField, firstNameValue);
            sendText(addEmployeePage.middleNameField, middleNameValue);
            sendText(addEmployeePage.lastNameField, lastNameValue);
            click(addEmployeePage.saveButton);
            Thread.sleep(3000);

            //verification of adding an employee is HW
            click(employeeSearchPage.addEmployeeOption);
        }

    }

}