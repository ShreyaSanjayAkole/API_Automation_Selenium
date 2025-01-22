package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTable {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.get("E:/QA Automation/Testing/Selenium_framework/src/test/java/Facebook/webTable.html");

        //Count Total number of rows present in the table
         List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
         int totalRows = allRows.size();
         System.out.println("total number of rows present in the table is :"+ totalRows);

        // count total number of columns
        List<WebElement> allColumns = driver.findElements(By.xpath("//th"));
        int totalColumns = allColumns.size();
        System.out.println("Total number of columns in the table is :" + totalColumns);

        //Count number of cells present in the table
         List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));
         int totalCells = allCells.size();
         System.out.println("Total number of cells present in the table is :" + totalCells);

         //Print ONLY the numbers int countNumberValue = 0;
         int countNumberValue = 0;
         int sum=0;
         for (WebElement cell : allCells)
         {
              String cellValue = cell.getText();
              try{
                  int number = Integer.parseInt(cellValue);
                  System.out.print(" "+number);
                  countNumberValue++;
                  sum = sum+number;
              }catch (Exception e) { }
         }
         System.out.println("Total count of numeric values is :"+countNumberValue);
         System.out.println("Total sum of all the numeric values is :"+sum);
    }
}
