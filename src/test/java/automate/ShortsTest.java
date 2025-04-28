package automate;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ShortsTest extends BaseTest {

	@Test(priority = 3)
    public void testShorts() throws InterruptedException {
	 
	     System.out.println("Executing Shorts Test");
	     Thread.sleep(3000);
	     ScreenshotUtil.captureScreenshot("Shorts","Before_Shorts");
	     
	     
	     
        // Step 1: Click on the 'Shorts Symbol' button
        driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.youtube:id/image\"])[2]")).click();
        Thread.sleep(3000);
        ScreenshotUtil.captureScreenshot("Shorts","Click_ShortSymbol");
        
        
        
        // Step 2: One Click to Pause
        driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id=\"com.google.android.youtube:id/reel_watch_player\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.View")).click();
        Thread.sleep(3000);
        ScreenshotUtil.captureScreenshot("Shorts","Click_Pause");
        
        
        
        // Step 3: One Click to Run
        driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id=\"com.google.android.youtube:id/reel_watch_player\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.View")).click();
        Thread.sleep(3000);
        ScreenshotUtil.captureScreenshot("Shorts","Click_Run");
        
        
        
        // Step 4: Click the "Like" button 
        driver.findElement(By.xpath("//android.view.ViewGroup[contains(@content-desc, 'like this video')]/android.widget.ImageView")).click();
        Thread.sleep(3000);
        ScreenshotUtil.captureScreenshot("Shorts","Click_LikeButton");     
        
        
 
        // Step 5: Click the "Dislike" 
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Dislike this video\"]/android.widget.ImageView")).click(); 
        Thread.sleep(3000);
        ScreenshotUtil.captureScreenshot("Shorts","Click_Dislike");
        
        
        
        //Step 6: Click the Share Button
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Share this video\"]/android.widget.ImageView")).click();
        Thread.sleep(3000);
        ScreenshotUtil.captureScreenshot("Shorts","Click_Sharebutton");
        
        
        
       //Step 7: Copy the link to Share
        driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@resource-id=\"com.google.android.youtube:id/bottom_sheet_list\"]/android.view.ViewGroup/android.view.ViewGroup[3]")).click();
        Thread.sleep(3000);
        ScreenshotUtil.captureScreenshot("Shorts","Copy_link");
        
        
        
        // Step 8: Go to Comment Section
        driver.findElement(By.xpath("//android.view.ViewGroup[contains(@content-desc, 'View') and contains(@content-desc, 'comments')]/android.widget.ImageView")).click();
        Thread.sleep(3000);
        ScreenshotUtil.captureScreenshot("Shorts","Click_Comment");
        
        
        
        //Step 9:Click Add the command option
        driver.findElement(By.xpath("//android.widget.EditText[@text=\"Add a comment...\"]")).click();
        Thread.sleep(3000);
        ScreenshotUtil.captureScreenshot("Shorts","Click_Add_command");
        
       
        
        
       //Step 10: Click the Send Button
        driver.findElement(By.xpath("//android.widget.EditText[@text=\"Add a comment...\"]")).sendKeys("Add the comment");
        Thread.sleep(3000);
        ScreenshotUtil.captureScreenshot("Shorts","Enter the Comment");
        
       
        
        
       //Step 11: Click on the Send Button
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Send comment\"]/android.widget.ImageView")).click();
        Thread.sleep(3000);
        ScreenshotUtil.captureScreenshot("Shorts","Click_Sendbotton");
     
        
        
        System.out.println("Shorts modules was Successfully completed");
        Thread.sleep(3000);
        ScreenshotUtil.captureScreenshot("Shorts","After_Shorts");
        
    }
}
