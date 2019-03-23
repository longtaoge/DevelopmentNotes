package org.xiangbalao.common.gradledemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.xiangbalao.BuildConfig;
import org.xiangbalao.R;

public class MainActivity extends Activity  {


    private TextView tv_app;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        initView();

    }





    private void initView() {

        tv_app = (TextView) findViewById(R.id.tv_app);
        tv_app.setText(BuildConfig.APPLICATION_ID);
    }

}
