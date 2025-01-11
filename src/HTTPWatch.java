import org.openqa.selenium.ie.InternetExplorerDriver;


public class HTTPWatch {

	public static void main(String[] args) throws Exception {
	// Create IE instance using Selenium
	InternetExplorerDriver driver = new InternetExplorerDriver( pathContainingIEDriverServer);
	            
	// Set a unique initial page title so that HttpWatch can attach to it
	string uniqueTitle = Guid.NewGuid().ToString();
	IJavaScriptExecutor js = driver as IJavaScriptExecutor;
	js.ExecuteScript("document.title = '" + uniqueTitle + "';");
	 
	// Attach HttpWatch to the instance of IE created through Selenium
	Plugin plugin = control.AttachByTitle(uniqueTitle);
}
}