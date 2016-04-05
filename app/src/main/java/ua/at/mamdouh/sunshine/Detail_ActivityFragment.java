package ua.at.mamdouh.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class Detail_ActivityFragment extends Fragment {

    public Detail_ActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_detail_, container, false);


        Intent intent = getActivity().getIntent();

        String foreStr = intent.getStringExtra(Intent.EXTRA_TEXT);

        ((TextView)rootView.findViewById(R.id.detail_text)).setText(foreStr);



       // return inflater.inflate(R.layout.fragment_detail_, container, false);

        return rootView;
    }
}
