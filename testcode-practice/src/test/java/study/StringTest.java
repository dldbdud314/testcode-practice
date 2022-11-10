package study;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class StringTest {

    @Test
    void splitStringTest1(){
        String str = "1,2";
        assertThat(str.split(",")).containsExactly("1", "2");
    }

    @Test
    void splitStringTest2(){
        String str = "1";
        assertThat(str.split(",")).containsExactly("1");
    }

    @Test
    void substringTest(){
        String str = "(1,2)";
        assertThat(str.substring(1, 4)).isEqualTo("1,2");
    }

}
