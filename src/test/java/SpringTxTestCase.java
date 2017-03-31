import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(
    locations = {"classpath:entry/dev/spring-entry.xml"}
)
public class SpringTxTestCase extends AbstractJUnit4SpringContextTests {
    public SpringTxTestCase() {
    }
}
