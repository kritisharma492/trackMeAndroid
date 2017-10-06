package com.example.kriti.gmap;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    static final String dbName = "tracktorDB";
    private static DatabaseHelper mInstance = null;

    public DatabaseHelper(Context context) {
        super(context, dbName, null, 94);
    }

    public static synchronized DatabaseHelper getInstance(Context ctx) {
        // Use the application context, which will ensure that you
        // don't accidentally leak an Activity's context.
        // See this article for more information: http://bit.ly/6LRzfx
        if (mInstance == null) {
            mInstance = new DatabaseHelper(ctx);
        }
        return mInstance;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        final String SQL_CREATE_LOGIN_TABLE = "CREATE TABLE " + DataContract.LoginDetails.TABLE_NAME + " (" +
                DataContract.LoginDetails.USER_UUID + " TEXT UNIQUE NOT NULL, " +
                DataContract.LoginDetails.PROVIDER_UUID + " TEXT NOT NULL, " +
                DataContract.LoginDetails.USER_NAME + " TEXT NOT NULL, " +
                DataContract.LoginDetails.LOGIN_USER_NAME + " TEXT NOT NULL, " +
                DataContract.LoginDetails.FNAME + " TEXT, " +
                DataContract.LoginDetails.DOB + " TEXT, " +
                DataContract.LoginDetails.LNAME + " TEXT, " +
                DataContract.LoginDetails.USER_LOCATION + " TEXT NOT NULL, " +
                DataContract.LoginDetails.AUTHENTICATION + " TEXT NOT NULL " +
                " );";
        final String SQL_CREATE_PERSON_INFO_TABLE = "CREATE TABLE " + DataContract.PersonInfo.TABLE_NAME + " (" +
                "_id" + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                DataContract.PersonInfo.USER_UUID + " TEXT UNIQUE NOT NULL, " +
                DataContract.PersonInfo.USER_NAME + " TEXT NOT NULL " +
                " );";
//        final String SQL_CREATE_GROUP_MEMBER_INFO_TABLE = "CREATE TABLE " + DataContract.GroupMemberInfo.TABLE_NAME + " (" +
//                "_id" + " INTEGER PRIMARY KEY AUTOINCREMENT," +
//                DataContract.GroupMemberInfo.MEMBER_UUID + " TEXT NOT NULL, " +
//                DataContract.GroupMemberInfo.MEMBER_NAME + " TEXT NOT NULL, " +
//                DataContract.GroupMemberInfo.GROUP_UUID + " TEXT NOT NULL " +
//                " );";
//        final String SQL_CREATE_INCARE_PATIENT_TABLE = "CREATE TABLE " + DataContract.IncarePatients.TABLE_NAME + " (" +
//                "_id" + " INTEGER PRIMARY KEY AUTOINCREMENT," +
//                DataContract.IncarePatients.UUID + " TEXT UNIQUE NOT NULL, " +
//                DataContract.IncarePatients.NAME + " TEXT NOT NULL, " +
//                DataContract.IncarePatients.FNAME + " TEXT, " +
//                DataContract.IncarePatients.LNAME + " TEXT, " +
//                DataContract.IncarePatients.AGE + " TEXT NOT NULL, " +
//                DataContract.IncarePatients.WEIGHT + " TEXT, " +
//                DataContract.IncarePatients.HEIGHT + " TEXT, " +
//                DataContract.IncarePatients.FINAL + " TEXT, " +
//                DataContract.IncarePatients.OLD_PATIENT_NUMBER + " TEXT, " +
//                DataContract.IncarePatients.RECENT + " TEXT, " +
//                DataContract.IncarePatients.STATUS + " TEXT, " +
//                DataContract.IncarePatients.EMAIL + " TEXT, " +
//                DataContract.IncarePatients.CONTACT + " TEXT, " +
//                DataContract.IncarePatients.BLOOD_OXY_SAT + " TEXT, " +
//                DataContract.IncarePatients.DIASTOLIC_BP + " TEXT, " +
//                DataContract.IncarePatients.SYSTOLIC_BP + " TEXT, " +
//                DataContract.IncarePatients.PULSE + " TEXT, " +
//                DataContract.IncarePatients.RESPIRATORY_RATE + " TEXT, " +
//                DataContract.IncarePatients.TEMPERATURE + " TEXT, " +
//                DataContract.IncarePatients.ACCESS_PATH + " TEXT, " +
//                DataContract.IncarePatients.HEALTH_CENTER + " TEXT NOT NULL, " +
//                DataContract.IncarePatients.ENCOUNTER_DATE_TIME + " TEXT, " +
//                DataContract.IncarePatients.TYPE + " INTEGER NOT NULL, " +
//                DataContract.IncarePatients.GENDER + " TEXT NOT NULL, " +
//                DataContract.IncarePatients.REG + " TEXT, " +
//                DataContract.IncarePatients.IN_SEARCH + " TEXT, " +
//                DataContract.IncarePatients.CURRENT_VISIT + " INTEGER " +
//                " );";
//        final String SQL_CREATE_ALL_APPS_TABLE = "CREATE TABLE " + DataContract.AllApps.TABLE_NAME + " (" +
//                "_id" + " INTEGER PRIMARY KEY AUTOINCREMENT," +
//                DataContract.AllApps.APP_UUID + " TEXT UNIQUE NOT NULL, " +
//                DataContract.AllApps.APP_ID + " TEXT, " +
//                DataContract.AllApps.DISPLAY + " TEXT, " +
//                DataContract.AllApps.DATE_CREATED + " TEXT, " +
//                DataContract.AllApps.DATE_CHANGED + " TEXT, " +
//                DataContract.AllApps.APP_TYPE + " TEXT NOT NULL, " +
//                DataContract.AllApps.SECURITY_GROUP_ID + " TEXT, " +
//                DataContract.AllApps.CREATOR_NAME+ " TEXT, " +
//                DataContract.AllApps.DESCRIPTION + " TEXT, " +
//                DataContract.AllApps.VERSION + " TEXT, " +
//                DataContract.AllApps.APP_ICON + " TEXT " +
//                " );";
//
//
//        final String SQL_CREATE_DOWNLOADED_APPS_TABLE = "CREATE TABLE " + DataContract.DownloadedApps.TABLE_NAME + " (" +
//                "_id" + " INTEGER PRIMARY KEY AUTOINCREMENT," +
//                DataContract.DownloadedApps.APP_UUID + " TEXT UNIQUE NOT NULL, " +
//                DataContract.DownloadedApps.APP_ID + " TEXT, " +
//                DataContract.DownloadedApps.DISPLAY + " TEXT, " +
//                DataContract.DownloadedApps.DATE_CREATED + " TEXT, " +
//                DataContract.DownloadedApps.DATE_CHANGED + " TEXT, " +
//                DataContract.DownloadedApps.APP_TYPE + " TEXT NOT NULL, " +
//                DataContract.DownloadedApps.SECURITY_GROUP_ID + " TEXT, " +
//                DataContract.DownloadedApps.CREATOR_NAME+ " TEXT, " +
//                DataContract.DownloadedApps.DESCRIPTION + " TEXT, " +
//                DataContract.DownloadedApps.VERSION + " TEXT, " +
//                DataContract.DownloadedApps.APP_ICON + " TEXT " +
//                " );";
//        final String SQL_CREATE_NEWSFEED_TABLE = "CREATE TABLE " + DataContract.NewsFeed.TABLE_NAME + " (" +
//                "_id" + " INTEGER PRIMARY KEY AUTOINCREMENT," +
//                DataContract.NewsFeed.SENDER_NAME + " TEXT NOT NULL, " +
//                DataContract.NewsFeed.DESC + " TEXT, " +
//                DataContract.NewsFeed.DATE +" INTEGER, " +
//                DataContract.NewsFeed.TYPE + " TEXT NOT NULL, " +
//                DataContract.NewsFeed.RECEIVER_DISPLAY +" TEXT, " +
//                DataContract.NewsFeed.SENDER_UUID + " TEXT, " +
//                DataContract.NewsFeed.RECEIVER_UUID + " TEXT, " +
//                DataContract.NewsFeed.IMAGE + " TEXT, " +
//                DataContract.NewsFeed.ENC_UUID + " TEXT UNIQUE, " +
//                DataContract.NewsFeed.SUBFEED_LIST + " TEXT, " +
//                DataContract.NewsFeed.TIME + " TEXT NOT NULL, " +
//                DataContract.NewsFeed.CURRENT_USER_FEED + " TEXT NOT NULL " +
//                " );";
//        final String SQL_CREATE_MESSAGES_TABLE = "CREATE TABLE " + DataContract.Messages.TABLE_NAME + " (" +
//                "_id" + " INTEGER PRIMARY KEY AUTOINCREMENT," +
//                DataContract.Messages.GROUP_UUID + " TEXT UNIQUE NOT NULL, " +
//                DataContract.Messages.ADMIN + " TEXT, " +
//                DataContract.Messages.TYPE + " TEXT NOT NULL, " +
//                DataContract.Messages.DATE +" INTEGER, " +
//                DataContract.Messages.NAME + " TEXT, " +
//                DataContract.Messages.GROUP_ID + " TEXT, " +
//                DataContract.Messages.LOCATION_NAME + " TEXT, " +
//                DataContract.Messages.ADDRESS + " TEXT, " +
//                DataContract.Messages.LOCATION_ID + " TEXT, " +
//                DataContract.Messages.PATIENT_CREATED + " INTEGER, " +
//                DataContract.Messages.LAST_MESSAGE + " TEXT, " +
//                DataContract.Messages.LAST_MESSAGE_TYPE + " TEXT " +
//                " );";
//        final String SQL_CREATE_CHATMESSAGES_TABLE = "CREATE TABLE " + DataContract.ChatMessages.TABLE_NAME + " (" +
//                "_id" + " INTEGER PRIMARY KEY AUTOINCREMENT," +
//                DataContract.ChatMessages.UUID + " TEXT UNIQUE NOT NULL, " +
//                DataContract.ChatMessages.MESSAGE + " TEXT, " +
//                DataContract.ChatMessages.TYPE + " TEXT NOT NULL, " +
//                DataContract.ChatMessages.DATE +" INTEGER, " +
//                DataContract.ChatMessages.MSG_ID + " TEXT, " +
//                DataContract.ChatMessages.SENDER_NAME + " TEXT, " +
//                DataContract.ChatMessages.PERSON_UUID + " TEXT NOT NULL, " +
//                DataContract.ChatMessages.SEEN +" TEXT, " +
//                DataContract.ChatMessages.SYNCED + " TEXT, " +
//                DataContract.ChatMessages.GRP_ID + " TEXT NOT NULL, " +
//                DataContract.ChatMessages.ACTION + " TEXT " +
//                " );";
//        final String SQL_CREATE_CONNECTIONS_TABLE = "CREATE TABLE " + DataContract.Connections.TABLE_NAME + " (" +
//                "_id" + " INTEGER PRIMARY KEY AUTOINCREMENT," +
//                DataContract.Connections.UUID + " TEXT NOT NULL, " +
//                DataContract.Connections.DISPLAY + " TEXT, " +
//                DataContract.Connections.USER_UUID + " TEXT, " +
//                DataContract.Connections.COMBINATION_FROM_TO_UUID + " TEXT UNIQUE, " +
//                DataContract.Connections.FROM_UUID + " TEXT, " +
//                DataContract.Connections.FROM_DISPLAY + " TEXT, " +
//                DataContract.Connections.RECOMMEND + " TEXT ," +
//                DataContract.Connections.MUTUAL_REC + " TEXT ," +
//                DataContract.Connections.DESIGNATION + " TEXT ," +
//                DataContract.Connections.LOCATION + " TEXT ," +
//                DataContract.Connections.CONTACT + " TEXT ," +
//                DataContract.Connections.TIMINGS + " TEXT ," +
//                DataContract.Connections.EMAIL + " TEXT ," +
//                DataContract.Connections.STATUS + " TEXT ," +
//                DataContract.Connections.SPECIALITY + " TEXT ," +
//                DataContract.Connections.DEGREE + " TEXT ," +
//                DataContract.Connections.DAYSAVAILABLE + " TEXT ," +
//                DataContract.Connections.TYPE_NAME +" TEXT " +
//                " );";
//        final String SQL_CREATE_SECURITY_GROUP_TABLE = "CREATE TABLE " + DataContract.SecurityGroup.TABLE_NAME + " (" +
//                "_id" + " INTEGER PRIMARY KEY AUTOINCREMENT," +
//                DataContract.SecurityGroup.GROUP_ID + " TEXT UNIQUE NOT NULL, " +
//                DataContract.SecurityGroup.GROUP_NAME + " TEXT, " +
//                DataContract.SecurityGroup.ADDRESS + " TEXT, " +
//                DataContract.SecurityGroup.LOCATION_NAME + " TEXT, " +
//                DataContract.SecurityGroup.DEFAULT_LOCATION + " TEXT, " +
//                DataContract.SecurityGroup.LOCATION_UUID + " TEXT, " +
//                DataContract.SecurityGroup.DESCRIPTION + " TEXT, " +
//                DataContract.SecurityGroup.GROUP_UUID + " TEXT NOT NULL, " +
//                DataContract.SecurityGroup.LOCATION_ID +" TEXT " +
//                " );";
//
//        final String SQL_CREATE_ENCOUNTE_TABLE = "CREATE TABLE " + DataContract.Encounter.TABLE_NAME + " (" +
//                "_id" + " INTEGER PRIMARY KEY AUTOINCREMENT," +
//                DataContract.Encounter.ENCOUNTER_UUID + " TEXT UNIQUE NOT NULL, " +
//                DataContract.Encounter.DOC_UUID + " TEXT, " +
//                DataContract.Encounter.PERSONUUID + " TEXT, " +
//                DataContract.Encounter.PATIENT_UUID + " TEXT, " +
//                DataContract.Encounter.DATE + " INTEGER, " +
//                DataContract.Encounter.DISPLAY_DATE + " TEXT, " +
//                DataContract.Encounter.RESPONSE + " TEXT, " +
//                DataContract.Encounter.DOC_NAME + " TEXT, " +
//                DataContract.Encounter.FILTER_PARAMETERS + " TEXT " +
//                " );";
//
//        final String SQL_CREATE_PROVIDER_ATTRIBUTES = "CREATE TABLE " + DataContract.ProviderAttributes.TABLE_NAME + " (" +
//                "_id" + " INTEGER PRIMARY KEY AUTOINCREMENT," +
//                DataContract.ProviderAttributes.USER_UUID + " TEXT, " +
//                DataContract.ProviderAttributes.RECOMMEND + " TEXT ," +
//                DataContract.ProviderAttributes.PROVIDER_ATTRIBUTES + " TEXT " +
//                " );";
//
//        final String SQL_CREATE_SECURITY_GROUP_MEMBER_TABLE = "CREATE TABLE " + DataContract.SecurityGroupMember.TABLE_NAME + " (" +
//                "_id" + " INTEGER PRIMARY KEY AUTOINCREMENT," +
//                DataContract.SecurityGroupMember.GROUP_ID + " TEXT NOT NULL, " +
//                DataContract.SecurityGroupMember.PERSONUUID + " TEXT, " +
//                DataContract.SecurityGroupMember.UUID + " TEXT, " +
//                DataContract.SecurityGroupMember.MEMBER_TYPE + " TEXT, " +
//                DataContract.SecurityGroupMember.MEMBER_NAME + " TEXT " +
//                " );";
//
//        final String SQL_CREATE_RECOMENDATION_MEMBERS = "CREATE TABLE " + DataContract.RecomendationMembers.TABLE_NAME + " (" +
//                "_id" + " INTEGER PRIMARY KEY AUTOINCREMENT," +
//                DataContract.RecomendationMembers.UUID + " TEXT NOT NULL, " +
//                DataContract.RecomendationMembers.RECOMMEND_MEMBERS + " TEXT, " +
//                DataContract.RecomendationMembers.RECOMMEND_UUID + " TEXT " +
//                " );";
//
//        final String SQL_CREATE_SUGGESTION_TABLE = "CREATE TABLE " + DataContract.Suggestions.TABLE_NAME + " (" +
//                "_id" + " INTEGER PRIMARY KEY AUTOINCREMENT," +
//                DataContract.Suggestions.UUID + " TEXT UNIQUE NOT NULL, " +
//                DataContract.Suggestions.DISPLAY + " TEXT, " +
//                DataContract.Suggestions.NAME + " TEXT, " +
//                DataContract.Suggestions.PERSON_UUID + " TEXT UNIQUE " +
//                " );";
//        final String SQL_CREATE_COMMENTS_TABLE = "CREATE TABLE " + DataContract.Comments.TABLE_NAME + " (" +
//                "_id" + " INTEGER PRIMARY KEY AUTOINCREMENT," +
//                DataContract.Comments.UUID + " TEXT UNIQUE NOT NULL, " +
//                DataContract.Comments.DISPLAY + " TEXT, " +
//                DataContract.Comments.NAME + " TEXT, " +
//                DataContract.Comments.TIMESTAMP + " TEXT, " +
//                DataContract.Comments.DISPLAYFLAG + " TEXT, " +
//                DataContract.Comments.TO_UUID + " TEXT, " +
//                DataContract.Comments.FROM_UUID + " TEXT " +
//                " );";
//        final String SQL_CREATE_BLOB_DESCRIPTION_TABLE = "CREATE TABLE " + DataContract.BlobDetails.TABLE_NAME + " (" +
//                "_id" + " INTEGER PRIMARY KEY AUTOINCREMENT," +
//                DataContract.BlobDetails.ENC_UUID + " TEXT  NOT NULL, " +
//                DataContract.BlobDetails.BLOB_UUID + " TEXT NOT NULL, " +
//                DataContract.BlobDetails.BLOB_FILENAME + " TEXT NOT NULL, " +
//                DataContract.BlobDetails.BLOB_TYPE +" TEXT, " +
//                DataContract.BlobDetails.TITLE + " TEXT, " +
//                DataContract.BlobDetails.DESCRIPTION + " TEXT " +
//                " );";
//        final String SQL_CREATE_USER_LANGUAGE = "CREATE TABLE " + DataContract.Language.TABLE_NAME + " (" +
//                "_id" + " INTEGER PRIMARY KEY AUTOINCREMENT," +
//                DataContract.Language.LANGUAGE + " TEXT "+
//                " );";
//        final String SQL_CREATE_SIGNUP_LANGUAGE = "CREATE TABLE " + DataContract.SignupLanguage.TABLE_NAME + " (" +
//                "_id" + " INTEGER PRIMARY KEY AUTOINCREMENT," +
//                DataContract.SignupLanguage.SIGNUP_LANGUAGE + " TEXT " +
//                " );";


//        db.execSQL(SQL_CREATE_ENCOUNTE_TABLE);
//        db.execSQL(SQL_CREATE_COMMENTS_TABLE);
//        db.execSQL(SQL_CREATE_SUGGESTION_TABLE);
//        db.execSQL(SQL_CREATE_SECURITY_GROUP_TABLE);
//        db.execSQL(SQL_CREATE_SECURITY_GROUP_MEMBER_TABLE);
//        db.execSQL(SQL_CREATE_CONNECTIONS_TABLE);
//        db.execSQL(SQL_CREATE_MESSAGES_TABLE);
//        db.execSQL(SQL_CREATE_CHATMESSAGES_TABLE);
//        db.execSQL(SQL_CREATE_NEWSFEED_TABLE);
        db.execSQL(SQL_CREATE_LOGIN_TABLE);
//        db.execSQL(SQL_CREATE_INCARE_PATIENT_TABLE);
        db.execSQL(SQL_CREATE_PERSON_INFO_TABLE);
//        db.execSQL(SQL_CREATE_GROUP_MEMBER_INFO_TABLE);
//        db.execSQL(SQL_CREATE_ALL_APPS_TABLE);
//        db.execSQL(SQL_CREATE_DOWNLOADED_APPS_TABLE);
//        db.execSQL(SQL_CREATE_BLOB_DESCRIPTION_TABLE);
//        db.execSQL(SQL_CREATE_USER_LANGUAGE);
//        db.execSQL(SQL_CREATE_PROVIDER_ATTRIBUTES);
//        db.execSQL(SQL_CREATE_RECOMENDATION_MEMBERS);
//        db.execSQL(SQL_CREATE_SIGNUP_LANGUAGE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DataContract.LoginDetails.TABLE_NAME);
//        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DataContract.IncarePatients.TABLE_NAME);
//        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DataContract.NewsFeed.TABLE_NAME);
//        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DataContract.Messages.TABLE_NAME);
//        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DataContract.Connections.TABLE_NAME);
//        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DataContract.SecurityGroup.TABLE_NAME);
//        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DataContract.Suggestions.TABLE_NAME);
//        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DataContract.RecomendationMembers.TABLE_NAME);
//        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DataContract.Comments.TABLE_NAME);
//        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DataContract.SecurityGroupMember.TABLE_NAME);
//        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DataContract.Encounter.TABLE_NAME);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DataContract.PersonInfo.TABLE_NAME);
//        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DataContract.ChatMessages.TABLE_NAME);
//        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DataContract.GroupMemberInfo.TABLE_NAME);
//        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DataContract.ProviderAttributes.TABLE_NAME);
//        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DataContract.AllApps.TABLE_NAME);
//        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DataContract.DownloadedApps.TABLE_NAME);
//        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DataContract.BlobDetails.TABLE_NAME);
//        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DataContract.Language.TABLE_NAME);
//        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DataContract.SignupLanguage.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
    public boolean checkLogin(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor mcursor = db.query(
                DataContract.LoginDetails.TABLE_NAME,  // Table to Query
                null, // all columns
                null, // Columns for the "where" clause
                null, // Values for the "where" clause
                null, // columns to group by
                null, // columns to filter by row groups
                null // sort order
        );
        if(mcursor.moveToFirst()){return true;}
        else{return false;}
    }
    public Cursor getData(){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.query(
                DataContract.LoginDetails.TABLE_NAME,  // Table to Query
                null, // all columns
                null, // Columns for the "where" clause
                null, // Values for the "where" clause
                null, // columns to group by
                null, // columns to filter by row groups
                null // sort order
        );
        return res;
    }
    @Override
    protected void finalize() throws Throwable {
        this.close();
        super.finalize();
    }
}
