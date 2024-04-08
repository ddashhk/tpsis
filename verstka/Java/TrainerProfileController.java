import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrainerProfileController {

    @GetMapping("/trainer/dashboard")
    public String getTrainerDashboard(Model model) {
        return "trainer-dashboard"; 
    }
}
