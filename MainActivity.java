package com.example.win7.ch5_ex02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView TextView1,TextView2,txtResult;
    private RadioButton rad1,rad2,rad3,rad4;
    private RadioGroup radGroup1;
    private EditText edtname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtname=(EditText)findViewById(R.id.edtname);
        TextView1=(TextView)findViewById(R.id.TextView1);
        TextView1=(TextView)findViewById(R.id.TextView2);
        txtResult=(TextView)findViewById(R.id.txtResult);
        rad1=(RadioButton)findViewById(R.id.rad1);
        rad2=(RadioButton)findViewById(R.id.rad2);
        rad3=(RadioButton)findViewById(R.id.rad3);
        rad4=(RadioButton)findViewById(R.id.rad4);
        radGroup1=(RadioGroup)findViewById(R.id.radGroup1);

        radGroup1.setOnCheckedChangeListener(radGroup1Listener);
    }

    private RadioGroup.OnCheckedChangeListener radGroup1Listener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId)
        {
            if(checkedId == R.id.rad1)
                txtResult.setText(edtname.getText()+"您的血型為"+ rad1.getText() + " 型 " );
            else if(checkedId == R.id.rad2)
                txtResult.setText(edtname.getText()  + "您的血型為" + rad2.getText() + " 型 " );
            else if(checkedId == R.id.rad3)
                txtResult.setText(edtname.getText()  + "您的血型為" + rad3.getText() + " 型 " );
            else if(checkedId == R.id.rad4)
                txtResult.setText(edtname.getText()  + "您的血型為" + rad4.getText() + " 型 " );
        }
    };
}
