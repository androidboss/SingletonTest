package com.example.singletontest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import com.example.singletontest.R;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Singleton<MyClass> myClass = new Singleton<MyClass>() {
			
			@Override
			protected MyClass create() {
				// 此处可以很复杂的实现，充分自由的自己实现创建实例
				// 这里就简化一下，直接创建了
				return new MyClass();
			}
		};
		
		// 使用的时候，就可以调用了：
		myClass.get().showInfo();
		
		TextView tx = (TextView)findViewById(R.id.text_view);
		tx.setText("" + myClass.get().getInfo()) ;
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
