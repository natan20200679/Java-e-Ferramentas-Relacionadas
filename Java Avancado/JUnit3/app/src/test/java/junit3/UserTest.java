package junit3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import junit3.user.User;

public class UserTest {

    @Test
    public void givenValidParams_WhenBuildingNewUser_ThenReturnValidUser() {
        final var expectedId = "id";
        final var expectedName = "username";
        final var expectedEmail = "email@email.com";
        final var user = User.builder(expectedId, expectedName, expectedEmail);
        Assertions.assertEquals(expectedId, user.getId());
        Assertions.assertEquals(expectedName, user.getName());
        Assertions.assertEquals(expectedEmail, user.getEmail());
    }

    @Test
    public void givenBlankEmailParam_WhenBuildingUser_ThenThrowAnError() {
        final var expectedId = "id";
        final var expectedName = "username";
        final var expectedEmail = "";
        Assertions.assertThrows(RuntimeException.class, () -> User
        .builder(expectedId, expectedName, expectedEmail));
    }
}
