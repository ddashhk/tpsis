import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GroupListController {

    @GetMapping("/trainer/group-list")
    public String getGroupList(Model model) {
        return "group-list"; // имя файла HTML для списка группы
    }
}
