package com.example.kriti.gmap;

import android.provider.BaseColumns;


public class DataContract {
    public static final class LoginDetails implements BaseColumns{
        public static final String TABLE_NAME = "loginDetail";
        public static final String USER_UUID = "UserUUID";
        public static final String USER_NAME = "UserName";
        public static final String LOGIN_USER_NAME = "LoginUserName";
        public static final String USER_LOCATION = "LocationID";
        public static final String FNAME = "FirstName";
        public static final String DOB = "dateOfBirth";
        public static final String LNAME = "LastName";
        public static final String PROVIDER_UUID = "ProviderUUID";
        public static final String AUTHENTICATION = "AuthInfo";
    }

    public static final class PersonInfo implements BaseColumns{
        public static final String TABLE_NAME = "personInfo";
        public static final String USER_UUID = "UserUUID";
        public static final String USER_NAME = "UserName";
    }
//    public static final class GroupMemberInfo implements BaseColumns{
//        public static final String TABLE_NAME = "groupMemberInfo";
//        public static final String MEMBER_UUID = "UserUUID";
//        public static final String MEMBER_NAME = "UserName";
//        public static final String GROUP_UUID = "GroupUUID";
//    }
//    public static final class IncarePatients implements BaseColumns{
//        public static final String TABLE_NAME = "incarePatients";
//        public static final String UUID = "UUID";
//        public static final String NAME = "Name";
//        public static final String FNAME = "FirstName";
//        public static final String LNAME = "LastName";
//        public static final String WEIGHT="weight";
//        public static final String HEIGHT="height";
//        public static final String FINAL = "final";
//        public static final String OLD_PATIENT_NUMBER = "old_patient_number";
//        public static final String RECENT = "recent";
//        public static final String STATUS = "status";
//        public static final String CONTACT = "contact";
//        public static final String EMAIL ="email";
//        public static final String AGE = "Age";
//        public static final String GENDER = "Gender";
//        public static final String ACCESS_PATH = "access_path";
//        public static final String DIASTOLIC_BP = "diastolic_bp";
//        public static final String SYSTOLIC_BP = "systolic_bp";
//        public static final String PULSE = "pulse";
//        public static final String TEMPERATURE ="temperatue";
//        public static final String RESPIRATORY_RATE = "respiratory_rate";
//        public static final String BLOOD_OXY_SAT = "blood_oxy_saturation";
//        public static final String HEALTH_CENTER = "healthCenter";
//        public static final String ENCOUNTER_DATE_TIME = "encounterDateTime";
//        public static final String TYPE = "TYPE";
//        public static final String REG = "REG";
//        public static final String IN_SEARCH = "IN_SEARCH";
//        public static final String CURRENT_VISIT="Current_visit";
//    }
//
//    public static final class NewsFeed implements BaseColumns{
//        public static final String TABLE_NAME = "newsFeed";
//        public static final String SENDER_NAME = "senderName";
//        public static final String DESC = "description";
//        public static final String DATE = "time";
//        public static final String TIME = "date";
//        public static final String RECEIVER_DISPLAY = "receiverDisplay";
//        public static final String TYPE = "type";
//        public static final String SENDER_UUID = "senderUUID";
//        public static final String IMAGE = "Image";
//        public static final String RECEIVER_UUID="receiverUuid";
//        public static final String SUBFEED_LIST = "subFEEDList";
//        public static final String ENC_UUID = "encounterUuid";
//        public static final String CURRENT_USER_FEED = "currentUserFeed";
//    }
//
//    public static final class DownloadedApps implements BaseColumns{
//        public static final String TABLE_NAME = "downloadedApps";
//        public static final String APP_UUID = "appUuid";
//        public static final String APP_ID = "appId";
//        public static final String DISPLAY = "display";
//        public static final String DATE_CREATED = "date_created";
//        public static final String DATE_CHANGED = "date_changed";
//        public static final String APP_TYPE = "type";
//        public static final String SECURITY_GROUP_ID = "securityGroupId";
//        public static final String CREATOR_NAME = "Creator";
//        public static final String DESCRIPTION="description";
//        public static final String VERSION = "version";
//        public static final String APP_ICON = "appIcon";
//    }
//
//    public static final class AllApps implements BaseColumns{
//        public static final String TABLE_NAME = "allApps";
//        public static final String APP_UUID = "appUuid";
//        public static final String APP_ID = "appId";
//        public static final String DISPLAY = "display";
//        public static final String DATE_CREATED = "date_created";
//        public static final String DATE_CHANGED = "date_changed";
//        public static final String APP_TYPE = "type";
//        public static final String SECURITY_GROUP_ID = "securityGroupId";
//        public static final String CREATOR_NAME = "Creator";
//        public static final String DESCRIPTION="description";
//        public static final String VERSION = "version";
//        public static final String APP_ICON = "appIcon";
//    }
//
//    public static final class Messages implements BaseColumns{
//        public static final String TABLE_NAME = "userMessages";
//        public static final String NAME = "groupName";
//        public static final String TYPE = "type";
//        public static final String ADMIN = "admin";
//        public static final String GROUP_UUID = "groupUuid";
//        public static final String PATIENT_CREATED = "patientCreated";
//        public static final String DATE = "dateCreated";
//        public static final String LAST_MESSAGE="last_message";
//        public static final String LAST_MESSAGE_TYPE="last_message_type";
//        public static final String GROUP_ID = "groupId";
//        public static final String LOCATION_NAME = "locationName";
//        public static final String ADDRESS = "address";
//        public static final String LOCATION_ID = "locationId";
//    }
//
//
//    public static final class ChatMessages implements BaseColumns{
//        public static final String TABLE_NAME = "chatMessages";
//        public static final String MSG_ID = "message_id";
//        public static final String MESSAGE = "message";
//        public static final String PERSON_UUID = "person_uuid";
//        public static final String ACTION = "action";
//        public static final String TYPE = "message_type";
//        public static final String GRP_ID = "group_recipient_uuid";
//        public static final String SEEN="seen";
//        public static final String SENDER_NAME="sender_name";
//        public static final String SYNCED="synced";
//        public static final String DATE="date";
//        public static final String UUID="uuid";
//    }
//    public static final class Connections implements BaseColumns{
//        public static final String TABLE_NAME = "userConnections";
//        public static final String UUID="uuid";
//        public static final String TYPE_NAME = "typeNmae";
//        public static final String USER_UUID = "userUUID";
//        public static final String FROM_UUID = "fromUUID";
//        public static final String COMBINATION_FROM_TO_UUID = "combinationFromToUuid";
//        public static final String FROM_DISPLAY = "from_Display";
//        public static final String DISPLAY = "display";
//        public static final String RECOMMEND = "recommend";
//        public static final String MUTUAL_REC = "mutualRec";
//        public static final String DESIGNATION = "designation";
//        public static final String LOCATION = "location";
//        public static final String CONTACT = "contact";
//        public static final String TIMINGS = "timings";
//        public static final String EMAIL = "email";
//        public static final String DAYSAVAILABLE = "daya_available";
//        public static final String STATUS = "status";
//        public static final String SPECIALITY ="speciality";
//        public static final String DEGREE="degree";
//    }
//    public static final class SecurityGroup implements BaseColumns{
//        public static final String TABLE_NAME = "securityGroup";
//        public static final String GROUP_ID = "groupId";
//        public static final String GROUP_NAME = "groupName";
//        public static final String LOCATION_ID = "locationId";
//        public static final String GROUP_UUID = "groupUuid";
//        public static final String LOCATION_UUID = "locationUuid";
//        public static final String DESCRIPTION = "description";
//        public static final String DEFAULT_LOCATION = "defaultLocation";
//        public static final String LOCATION_NAME = "locationName";
//        public static final String ADDRESS = "address";
//        public static final String PROVIDERS = "providers";
//    }
//    public static final class SecurityGroupMember implements BaseColumns{
//        public static final String TABLE_NAME = "securityGroupMember";
//        public static final String GROUP_ID = "groupId";
//        public static final String MEMBER_NAME = "name";
//        public static final String UUID = "uuid";
//        public static final String MEMBER_TYPE = "memberType";
//        public static final String PERSONUUID = "personUuid";
//
//    }
//    public static final class Encounter implements BaseColumns{
//        public static final String TABLE_NAME = "Encounter";
//        public static final String ENCOUNTER_UUID = "encounterUuid";
//        public static final String PERSONUUID="personUuid";
//        public static final String DOC_UUID = "docUuid";
//        public static final String DOC_NAME = "docName";
//        public static final String PATIENT_UUID = "pateintUuid";
//        public static final String DATE = "date";
//        public static final String DISPLAY_DATE = "display_date";
//        public static final String RESPONSE ="response";
//        public static final String FILTER_PARAMETERS = "filter";
//    }
//    public static final class ProviderAttributes implements BaseColumns{
//        public static final String TABLE_NAME = "ProviderAttributes";
//        public static final String USER_UUID = "userUUID";
//        public static final String RECOMMEND = "recommend";
//        public static final String PROVIDER_ATTRIBUTES = "provider_attributes";
//    }
//    public static final class RecomendationMembers implements BaseColumns{
//        public static final String TABLE_NAME = "RecomendationMembers";
//        public static final String UUID = "UUID";
//        public static final String RECOMMEND_MEMBERS = "recommend_members";
//        public static final String RECOMMEND_UUID = "recommend_uuid";
//    }
//
//
//    public static final class Suggestions implements BaseColumns{
//        public static final String TABLE_NAME = "suggestions";
//        public static final String UUID = "uuid";
//        public static final String DISPLAY = "display";
//        public static final String NAME = "name";
//        public static final String PERSON_UUID = "personUuid";
//    }
//    public static final class Comments implements BaseColumns{
//        public static final String TABLE_NAME = "comments";
//        public static final String UUID = "uuid";
//        public static final String TO_UUID = "toUUID";
//        public static final String FROM_UUID = "from_UUID";
//        public static final String DISPLAYFLAG = "display_flag";
//        public static final String NAME = "name";
//        public static final String TIMESTAMP ="timeStamp";
//        public static final String DISPLAY = "display";
//        public static final String STATUS= "status";
//    }
//
//
//    public static final class BlobDetails implements BaseColumns{
//        public static final String TABLE_NAME = "blob_details";
//        public static final String ENC_UUID = "encounter_uuid";
//        public static final String BLOB_UUID = "blob_uuid";
//        public static final String BLOB_FILENAME = "blob_filename";
//        public static final String BLOB_TYPE = "blob_type";
//        public static final String TITLE = "name";
//        public static final String DESCRIPTION ="timeStamp";
//    }
//
//    public static final class Language implements BaseColumns{
//        public static final String TABLE_NAME = "language";
//        public static final String LANGUAGE = "user_language";
//    }
//    public static final class SignupLanguage implements BaseColumns{
//        public static final String TABLE_NAME = "signuplanguage";
//        public static final String SIGNUP_LANGUAGE = "signup_language";
//    }
}
