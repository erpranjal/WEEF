package com.example.weef.ui.dashboard;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.weef.R;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.programme, container, false);
        root.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.lefttoright));
        TextView tv=root.findViewById(R.id.editText);
        tv.setText(Html.fromHtml("World Engineering Education Forum (WEEF), held in Singapore in October 2010, was the brainchild of leaders in the global engineering education community who sought to bring together the world's engineering education societies to the same place at one time, allowing for logistical and programmatic synergies. Since 2010, the WEEF has been held in Buenos Aires, Argentina (2012), Cartagena de Indias, Colombia (2013), Dubai, United Arab Emirates (2014), Florence, Italy (2015), Seoul, Korea (2016), Kuala Lumpur, Malaysia (2017) and Albuquerque, New Mexico, USA (2018).<br><br>WEEF has been an important event in furthering IFEES' mission to bring together the global community to build excellence in engineering education. Not only do international organizations benefit greatly from the Forum, but local engineering education institutions are heavily involved in the vision and execution of this event. The venue of WEEF changes each year, and the event has brought great visibility to local institutions which otherwise may not have had such opportunities to interact and cooperate with foreign and international engineering education organizations.<br><br>WEEF has served as an opportunity for IFEES members to gather in one place, discuss leading issues in engineering education, and to share and learn best practices."));

        return root;
    }
}