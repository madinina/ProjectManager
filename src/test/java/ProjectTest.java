import junit.framework.Assert;

import org.junit.Test;


public class ProjectTest 
{

	@Test
	public void testProjectCreation()
	{
		Project projetA = new Project();
		Assert.assertNotNull(projetA);
	}
}
