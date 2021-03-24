import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.pico.Application;
import com.pico.dao.GeneralDAO;

@SpringBootTest(classes = { Application.class })
@Transactional
public class HibernateDAOTest {
	@Autowired
	private GeneralDAO generalDAO;
	
	@Test	
	public void testQueryCount() {
		assertEquals(0,generalDAO.queryCount());        
	}
}
