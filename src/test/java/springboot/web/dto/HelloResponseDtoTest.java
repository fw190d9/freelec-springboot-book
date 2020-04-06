package springboot.web.dto;

import org.junit.Test;

public class HelloResponseDtoTest {
    @Test
    public void  lombok_method_test() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        org.assertj.core.api.Assertions.assertThat(dto.getName()).isEqualTo(name);
        org.assertj.core.api.Assertions.assertThat(dto.getAmount()).isEqualTo(amount);

    }
}
