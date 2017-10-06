package com.example.kriti.gmap;

import android.app.ProgressDialog;
import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.mklimek.circleinitialsview.CircleInitialsView;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CustomAdapterSubscribedUsers extends CursorAdapter {
    String TAG="CustomAdapterPatient";
    DatabaseHelper mDataHelper;
    SimpleDateFormat dateFormat ;
    String securityName="";
    View v;
    String displayDate="";
    ImageButton messageSend;
    ProgressDialog dialog;
    Context mcontext;
    Calendar calendar;
    private static int AUDIO_CAPTURE = 5;

    public CustomAdapterSubscribedUsers(Context context, Cursor c) {
        super(context, c,false);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        mcontext = context;
        LayoutInflater inflater = LayoutInflater.from(context);
        return inflater.inflate(R.layout.subsribed_user, viewGroup, false);
    }

    @Override
    public void bindView(View view, final Context context, final Cursor c) {
        String personName = c.getString(c.getColumnIndexOrThrow(DataContract.PersonInfo.USER_NAME));
        String personRelation = c.getString(c.getColumnIndexOrThrow(DataContract.PersonInfo.USER_UUID));
        final TextView listTitle = (TextView) view.findViewById(R.id.title);
        final TextView listSubTitle = (TextView) view.findViewById(R.id.subTitle);
        final CircleInitialsView alternateProfileImage = (CircleInitialsView) view.findViewById(R.id.list_image);
        try {
            listTitle.setText(personName);
            listSubTitle.setText(personRelation);
            alternateProfileImage.setVisibility(View.VISIBLE);
            alternateProfileImage.setTextSize(20);
            String nameToShow = personName.toUpperCase();
            alternateProfileImage.setText(nameToShow);
        }catch(IndexOutOfBoundsException e){

        }catch(Exception e){
        }
    }
}
