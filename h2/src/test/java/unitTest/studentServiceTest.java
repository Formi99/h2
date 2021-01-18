package unitTest;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.engProject.h2.dao.StudentRepository;
import com.engProject.h2.service.StudentService;

import com.engProject.h2.model.*;

public class studentServiceTest {
	
	@Mock
    private StudentRepository studentRepository;
	
	@BeforeEach
    public void setUpMocks() {
        MockitoAnnotations.initMocks(this);
    }
	
	@InjectMocks
	private StudentService studentService;
	
	@Test
	@DisplayName("findByClassroom")
    @TestFactory
    public Stream<DynamicNode> findByID() {
		
		 return Stream.of(
	                dynamicTest("success", () -> {
	                	
	                	String classroom ="1B";
	                	
	                	
	                
	                	
	                })
	                
	                
	     );
	}
}
