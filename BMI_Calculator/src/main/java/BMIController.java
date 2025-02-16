import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BMIController {
    @FXML
    private TextField x;

    @FXML
    private TextField y;

    @FXML
    private Label l1;

    @FXML
    void onCalculateClick() {
        try {
            String weightText = x.getText();
            String heightText = y.getText();

            double weight = Double.parseDouble(weightText); // in kg
            double height = Double.parseDouble(heightText); // in meters

            if (weight <= 0 || height <= 0) {
                l1.setText("Enter valid weight and height!");
                return;
            }

            double bmi = weight / (height * height);
            String bmiFormatted = String.format("%2f",bmi); // Format to 2 decimal places

            l1.setText("Your BMI is " + bmiFormatted);
        } catch (NumberFormatException e) {
            l1.setText("Please enter valid numbers!");
        }
    }
}
