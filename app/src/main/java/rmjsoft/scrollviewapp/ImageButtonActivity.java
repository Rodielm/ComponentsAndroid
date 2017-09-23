package rmjsoft.scrollviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ImageButtonActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button2);

        findViewById(R.id.my_image_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this,"Image Button Clicked",Toast.LENGTH_LONG).show();
    }
}
