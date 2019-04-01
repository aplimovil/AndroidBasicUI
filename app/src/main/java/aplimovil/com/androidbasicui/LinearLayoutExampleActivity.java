/**
 *
 * Applications development for mobile devices
 * -------------------------------------------
 *
 * This LinearLayoutExample implements an example that shows
 * how to use a Linear Layout in Android.
 *
 * @author Francisco Martinez
 *
 *
 */


package aplimovil.com.androidbasicui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class LinearLayoutExampleActivity extends AppCompatActivity
        implements RadioGroup.OnCheckedChangeListener {
    RadioGroup orientation;
    RadioGroup gravity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //inflates the full View Layout from the XML file
        setContentView(R.layout.activity_linear_layout_example);

        //gets an object representation from the View in XML file
        orientation=(RadioGroup)findViewById(R.id.orientation);
        //sets a listener for handling RadioGroup events
        orientation.setOnCheckedChangeListener(this);
        gravity=(RadioGroup)findViewById(R.id.gravity);
        gravity.setOnCheckedChangeListener(this);
    }

    /**
     * Handles the Radio Group events. It changes the layout orientation and
     * alignment according to the choice.
     * @param group the RadioGroup sending the event
     * @param checkedId the id of the choice sending the event
     */
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.horizontal:
                //change the layout orientation
                orientation.setOrientation(LinearLayout.HORIZONTAL);
                break;

            case R.id.vertical:
                //change the layout orientation
                orientation.setOrientation(LinearLayout.VERTICAL);
                break;

            case R.id.left:
                //change the layout alignment
                gravity.setGravity(Gravity.LEFT);
                break;

            case R.id.center:
                //change the layout alignment
                gravity.setGravity(Gravity.CENTER_HORIZONTAL);
                break;

            case R.id.right:
                //change the layout alignment
                gravity.setGravity(Gravity.RIGHT);
                break;
        }
    }
}

