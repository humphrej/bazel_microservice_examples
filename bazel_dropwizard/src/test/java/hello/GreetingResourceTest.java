package hello;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import io.dropwizard.testing.junit.ResourceTestRule;
import org.junit.ClassRule;
import org.junit.Test;

public class GreetingResourceTest {

  @ClassRule
  public static final ResourceTestRule resources = ResourceTestRule.builder()
      .addResource(new GreetingResource("Bob"))
      .build();

  @Test
  public void testGetPerson() {
    assertThat(resources.target("/greeting").request().get(Greeting.class)
        .getContent(), is("Hello, Bob!"));
  }
}
