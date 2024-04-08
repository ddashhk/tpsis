import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserManagementController {

    @GetMapping("/manager/users")
    public String getUserManagement(Model model) {
        // Добавить список пользователей в модель
        return "user-management"; // имя файла HTML для управления пользователями
    }
}
