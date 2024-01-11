package functionality;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Application_functionality extends Validation_functionality {
	
	
	// ref varilable at global level 
	
	
	// constructor to call properties file in base class
	public Application_functionality () throws Exception {
		
		// file-1
		fis  =new FileInputStream(project_path+"\\src\\test\\resources\\enviroment.properties");
		envprop =new Properties();
		envprop.load(fis);
		
		// file-2
		fis = new FileInputStream(project_path+"\\src\\test\\resources\\locators.properties");
        locatorprop=new Properties();
        locatorprop.load(fis);
        
        // file 3 
        fis =new FileInputStream(project_path+"\\src\\test\\resources\\UAT.properties");
	    uatprop=new Properties();
	    uatprop.load(fis);
	    
	    
	    
	
	}
}