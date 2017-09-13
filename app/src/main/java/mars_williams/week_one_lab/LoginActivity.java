package mars_williams.week_one_lab;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private Typeface franklinLight;
    private Typeface franklinRegular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        typefaceLight();
        typefaceRegular();
        setUsernameAndPassword();
        setLogIn();
        setOr();
        setFacebookLogIn();
        setForgotLoginDetails();
        setHelpSigningIn();
        setNoAccount();
        setSignUp();
    }

    private void typefaceLight() {
        franklinLight = Typeface.createFromAsset(getAssets(), "fonts/LibreFranklin-Light.ttf");
    }

    private void typefaceRegular() {
        franklinRegular = Typeface.createFromAsset(getAssets(), "fonts/LibreFranklin-Regular.ttf");
    }

    private void setTypefaceLight(TextView textView) {
        textView.setTypeface(franklinLight);
    }

    private void setTypefaceRegular(TextView textView) {
        textView.setTypeface(franklinRegular);
    }

    private void setUsernameAndPassword() {
        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);
        setTypefaceLight(username);
        setTypefaceLight(password);
    }

    private void setLogIn() {
        TextView logIn = (TextView) findViewById(R.id.buttonLogin);
        setTypefaceRegular(logIn);
    }

    private void setForgotLoginDetails() {
        TextView forgotLoginDetails = (TextView) findViewById(R.id.forgotLoginDetails);
        setTypefaceLight(forgotLoginDetails);
    }

    private void setHelpSigningIn() {
        TextView helpSigningIn = (TextView) findViewById(R.id.helpSigningIn);
        setTypefaceRegular(helpSigningIn);
    }


    private void setOr() {
        TextView or = (TextView) findViewById(R.id.or);
        setTypefaceLight(or);
    }

    private void setFacebookLogIn() {
        TextView facebookLogIn = (TextView) findViewById(R.id.facebookLogIn);
        setTypefaceRegular(facebookLogIn);
    }

    private void setNoAccount() {
        TextView noAccount = (TextView) findViewById(R.id.noAccount);
        setTypefaceLight(noAccount);
    }

    private void setSignUp() {
        TextView signUp = (TextView) findViewById(R.id.signUp);
        setTypefaceRegular(signUp);
    }
}
