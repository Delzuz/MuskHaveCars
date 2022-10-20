package com.example.MuskHaveCars;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import com.example.MuskHaveCars.Classes.Car;
import com.example.MuskHaveCars.Classes.Customer;
import com.example.MuskHaveCars.Repository.CarRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.web.servlet.MockMvc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@AutoConfigureMockMvc
@SpringBootTest
@ComponentScan({"com.example.MuskHaveCars.*"})
class MuskHaveCarsApplicationTests {

	@MockBean
	private CarRepository carRepository;
	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private ObjectMapper objectMapper;

	@Test
	void should_return_cars() throws Exception {
		long id = 1L;
		List<Car> cars = new ArrayList<>(
				Arrays.asList(new Car(id, "Polestar 3", "Description 1", 4)));
		when(carRepository.findAll()).thenReturn(cars);
		mockMvc.perform(get("/cars"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(cars.size()))
				.andDo(print());
	}
	@Test
	public void createCustomerAndTryGetters() {
		Customer customer = new Customer("john", "johnson", "bluestreet", 202020,
				"john@gmail.com", "076", "21570", "malmo");
		Assertions.assertEquals("john", customer.getFirstName());
		Assertions.assertEquals("bluestreet", customer.getAddress());
		Assertions.assertEquals("malmo", customer.getCustomerCity());
	}
}