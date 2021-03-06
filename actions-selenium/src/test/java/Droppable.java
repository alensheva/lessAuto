import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Droppable extends TestBase {
    @Test
    public void testDroppable() {
        wd.get("http://localhost/tests/drop.html");
        WebElement box = wd.findElement(By.cssSelector("#draggable"));
        WebElement target = wd.findElement(By.xpath("//div[@id='droppable']"));

        new Actions(wd).clickAndHold(box)
                .moveToElement(target)
                .release()
                .perform();

    }
}