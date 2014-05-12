package com.example.regextest;

import java.util.regex.Pattern;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/*本Demo测试一段字符是否匹配给定正则表达式*/
public class MainActivity extends Activity
{
	private EditText editText_regex,editText_string;
	private Button btn_check;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViews();
		setListners();
	}

	private void findViews(){
		editText_regex=(EditText) findViewById(R.id.editText_regex);
		editText_string=(EditText) findViewById(R.id.editText_string);
		btn_check=(Button) findViewById(R.id.btn_check);
	}
	
	private void setListners(){
		btn_check.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				String regex=editText_regex.getText().toString().trim();
				String str=editText_string.getText().toString().trim();
				if(Pattern.matches(regex, str)){
					Toast.makeText(getApplicationContext(), "匹配成功", Toast.LENGTH_SHORT).show();
				}else{
					Toast.makeText(getApplicationContext(), "匹配失败", Toast.LENGTH_SHORT).show();
				}
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
