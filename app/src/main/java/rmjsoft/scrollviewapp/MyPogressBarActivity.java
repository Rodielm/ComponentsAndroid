package rmjsoft.scrollviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MyPogressBarActivity extends AppCompatActivity implements View.OnClickListener {

    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_pogress_bar);

    }

    @Override
    public void onClick(View view) {

    }
}
