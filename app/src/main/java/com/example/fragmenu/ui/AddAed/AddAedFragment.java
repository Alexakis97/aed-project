package com.example.fragmenu.ui.AddAed;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.fragmenu.R;

public class AddAedFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_addaed, container, false);
        final TextView textView = root.findViewById(R.id.text_home);

        Button submitButton = (Button) root.findViewById(R.id.button);
        submitButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO

                textView.setText("Hahahaha");
            }
        });


        return root;
    }
}
