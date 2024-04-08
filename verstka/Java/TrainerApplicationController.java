import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TrainerApplicationController {

    @GetMapping("/trainer/application")
    public String getApplicationForm() {
        return "trainer-application"; // имя файла HTML для формы подачи заявки
    }

    @PostMapping("/trainer/application")
    public String submitApplication(/* Здесь параметры заявки */) {
        // Обработка заявки
        return "redirect:/trainer/dashboard"; // перенаправить на страницу профиля после подачи заявки
    }
}
