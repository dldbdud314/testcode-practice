package study;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
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

    @Test
    @DisplayName("인덱스 정상 접근 테스트")
    void charAtTest(){
        String str = "abc";
        assertThat(str.charAt(1)).isEqualTo('b');
    }

    @Test
    @DisplayName("인덱스 범위 밖에 접근했을 때 exception 발생")
    void charAtExceptionTest(){
        String str = "abc";
        assertThatThrownBy(()->{
            str.charAt(5);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 5");
    }

}
