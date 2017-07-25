package com.example.husnimubarack.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mchashir on 06-Jul-17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorID;

    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> Words, int ColorID) {
        super(context, 0, Words);
        this.mColorID = ColorID;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Word currentWord = getItem(position);
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView miwokTranslation = (TextView) listItemView.findViewById(R.id.miwokTranslation);
        miwokTranslation.setText(currentWord.getmMiwokTranslation());

        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.defaultTranslation);
        defaultTranslation.setText(currentWord.getmDefaultTranslation());

        listItemView.findViewById(R.id.innerLinearLayout).setBackgroundResource(mColorID);

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.isHaveImage()) {
            image.setImageResource(currentWord.getmImageID());
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.GONE);
        }



        return listItemView;
    }


}
