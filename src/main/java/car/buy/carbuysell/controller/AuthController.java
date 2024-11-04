import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

    @GetMapping("/forgot_password")
    public String forgotPasswordPage() {
        return "forgot_password";  // Ensure this matches the name of your HTML file without the .html extension
    }

    @PostMapping("/process_forgot_password")
    public String processForgotPassword(@RequestParam("email") String email) {
        // Implement your email sending logic here
        return "redirect:/login";  // Redirect to login or show a success page
    }
}
