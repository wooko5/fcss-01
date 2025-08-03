package fast.campus.fcss01.user;

import org.junit.jupiter.api.Test;
import org.springframework.security.core.GrantedAuthority;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class UsersTest {

    @Test
    void jaeukUserTest() {
        Users jaeuk = new Users("jaeuk.oh", "12345");

        assertThat(jaeuk.getUsername()).isEqualTo("jaeuk.oh");
        assertThat(jaeuk.getPassword()).isEqualTo("12345");
        assertThat(jaeuk.getAuthorities()).size().isEqualTo(1);

        Optional<? extends GrantedAuthority> read = jaeuk.getAuthorities()
                .stream()
                .filter(authority -> authority.getAuthority().equals("READ"))
                .findFirst();

        read.ifPresent(grantedAuthority -> assertThat(grantedAuthority.getAuthority()).isEqualTo("READ"));
    }
}