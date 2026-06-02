import java.util.*;

public class deleteToDo(){
    public static void main(String args[]){
        WebDriverManager.ChromeDriver.setup();
        WebDriver driver=new ChromeDriver();
        driver.window.maximize();
        driver.get("https://todomvc.com/examples/angular/dist/browser/#/all");
        
        String addList="Drink Water"
        if(addList.isDisplayed()){
            System.out.println("To do list added is visble");
        }
        else{
            System.out.println("To do list added is not visble");
        }
        WebElement inputRadio=By.xpath("//label[text()="Drink water"]//parent::div//input");
        try{
            JavaScriptExecutior js=New JavaScriptExecutior();
            js.executeScript(arguments[0].click(), inputRadio);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        WebElement xmark=By.xpath("//label[text()="Drink water"]//parent::div//button");
        WebElement clearCompletedBtn=By.xpath(" //button[text()=" Clear Completed "]");
        clearCompletedBtn.click();
        if(addList.isDisplayed()){
            System.out.println("To do item is not deleted");
        }
        else{
            System.out.println("To do item is deleted");
        }
        driver.quit();



        
    }
}
