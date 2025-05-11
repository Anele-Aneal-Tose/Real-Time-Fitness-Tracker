//package za.ac.cput.services_test;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.web.servlet.MockMvc;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import org.springframework.http.MediaType;
//import za.ac.cput.domain.User;
//
//import static org.springframework.http.RequestEntity.post;
//import static org.springframework.web.servlet.function.ServerResponse.status;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//
//@SpringBootTest
//@AutoConfigureMockMvc
//public class UserControllerTest {
//    @Autowired
//    private MockMvc mockMvc;
//
//    private final ObjectMapper mapper = new ObjectMapper();
//
//    @Test
//    public void testCreateAndGetUser() throws Exception {
//        User user = new User("u1", "Alice", "alice@example.com");
//
//        // Create user
//        mockMvc.perform(post("/api/users")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(mapper.writeValueAsString(user)))
//                .andExpect(status().isOk());
//
//        // Get user
//        mockMvc.perform(get("/api/users/u1"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.name").value("Alice"));
//    }
//}
