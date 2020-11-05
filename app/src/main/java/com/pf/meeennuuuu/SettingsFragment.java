package com.pf.meeennuuuu;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.preference.EditTextPreference;
import androidx.preference.PreferenceFragmentCompat;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class SettingsFragment extends PreferenceFragmentCompat {


    @Override
    public void onCreatePreferences(Bundle savedInstanceState,
                                    String rootKey) {

        setPreferencesFromResource(R.xml.preferences, rootKey);
    }

    public void onResume()
    {
        super.onResume();
        EditTextPreference preference = (EditTextPreference) findPreference("edit_text_preference_1");
        String hallo = preference.getText();
        Log.d("Pref",hallo);
        preference.setSummary(hallo);


    }



}
