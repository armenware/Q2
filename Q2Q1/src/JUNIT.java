import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class JUNIT {

	@Test
	public void test() {
        question1 obj = new question1();
        int result = obj.total_cost(12520, 0.05);
        Assert.assertEquals(52584,result);
    }
}


