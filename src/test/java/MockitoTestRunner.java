import com.javase.simple_mvc.model.Account;
import com.javase.simple_mvc.model.Person;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTestRunner {
    @Mock
    private Account account;

    @InjectMocks
    private Person person = new Person();
}
