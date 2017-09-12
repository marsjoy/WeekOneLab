package mars_williams.week_one_lab;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setUsernameAndPassword();
        setLogIn();
        setOr();
        setFacebookLogIn();
        setHelpSigningIn();
        setSignUp();
    }

    private void setFont(TextView textView) {
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/LibreFranklin-Light.ttf");
        textView.setTypeface(font);
    }

    private void setUsernameAndPassword() {
        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);
        setFont(username);
        setFont(password);
    }

    private void setLogIn() {
        TextView logIn = (TextView) findViewById(R.id.buttonLogin);
        setFont(logIn);
    }

    private void setHelpSigningIn() {
        TextView helpSigningIn = (TextView) findViewById(R.id.helpSigningIn);
        setFont(helpSigningIn);
    }

    private void setOr() {
        TextView or = (TextView) findViewById(R.id.or);
        setFont(or);
    }

    private void setFacebookLogIn() {
        TextView facebookLogIn = (TextView) findViewById(R.id.facebookLogIn);
        setFont(facebookLogIn);
    }

    private void setSignUp() {
        TextView signUp = (TextView) findViewById(R.id.signUp);
        setFont(signUp);
    }
}
