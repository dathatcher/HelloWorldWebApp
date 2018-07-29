package embeddedTomcatSample;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

import servlet.HelloServlet;

public class ServletTest {

	private HelloServlet greeter = new HelloServlet();

	@Test
	public void greeterSaysHello() {
		assertThat(greeter.sayHello(), containsString("Helo"));
			//test
	}

}