import java.util.*;

public class filterToDoList(){
    public static void main(String args[]){
        WebDriverManager.ChromeDriver.setup();
        WebDriver driver=new ChromeDriver();
        driver.window.maximize();
        driver.get("https://todomvc.com/examples/angular/dist/browser/#/all");
        
        WebElement activeText=By.xpath("//a[text()="Active"]");
        WebElement completedText=By.xpath("//a[text()="Completed"]");
        WebElement allText=By.xpath("//a[text()="All"]");
        allText.click();
        List<WebElement> completedList=By.xpath("//ul//li[@class="completed"]");
        
        try{
            if(activeText.isDisplayed() && completedText.isDisplayed()){
                completedText.click();
                if(completedList.get(0).isDisplayed){
                    System.out.println("Only Completed list generated");
                }
                else{
                    System.out.println("Completed list not generated");
                }

            }
                
            
        }
        catch(Exception e){
            System.out.println(e.getMessage();)
        }
         driver.quit();

        
    }
}
