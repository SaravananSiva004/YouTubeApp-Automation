package automate;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SubscribeTest extends BaseTest 
{
@Test(priority = 2)
public void testSubscribe() throws InterruptedException{
	 
    System.out.println("Executing Subscribe Test");
    Thread.sleep(3000);
    ScreenshotUtil.captureScreenshot("Subscribe","Before_SubscribeTest");
    
    
    
   // Step 1: Click on the 'Subscribe option' button
   driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.youtube:id/image\"])[4]")).click();
   Thread.sleep(3000);
   ScreenshotUtil.captureScreenshot("Subscribe","Select_Subscribe_Option");
   
   
   
   // Step 2: Select the channel
   driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"SonyMusicSouthVEVO\"]")).click();
   Thread.sleep(3000);
   ScreenshotUtil.captureScreenshot("Subscribe","Select_Channel");

   
   
   // Step 3: Click the "View Channel" button 
  driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Visit channel\"]")).click();
  Thread.sleep(3000);
  ScreenshotUtil.captureScreenshot("Subscribe","Click_ViewChennal");
       
  
  
   // Step 4: Click the "Subscribe button" 
   driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Options\"]")).click(); 
   Thread.sleep(3000);
   ScreenshotUtil.captureScreenshot("Subscribe","Click_Subscribe");
   
   
   
   //Step 5: Click the "Unsubscribe button" Button
   driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Unsubscribe from SonyMusicSouthVEVO.\"]")).click();
   Thread.sleep(3000);
   ScreenshotUtil.captureScreenshot("Subscribe","Click_UnSubscribe");
   
   
   
   //Step 6: Click the subscribe button
   driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Subscribe to SonyMusicSouthVEVO.\"]")).click();
   Thread.sleep(3000);
   ScreenshotUtil.captureScreenshot("Subscribe","Click_Again_Subscribe");
   
   
   
   // Step 7: Click the "Subscribe content button" 
   driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Options\"]")).click();
   Thread.sleep(3000);
   ScreenshotUtil.captureScreenshot("Subscribe","Click_Subscribe_Content");

   
   
   //Step 8: Click the "Bell Icon "
   driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@resource-id=\"com.google.android.youtube:id/bottom_sheet_list\"]/android.view.ViewGroup/android.view.ViewGroup[1]")).click();
   Thread.sleep(3000);
   ScreenshotUtil.captureScreenshot("Subscribe","Click_BellIcon");
   
   
   
   // Step 9: Come again to Home Page 
   driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.youtube:id/image\"])[1]")).click();
   Thread.sleep(3000);
   ScreenshotUtil.captureScreenshot("Subscribe","Come_HomePage");
   
   
   
   System.out.println("Subscriptions modules was Successfully completed");
   Thread.sleep(3000);
   ScreenshotUtil.captureScreenshot("Subscribe","After_SubscribeTest");

   
}
}