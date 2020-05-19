package sg.edu.rp.c346.id19043996.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName, etPhone, etPeople;
    CheckBox cbSA;
    DatePicker dp;
    TimePicker tp;
    Button btnReserve, btnReset;
    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.editText);
        etPhone = findViewById(R.id.editText2);
        etPeople = findViewById(R.id.editText3);
        cbSA =findViewById(R.id.checkBox);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnReserve = findViewById(R.id.button);
        btnReset = findViewById(R.id.button2);
        tvMessage = findViewById(R.id.textView);

        btnReserve.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int day = dp.getDayOfMonth();
            int month = dp.getDayOfMonth();
            int year = dp.getYear();
            Log.i("MyActivity", "Button Click()");
            Toast.makeText(MainActivity.this, "Name: " + etName + ", Phone number " + etPhone + ", No. of people: " + etPeople
                    + cbSA + ", Date: " + dp + " , Time: " + tp, Toast.LENGTH_LONG).show();

            if(cbSA.isChecked()){
                tvMessage.setText("Reserved at smoking area");
            } else{
                tvMessage.setText("Reserved at non-smoking area");
            }

        }

        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tp.setCurrentHour(7);
                tp.setCurrentMinute(30);
                tvMessage.setText("");
            }
        });
        }
}
