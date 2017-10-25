package is.ru.tictactoeProject;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class tictactoeTests
{		
	@Test
		public void testEmptyString()
		{
			assertEquals(0, tictactoe.temp(""));
		}
}