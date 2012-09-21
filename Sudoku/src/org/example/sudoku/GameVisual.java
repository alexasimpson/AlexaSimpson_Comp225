package org.example.sudoku;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;

public class GameVisual extends Activity {
	GridView gridView;
	 
	static final String[] numbers = new String[] { 
		"5", "5", "5","5", "5", "5", "5", "5", "5", "5", "5",
		"5", "5", "5","5", "5", "5", "5","5", "5", "5", "5",
		"5", "5", "5","5", "5", "5", "5", "5", "5", "5", "5", "5",
		"5", "5", "5","5", "5", "5","5", "5", "5","5", "5", "5", "5",
		"5", "5", "5","5", "5", "5","5", "5", "5","5", "5", "5","5", "5", "5","5", "5", "5","5", "5", "5",
		"5", "5", "5","5", "5", "5","5", "5", "5","5", "5", "5","5",}; //enough 5s to form an 9x9 matrix
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
				setContentView(R.layout.puzzle);
				gridView = (GridView) findViewById(R.id.gridView1);
				 
				ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
						android.R.layout.simple_list_item_1, numbers);
		 
				gridView.setAdapter(adapter);
		 
				gridView.setOnItemClickListener(new OnItemClickListener() {
					public void onItemClick(AdapterView<?> parent, View v,
						int position, long id) {
					   Toast.makeText(getApplicationContext(),
						((TextView) v).getText(), Toast.LENGTH_SHORT).show();
					}
				});
		 
			}
		 
	}

