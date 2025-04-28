package automate;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class AddPostTest extends BaseTest 
{
@Test(priority = 1)
public void testPost() throws InterruptedException {
	 
    System.out.println("Executing Posts Test");
    Thread.sleep(3000);
    ScreenshotUtil.captureScreenshot("Addpost","Before_Addpost");
    
    
    
   // Step 1: Click on the 'Add' button
   driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.youtube:id/image\"])[3]")).click();
   Thread.sleep(3000);
   ScreenshotUtil.captureScreenshot("Addpost","Click_Addbutton");
   
   
   
   // Step 2: Select the "Post" Options
   driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Post\"]")).click();
   Thread.sleep(3000);
   ScreenshotUtil.captureScreenshot("Addpost","Select_postooption");

   
   
   // Step 3: Click the "Album" Option 
  driver.findElement(By.id("com.google.android.youtube:id/attach_image_button")).click();
  Thread.sleep(3000);
  ScreenshotUtil.captureScreenshot("Addpost","Select_Album");
  
  
  
   // Step 4: Select the image Which image you have to upload 
   driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.youtube:id/selectable_image\"])[1]")).click(); 
   Thread.sleep(3000);
   ScreenshotUtil.captureScreenshot("Addpost","Click_Addbutton");
   
  
   
   //Step 5: Click the "Next Button" to proceed
   driver.findElement(By.id("com.google.android.youtube:id/next_button")).click();
   Thread.sleep(3000);
   ScreenshotUtil.captureScreenshot("Addpost","Click_next");
   
   
   
   //Step 6: Click the " Done button " to conformation
   driver.findElement(By.id("com.google.android.youtube:id/shorts_post_button_text")).click();
   Thread.sleep(3000);
   ScreenshotUtil.captureScreenshot("Addpost","Click_done");
   
   
   
   // Step 7: Click the Message box 
   driver.findElement(By.id("com.google.android.youtube:id/content")).click();
   Thread.sleep(3000);
   ScreenshotUtil.captureScreenshot("Addpost","Click_MessageBOx");
   
   
   
    // Step 8: Enter the Caption to post 
   driver.findElement(By.id("com.google.android.youtube:id/content")).sendKeys("We are Guarantee for quality of product");
   Thread.sleep(3000);
   ScreenshotUtil.captureScreenshot("Addpost","Enter_Caption");
   
   Thread.sleep(7000);
   
   //Step 9: Click the "Post" Button
   driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.google.android.youtube:id/post_button\"]")).click();
   ScreenshotUtil.captureScreenshot("Addpost","Click_Post");
   
   Thread.sleep(3000);
   
   System.out.println("Post uploaded sucessfully");
   
   Thread.sleep(3000);
   
   ScreenshotUtil.captureScreenshot("Addpost","After_Addpost");
    
   /*_________________________________________________________*****_____________________________________________________ */
   
   System.out.println("Start the Crosscheck process");
   Thread.sleep(3000);
   ScreenshotUtil.captureScreenshot("Addpost","Start_CrossCheck");
   
   
   
   // Step 10: Cross Check the process - Click the profile button
   driver.findElement(By.id("com.google.android.youtube:id/pivot_bar_thumbnail")).click();
   Thread.sleep(3000);
   ScreenshotUtil.captureScreenshot("Addpost","Click_profile");
   
   
   
   // Step 11: Click the " Profile " Button at the top left corner
   driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@resource-id=\"com.google.android.youtube:id/results\"]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView[1]")).click();
   Thread.sleep(3000);
   ScreenshotUtil.captureScreenshot("Addpost","Click_profileImage");
   
   
   
  // Step 12: Select the posts option
   driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.youtube:id/text\" and @text=\"Posts\"]")).click();
   Thread.sleep(3000);
   ScreenshotUtil.captureScreenshot("Addpost","Select_PostOption");
   
   
   
   // Step 13: Come again to Home Page 
   driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.youtube:id/image\"])[1]")).click();
   Thread.sleep(3000);
   ScreenshotUtil.captureScreenshot("Addpost","ComeAgin_HomePage");
   
   
   
   System.out.println("Posts modules was Successfully completed");

   
}
}
