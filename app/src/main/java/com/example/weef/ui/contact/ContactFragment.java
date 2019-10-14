package com.example.weef.ui.contact;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import com.example.weef.R;

public class ContactFragment extends Fragment {

    private ContactViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(ContactViewModel.class);
        View root = inflater.inflate(R.layout.contact, container, false);
        root.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.lefttoright));


        TextView tv=root.findViewById(R.id.editText);
        tv.setText(Html.fromHtml("<b>Dr. R. Jagadeesh Kannan</b><br>Professor and Dean - School of Computing Science and Engineering<br>Vellore Institute of Technology,<br>Chennai Campus, Vandalur Kelambakkam Road,<br>Chennai, Tamilnadu, India<br>Email: weef2019@gmail.co<br>Phone: +91 44 – 39931555 / 39931518<br>Fax: +91 44 - 39932555<br>" +
                "<br><br><br>" +
                "<b>Event Managers</b><br><br>" +
                "Mr. Ashwin Simon<br>" +
                "Mobile: +91 9036269448<br>" +
                "Email: bengaluru@alpcord.com<br><br>" +
                "Mr. Avinash Sinha<br>" +
                "Mobile: +91 9319950044/9540379403<br>" +
                "Email: projects@alpcord.com<br>"));
        return root;
    }
}