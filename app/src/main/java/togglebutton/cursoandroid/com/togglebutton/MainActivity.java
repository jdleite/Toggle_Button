package togglebutton.cursoandroid.com.togglebutton;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity {


    private ToggleButton toggleButton;
    private TextView txtEx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       toggleButton = (ToggleButton) findViewById(R.id.tgbId);
       txtEx = (TextView) findViewById(R.id.txtExId);


       toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               txtEx.setText("");

               if(isChecked){
                   txtEx.setText("Mostrar");
               }
           }
       });

    }
}
