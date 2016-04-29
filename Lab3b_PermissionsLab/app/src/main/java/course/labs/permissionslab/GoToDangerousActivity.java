package course.labs.permissionslab;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class GoToDangerousActivity extends Activity {
	
	private static final String TAG = "Lab-Permissions";

	private static final String DANGEROUS_ACTIVITY_ACTION = "course.labs.dangerousapp.DANGEROUS_ACTIVITY";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.go_to_dangerous_activity);

		Button startDangerousActivityButton = (Button) findViewById(R.id.start_dangerous_activity_button);
		startDangerousActivityButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				startDangerousActivity();

			}
		});

	}

	private void startDangerousActivity() {

		Log.i(TAG, "Entered startDangerousActivity()");
		//ComponentName cn = new ComponentName("course.labs.dangerousapp", "course.labs.dangerousapp.DangerousActivity");

		Intent dangerous_activity = new Intent();
		//dangerous_activity.setComponent(cn);

		dangerous_activity.setAction(DANGEROUS_ACTIVITY_ACTION);

		try {

			startActivity(dangerous_activity);
		}catch(ActivityNotFoundException e){
			Log.i(TAG,e.toString());
		}
		

	}

}
