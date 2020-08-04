package com.example.kakaotalkclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button = findViewById(R.id.but);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //EditText = 클래스 , et~~~ = 객체(변수)
                EditText etEmail = findViewById(R.id.email);
                EditText etPassword = findViewById(R.id.pass);

                String email = etEmail.getText().toString();
                String pass = etPassword.getText().toString();

                // 입력받은 아이디가 id,비밀번호가 pw일 때 로그를 찍어라

                //equals("") = is empty() = is blank() 이며, &09080789 = email (x) 이므로, equals,isempty,isblank 사용
                //text: = "글자" 입력시 자동생성
                if(email.equals("id") && pass.equals("pw")){
                    Log.d("login", "pass");
                    Toast.makeText(getApplicationContext(), "로그인 성공", Toast.LENGTH_LONG).show();
                }
                else if(email.isEmpty() && pass.isEmpty()){
                    Toast.makeText(getApplicationContext(), "빈칸을 채워주세요", Toast.LENGTH_LONG).show();
                }else {
                    Toast
                            .makeText(getApplicationContext(), "다시 확인해주세요", Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });
    }
}