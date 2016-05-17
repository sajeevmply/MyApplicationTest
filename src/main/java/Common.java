/**
* This is a common file that will be used by all features
*/
public Common
{

	public void display(String value)
	{
		/* This will display the value passed to it on the sys console*/
		System.out.println(value);
    }
	public void feature(String value)
	{
		/* This will display the feature with the prefix feature */
		System.out.println("Feature: " + value);
	}
}