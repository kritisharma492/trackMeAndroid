package com.example.kriti.gmap;

import android.content.ContentValues;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SubscribedUsers extends AppCompatActivity {

    private DatabaseHelper mDataHelper;
    SQLiteDatabase db ;
    private String[] mPlanetTitles;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscribed_users);
        setTitle("Subsribed Users");
        mPlanetTitles = new String[4];
        mPlanetTitles[0] = "Harsh Sharma";
        mPlanetTitles[1] = "Alerts";
        mPlanetTitles[2] = "Sign out";
        mPlanetTitles[3] = "Help";
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        // Set the adapter for the list view
        mDrawerList.setAdapter(new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item, mPlanetTitles));
        // Set the list's click listener
        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                selectItem(i);
            }
        });

        mDrawerToggle = new ActionBarDrawerToggle(
                this,                  /* host Activity */
                mDrawerLayout,         /* DrawerLayout object */
                R.string.drawer_open,  /* "open drawer" description */
                R.string.drawer_close  /* "close drawer" description */
        ) {

            /** Called when a drawer has settled in a completely closed state. */
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                getSupportActionBar().setTitle("TrackMe");
            }

            /** Called when a drawer has settled in a completely open state. */
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getSupportActionBar().setTitle("TrackMe");
            }
        };

        // Set the drawer toggle as the DrawerListener
        mDrawerLayout.setDrawerListener(mDrawerToggle);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        mDataHelper = DatabaseHelper.getInstance(getBaseContext());
        db = mDataHelper.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(DataContract.PersonInfo.USER_NAME, "Harsh Sharma");
        cv.put(DataContract.PersonInfo.USER_UUID, "Brother");
        int flag = (int) db.insertWithOnConflict(DataContract.PersonInfo.TABLE_NAME, null, cv, SQLiteDatabase.CONFLICT_REPLACE);
        cv = new ContentValues();
        cv.put(DataContract.PersonInfo.USER_NAME, "Ansh Goel");
        cv.put(DataContract.PersonInfo.USER_UUID, "Son");
        flag = (int) db.insertWithOnConflict(DataContract.PersonInfo.TABLE_NAME, null, cv, SQLiteDatabase.CONFLICT_REPLACE);
        cv = new ContentValues();
        cv.put(DataContract.PersonInfo.USER_NAME, "Priya Verma");
        cv.put(DataContract.PersonInfo.USER_UUID, "Daughter");
        flag = (int) db.insertWithOnConflict(DataContract.PersonInfo.TABLE_NAME, null, cv, SQLiteDatabase.CONFLICT_REPLACE);
        cv = new ContentValues();
        cv.put(DataContract.PersonInfo.USER_NAME, "Alka Verma");
        cv.put(DataContract.PersonInfo.USER_UUID, "Sister");
        flag = (int) db.insertWithOnConflict(DataContract.PersonInfo.TABLE_NAME, null, cv, SQLiteDatabase.CONFLICT_REPLACE);
        cv = new ContentValues();
        cv.put(DataContract.PersonInfo.USER_NAME, "Shashank Dhawan");
        cv.put(DataContract.PersonInfo.USER_UUID, "Cousin");
        flag = (int) db.insertWithOnConflict(DataContract.PersonInfo.TABLE_NAME, null, cv, SQLiteDatabase.CONFLICT_REPLACE);
        ListView subscribedUserList = (ListView) findViewById(R.id.listview_subscribed_users);
        Cursor helperCursor = mDataHelper.getReadableDatabase().query(
                DataContract.PersonInfo.TABLE_NAME,  // Table to Query
                null, // all columns
                null,//no where clause
                null, // Values for the "where" clause
                null, // columns to group by
                null, // columns to filter by row groups
                null // sort order
        );
        CustomAdapterSubscribedUsers customCursorAdapter = new CustomAdapterSubscribedUsers(getBaseContext(), helperCursor);
        subscribedUserList.setAdapter(customCursorAdapter);
        customCursorAdapter.notifyDataSetChanged();

        subscribedUserList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, final long id) {
//                try{
//                    Answers.getInstance().logCustom(new CustomEvent("Patient viewed"));
//                }catch(Exception e){
//                }
//                Cursor cursor = mDataHelper.getReadableDatabase().query(
//                        DataContract.IncarePatients.TABLE_NAME,  // Table to Query`
//                        null, // all columns
//                        "_id" + "=" + id, // Columns for the "where" clause
//                        null, // Values for the "where" clause
//                        null, // columns to group by
//                        null, // columns to filter by row groups
//                        null // sort order
//                );
//                if (cursor.moveToFirst()) {
//                    String uuid = cursor.getString(cursor.getColumnIndexOrThrow(DataContract.IncarePatients.UUID));
//                    String name = cursor.getString(cursor.getColumnIndexOrThrow(DataContract.IncarePatients.NAME));
//                    String locationUuid = cursor.getString(cursor.getColumnIndexOrThrow(DataContract.IncarePatients.HEALTH_CENTER));
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
//                    intent.putExtra("UUID", uuid);
//                    intent.putExtra("NAME", name);
//                    intent.putExtra("locationUuid", locationUuid);
                startActivity(intent);
//                }
//                cursor.close();
//            }
            }
        });
    }

    /** Swaps fragments in the main content view */
    private void selectItem(int position) {
        // Create a new fragment and specify the planet to show based on position
        // Highlight the selected item, update the title, and close the drawer
        mDrawerList.setItemChecked(position, true);
        setTitle(mPlanetTitles[position]);
        mDrawerLayout.closeDrawer(mDrawerList);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Pass the event to ActionBarDrawerToggle, if it returns
        // true, then it has handled the app icon touch event
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        // Handle your other action bar items...

        return super.onOptionsItemSelected(item);
    }
}
