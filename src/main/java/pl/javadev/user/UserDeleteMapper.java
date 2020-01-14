package pl.javadev.user;

public class UserDeleteMapper {
    public static User map(UserDeleteDto dto) {
        User user = new User();
        user.setId(dto.getId());
        user.setPassword(dto.getPassword());
        return user;
    }

    public static UserDeleteDto map(User user) {
        UserDeleteDto dto = new UserDeleteDto();
        dto.setId(user.getId());
        dto.setPassword(user.getPassword());
        return dto;
    }
}
