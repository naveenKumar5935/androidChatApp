package naveen.kumar.chatapp_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import naveen.kumar.chatapp_android.databinding.ActivityPhoneBinding;

public class PhoneActivity extends AppCompatActivity {

    ActivityPhoneBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPhoneBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
    }
}