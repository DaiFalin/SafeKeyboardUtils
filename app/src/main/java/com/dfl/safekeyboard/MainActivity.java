package com.dfl.safekeyboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.dfl.library.SafeKeyboardUtils;

public class MainActivity extends AppCompatActivity {

    private EditText etNormal;
    private EditText etSafe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNormal = findViewById(R.id.et_normal);
        etSafe = findViewById(R.id.et_safe);
        LinearLayout linearLayout = findViewById(R.id.linearLayout);
        new SafeKeyboardUtils(this, linearLayout, etSafe,
                R.layout.layout_keyboard_containor);
        etSafe.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
