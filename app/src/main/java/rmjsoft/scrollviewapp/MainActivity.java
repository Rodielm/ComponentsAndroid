package rmjsoft.scrollviewapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnTextView;
    private Button btnEditText;
    private Button btnAutoCompleteTv;
    private Button btn;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTextView = (Button) findViewById(R.id.btnTv);
        btnTextView.setOnClickListener(this);
        btnEditText = (Button) findViewById(R.id.btnEdit);
        btnEditText.setOnClickListener(this);
        btnAutoCompleteTv = (Button) findViewById(R.id.btnAutoTv);
        btnAutoCompleteTv.setOnClickListener(this);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);

        findViewById(R.id.btnImageButton).setOnClickListener(this);
        findViewById(R.id.btnCheckBox).setOnClickListener(this);
        findViewById(R.id.btnToggleButton).setOnClickListener(this);
        findViewById(R.id.btnRadioButton).setOnClickListener(this);
        findViewById(R.id.btnRadioGroup).setOnClickListener(this);
        findViewById(R.id.btnProgressBar).setOnClickListener(this);
        findViewById(R.id.btnSpinner).setOnClickListener(this);
        findViewById(R.id.btnTimePicker).setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btnTv:
                intent = new Intent(MainActivity.this,MyTextViewActivity.class);
                startActivity(intent);
                break;

            case R.id.btnEdit:
                intent = new Intent(MainActivity.this,EditTextActivity.class);
                startActivity(intent);
                break;

            case R.id.btnAutoTv:
                intent = new Intent(MainActivity.this,MyAutoCompleteTextViewActivity.class);
                intent.putExtra("text","Hola");

                Bundle bundle = new Bundle();
                bundle.putString("string_in_bundle","Texto desde el Bundle");
                intent.putExtra("myBundle", bundle);

                startActivity(intent);
                break;

            case R.id.btn:
                intent = new Intent(MainActivity.this,ButtonActivity.class);
                startActivity(intent);
                break;

            case R.id.btnImageButton:
                intent = new Intent(MainActivity.this,ImageButtonActivity.class);
                startActivity(intent);
                break;

            case R.id.btnCheckBox:
                intent = new Intent(MainActivity.this,CheckBoxActivity.class);
                startActivity(intent);
                break;

            case R.id.btnToggleButton:
                intent = new Intent(MainActivity.this,ToggleButtonActivity.class);
                startActivity(intent);
                break;

            case R.id.btnRadioButton:
                intent = new Intent(MainActivity.this,MyRadioButtonActivity.class);
                startActivity(intent);
                break;

            case R.id.btnRadioGroup:
                intent = new Intent(MainActivity.this,MyRadioGroupActivity.class);
                startActivity(intent);
                break;

            case R.id.btnProgressBar:
                intent = new Intent(MainActivity.this,MyPogressBarActivity.class);
                startActivity(intent);
                break;

            case R.id.btnSpinner:
                intent = new Intent(MainActivity.this,MySpinnerActivity.class);
                startActivity(intent);
                break;

            case R.id.btnTimePicker:
                intent = new Intent(MainActivity.this,MyTimePickerActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}






