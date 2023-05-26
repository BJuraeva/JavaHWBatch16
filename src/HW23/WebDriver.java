package HW23;
/*
Create a WebDriver Interface that will have the following unimplemented behaviour:
openBrowser(), closeBrowser(), maximizeWindow(), findElement().
Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */
public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{
     @Override
     public  void openBrowser(){
         System.out.println("Open browser in Chrome Driver");
     }

    @Override
    public void closeBrowser() {
        System.out.println("Close Browser in Chrome Driver");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize window inChrome Driver");
    }

    @Override
    public void findElement() {
        System.out.println("Find an element inChrome Driver");
    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Close Browser in Firefox Driver");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close browser in Firefox Driver");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize browser in Firefox Driver");
    }

    @Override
    public void findElement() {
        System.out.println("Find an element inFirefox Driver");
    }
}
