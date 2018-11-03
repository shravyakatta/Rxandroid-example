package c.kakatiyasolutions.rxjavaexample;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
TextInputLayout username,password;
EditText usernameedtxt,passwordedtxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main3 );
     //   RxTextView.textChanges(mCreditCardInput);


    }
}
