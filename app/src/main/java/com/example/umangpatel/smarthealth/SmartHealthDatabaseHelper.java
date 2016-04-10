package com.example.umangpatel.smarthealth;

/**
 * Created by UmangPatel on 3/3/16.
 */

import android.content.ContentValues;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

class SmartHealthDatabaseHelper extends SQLiteOpenHelper{
    private static final String DB_NAME = "smarthealth"; //Name of the database
    private static final int DB_VERSION = 2; //Version of the database

    SmartHealthDatabaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        updateMyDatabase(db, 0, DB_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        updateMyDatabase(db, oldVersion, newVersion);
    }

    private void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion){
        if(oldVersion < 1){
            db.execSQL("CREATE TABLE DISEASE (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "NAME TEXT, "
                    + "SYMPTOMS TEXT, "
                    + "OVERVIEW TEXT, "
                    + "EXPECTATIONS TEXT, "
                    + "RISKFACTORS TEXT, "
                    + "TREATMENT TEXT, "
                    + "SELFCARE TEXT, "
                    + "MADEWORSEBY TEXT);");

            insertDisease(db, "ACL Injury", "Knee pain, swelling, tenderness, a loud popping sound at the time of injury, a feeling that your knee is not stable", "An ACL injury happens when you tear or overstretch the anterior collateral ligament on the inside of your knee. You can have a partial tear or a full tear. The ACL is most often injured during sports or other activities that cause you to make sudden stops and changes in direction. If you have an ACL injury, you may hear a loud popping sound or have severe pain or swelling in the knee. It also may feel like your knee is unstable. You may need surgery to reconstruct the ACL.", "You may find it difficult to walk or put weight on your knee after an ACL injury. The symptoms usually get worse for several hours after your injury. If you have a mild strain, the ACL may heal on its own with physical therapy. If you have a torn ACL, your doctor may recommend surgery to rebuild the ACL. It can't be sewn back together, so it is replaced with part of a tendon from another part of your leg.", "Being female; playing a sport that puts pressure on your knee or requires sudden changes of direction such as basketball, soccer, football, tennis, or skiing", "Treatment for ACL injury may include: \n" +
                    "\" +\n" +
                    "                            \"\\n\" +\n" +
                    "                            \"Anti-inflammatory medications \\n\" +\n" +
                    "                            \"Physical therapy \\n\" +\n" +
                    "                            \"Surgery\\n\"", "ACL injuries need treatment from a doctor. But you can help ease the symptoms of an ACL injury at home by: \n" +
                    "\" +\n" +
                    "                            \"\\n\"+\n" +
                    "                            \"Using crutches while your knee heals \\n\" +\n" +
                    "                            \"Putting ice packs wrapped in a thin towel on your knee for about 20 minutes every few hours \\n\" +\n" +
                    "                            \"Elevating your knee \\n\" +\n" +
                    "                            \"Taking over-the-counter pain relivers such as ibuprofen(Advil, Motrin)", "Putting weight on the knee, doing any type of activity");

            insertDisease(db, "a", "b", "c", "d", "e", "f", "g", "h");
        }

        if(oldVersion < 2){
            db.execSQL("ALTER TABLE DISEASE ADD COLUMN EXTRA TEXT;");
        }
    }

    private static void insertDisease(SQLiteDatabase db, String diseaseName, String diseaseSymptoms, String diseaseOverview, String diseaseExpectations, String diseaseRiskFactors, String diseaseTreatment, String diseaseSelfCare, String diseaseMAdeWorseBy){
        ContentValues diseaseValues = new ContentValues();
        diseaseValues.put("NAME", diseaseName);
        diseaseValues.put("SYMPTOMS", diseaseSymptoms);
        diseaseValues.put("OVERVIEW", diseaseOverview);
        diseaseValues.put("EXPECTATIONS", diseaseExpectations);
        diseaseValues.put("RISKFACTORS", diseaseRiskFactors);
        diseaseValues.put("TREATMENT", diseaseTreatment);
        diseaseValues.put("SELFCARE", diseaseSelfCare);
        diseaseValues.put("MADEWORSEBY", diseaseMAdeWorseBy);
        db.insert("DISEASE", null, diseaseValues);
    }
}
