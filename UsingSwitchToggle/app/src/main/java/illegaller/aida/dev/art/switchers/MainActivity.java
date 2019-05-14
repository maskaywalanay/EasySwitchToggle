package illegaller.aida.dev.art.switchers;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.widget.CompoundButton.*;

public class MainActivity extends Activity 
{
	
	Switch swtc;
	TextView txt;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		txt = (TextView)findViewById(R.id.mainTextView);
		swtc = (Switch)findViewById(R.id.mainSwitch);
		
		swtc.setOnCheckedChangeListener(new OnCheckedChangeListener()
			{

				@Override
				public void onCheckedChanged(CompoundButton btnview, boolean isChecked)
				{
					// TODO: Implement this method
					if(isChecked == true)
					{
						txt.setText("Pesan Ketika Di Switch On");
					}
					else
					{
						txt.setText("Hello World");
					}
				}
				
			
		});
		
    }
}
