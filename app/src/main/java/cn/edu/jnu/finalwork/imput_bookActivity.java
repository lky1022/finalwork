package cn.edu.jnu.finalwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class input_bookActivity extends AppCompatActivity {

    public static final int RESULT_CODE_SUCCESS = 666;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imput_book);

        EditText editTextTitle=findViewById(R.id.editTextTextbookTitle);
        EditText editTextJianjie=findViewById(R.id.editTextTextbookjianjie);

        Button buttonok=findViewById(R.id.button_ok);
        buttonok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                Bundle bundle=new Bundle();
                bundle.putString("title",editTextTitle.getText().toString());
                bundle.putString("jianjie",editTextJianjie.getText().toString());
                intent.putExtras(bundle);
                setResult(RESULT_CODE_SUCCESS,intent);

                input_bookActivity.this.finish();
            }
        });
    }
}