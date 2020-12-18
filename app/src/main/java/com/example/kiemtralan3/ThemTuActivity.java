package com.example.kiemtralan3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.ExecutionException;

public class ThemTuActivity extends AppCompatActivity {

    EditText editTu, editDinhNghia, editHinh;
    private static String tu= null, dinhNghia=null, hinh= null;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_tu);

        editTu= findViewById(R.id.editTuMoi);
        editDinhNghia= findViewById(R.id.editDinhNghiaMoi);
        editHinh= findViewById(R.id.editHinh);
    }

    public void ThemTu(View view) {
        tu= editTu.getText().toString();
        dinhNghia= editDinhNghia.getText().toString();
        hinh=editHinh.getText().toString();
        if(kiemTraNhap(tu, dinhNghia))
        {
            tu= tu.replaceAll(" ", "%20");
            dinhNghia= dinhNghia.replaceAll(" ", "%20");
            TuVung word= new TuVung(tu, dinhNghia, hinh);  // lat chinh sua lai
            try {
                String str= new APIAdd(this).execute(word).get();
                Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();

            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else{
            Toast.makeText(this, "Không được bỏ trống từ và định nghĩa", Toast.LENGTH_SHORT).show();
        }


    }
    public void Back(View view) {

        intent= new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }

    public boolean kiemTraNhap(String tuNhap, String dinhNghiaNhap){
        if(tuNhap.trim().length()==0 || dinhNghiaNhap.trim().length()==0)// nó do containt là kt ben trong co khoang trang ko? có thì false
            return false;
        return true;
    }

}