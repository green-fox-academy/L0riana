package com.greenfoxacademy.frontend;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;
import java.util.Random;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@EnableWebMvc
public class RestControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void testDoublingIs10() throws Exception {
    mockMvc
            .perform(get("/doubling?input=5")
                    .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result").value(10));
  }

  @Test
  public void testDoublingError() throws Exception {
    mockMvc
            .perform(get("/doubling")
                    .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error").value("Please provide an input!"));
  }

  @Test
  public void testDoublingAny() throws Exception {
    Random rand = new Random();
    int anyNumber = rand.nextInt(50) + 1;
    String any = Integer.toString(anyNumber);
    mockMvc
            .perform(get("/doubling?input=" + any)
                    .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result").value(2 * Integer.parseInt(any)));
  }

  @Test
  public void testGreeterError() throws Exception {
    mockMvc
            .perform(get("/greeter")
                    .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error").value("Please provide a name!"));
  }

  @Test
  public void testGreeterErrorNoTitle() throws Exception {
    mockMvc
            .perform(get("/greeter?name=petike")
                    .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error").value("Please provide a title!"));
  }

  @Test
  public void testGreeterIsOK() throws Exception {
    mockMvc
            .perform(get("/greeter?name=micike&title=student")
                    .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.welcome_message").value("Oh, hi there micike, my dear student!"));
  }

  @Test
  public void append() {
  }

  @Test
  public void doUntil() {
  }
}