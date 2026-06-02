import java.util.*;

public class addToDoList(){
    public static void main(String args[]){
        WebDriver driver=new ChromeDriver();
        driver.get("https://todomvc.com/examples/angular/dist/browser/#/all");
        WebElement placeholder=By.xpath("//input[@placeholder="What needs to be done?"]");
        if(placeholder.isDisplayed()){
            System.out.println("PlaceHolder is displayed");
        }
        else{
            System.out.println("PlaceHolder not  displayed");
        }
        
        String addList="Drink Water"
        placeholder.sendKeys("Drink Water");
        Actions a =new Actions();
        a.sendKeys(Keys.ENTER);
        if(placeholder.isDisplayed()){
            System.out.println("Add to do list is added");
        }
        else{
            System.out.println("Add to do list is not added");
        }
        

        
    }
}
