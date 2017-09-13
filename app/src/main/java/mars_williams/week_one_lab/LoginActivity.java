package mars_williams.week_one_lab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    private void displayToast(String message) {
        View layout = getLayoutInflater().inflate(R.layout.toast,
                (ViewGroup) findViewById(R.id.toast_layout_root));
        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText(message);
        Toast toast = new Toast(getApplicationContext());
        toast.setView(layout);
        toast.show();
    }

    public void onLogin(View v) {
        EditText username = (EditText)findViewById(R.id.username);
        String message = username.getText().toString() + ", you've logged in!";
        displayToast(message);
    }
}
