package admin.comlab.com.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void check(View view) {
        Boolean check=((CheckBox)view).isChecked();
        switch (view.getId()) {
            case R.id.cricket:
                if(check){
                    Toast.makeText(this,"Cricket is hobby",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.trek:
                if(check){
                    Toast.makeText(this,"Trekking is hobby",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.web:
                if(check){
                    Toast.makeText(this,"Building webpages is hobby",Toast.LENGTH_SHORT).show();
                }
                break;

        }
    }
}
