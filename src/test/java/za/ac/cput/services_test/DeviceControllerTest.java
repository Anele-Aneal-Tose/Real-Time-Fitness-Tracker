//package za.ac.cput.services_test;
//
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import za.ac.cput.domain.Device;
//
//import static org.springframework.http.RequestEntity.post;
//import static org.springframework.web.servlet.function.ServerResponse.status;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//public class DeviceControllerTest {
//    @Autowired
//    private MockMvc mockMvc;
//
//    private final ObjectMapper mapper = new ObjectMapper();
//
//    @Test
//    public void testRegisterDevice() throws Exception {
//        Device device = new Device("d1", "FitBand", "HeartRate");
//
//        mockMvc.perform(post("/api/devices")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(mapper.writeValueAsString(device)))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.name").value("FitBand"));
//    }
//}
