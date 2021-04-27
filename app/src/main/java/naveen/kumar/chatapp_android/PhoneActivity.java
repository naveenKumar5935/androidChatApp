package naveen.kumar.chatapp_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import naveen.kumar.chatapp_android.databinding.ActivityPhoneBinding;

public class PhoneActivity extends AppCompatActivity {

    ActivityPhoneBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPhoneBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        binding.phoneBox.requestFocus();

        binding.buttonContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhoneActivity.this,OtpActivity.class);
               intent.putExtra("phoneNumber",binding.phoneBox.getText().toString());
                startActivity(intent);
            }
        });
    }
}