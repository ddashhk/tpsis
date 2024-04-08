import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManagerProfileController {

    @GetMapping("/manager/dashboard")
    public String getManagerDashboard(Model model) {
        // Добавить атрибуты модели, если нужно
        return "manager-dashboard"; // имя файла HTML для профиля менеджера
    }
}
