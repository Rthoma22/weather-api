package com.newproject.demo;
import org.springframework.test.web.servlet.MockMvc;
import org.mockito.Mockito;
import org.junit.Before;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.InjectMocks;
import org.junit.runner.RunWith;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CustomerControllerTest {

    private MockMvc mockMvc;

    @InjectMocks
    private CustomerController controller;

    @Mock
    private CustomerService service;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void getAllCustomers() throws Exception {
        try {
            mockMvc.perform(MockMvcRequestBuilders.get("/customers"))
                    .andExpect(MockMvcResultMatchers.status().isOk());

        } catch (Exception e) {
            e.printStackTrace();

        }
        Mockito.verify(service).getAllCustomers();
    }

    @Test
    public void getCustomer() throws Exception {
        List<Customer> customerList = Arrays.asList(
                new Customer("chris",34,"street","man","12-5-87",236),
                new Customer("robbie",56,"not street","man","123-334-234",345)
        );

    }
}
