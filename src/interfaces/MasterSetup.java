/**
 * 
 */
package interfaces;

/**
 * @author amit
 *
 */
public interface MasterSetup {
	
	public void click(String selector, String actionText);
	
	public void selectByIndex(String selector, int index, String infoText);
	
	public void selectByValue(String selector, String value, String infoText);
	
	public void selectByVisibleText(String selector, String text, String infoText);
	
	public void getClass(String selector, String infoText);
	
	public void getFirstSelectedOptions(String selector, String infoText);
	
	public void getOptions(String selector, String infoText);
	
	public void getSelectSize(String selector, String infoText);
	
	public void getAttribute(String selector, String infoText);
	
	public String getText(String selector, String infoText);
	
	public void setText(String selector, String infoText);
	
	public void clearAnd_ThenSetText(String selector, String infoText);
	
	
	
	
	
	
}
