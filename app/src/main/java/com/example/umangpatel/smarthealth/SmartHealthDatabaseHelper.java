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

            insertDisease(db, "ACL Injury", "Knee pain, swelling, tenderness, a loud popping sound at the time of injury, a feeling that your knee is not stable", "An ACL injury happens when you tear or overstretch the anterior collateral ligament on the inside of your knee. You can have a partial tear or a full tear. The ACL is most often injured during sports or other activities that cause you to make sudden stops and changes in direction. If you have an ACL injury, you may hear a loud popping sound or have severe pain or swelling in the knee. It also may feel like your knee is unstable. You may need surgery to reconstruct the ACL.", "You may find it difficult to walk or put weight on your knee after an ACL injury. The symptoms usually get worse for several hours after your injury. If you have a mild strain, the ACL may heal on its own with physical therapy. If you have a torn ACL, your doctor may recommend surgery to rebuild the ACL. It can't be sewn back together, so it is replaced with part of a tendon from another part of your leg.", "Being female; playing a sport that puts pressure on your knee or requires sudden changes of direction such as basketball, soccer, football, tennis, or skiing", "Treatment for ACL injury may include: " +
                    "\n" +
                    "                            \n" +
                    "   Anti-inflammatory medications" +"\n" +
                    "   Physical therapy" +"\n" +
                    "   Surgery" + "\n", "ACL injuries need treatment from a doctor. But you can help ease the symptoms of an ACL injury at home by: " +
                    "\n" +
                    "                            \n" +
                    "   Using crutches while your knee heals " + "\n" +
                    "   Putting ice packs wrapped in a thin towel on your knee for about 20 minutes every few hours" + "\n" +
                    "   Elevating your knee" + "\n" +
                    "   Taking over-the-counter pain relivers such as ibuprofen(Advil, Motrin)", "Putting weight on the knee, doing any type of activity");

            insertDisease(db, "Alzheimer's disease", "Symptoms of Alzheimer's disease include trouble with short-term memory, confusion, changes in behavior and mood, not recognizing friends and family, problems making decisions, serious memory loss, as well as trouble swallowing, talking and walking.", "Alzheimer's disease is a type of dementia that causes connections between neurons in the brain to break down and eventually die. This results in memory loss, as well as thinking and behavioral problems. Some signs of Alzheimer's disease may seem like memory changes that can be a normal part of aging, such as forgetting to turn off the stove. Early-onset Alzheimer's disease occurs in people younger than age limit 60 and can run in families. Late-onset Alzheimer's disease is more common form that affects people ages 60 and older. It can also run in families. Medications may help treat some effects of Alzheimer's disease, but there is no cure. People can llve for three to 20 years after an Alzheimer's diagnosis.", "Memory problems and mild personality changes, such as being less spontaneous, are early signs of Alzheimer's disease. In the mild stage of Alzheimer's disease, people repeat questions, get lost, and have trouble paying bills. In the moderate stage, people may be confused, not know familiar faces, and have trouble getting dressed. When Alzheimer's disease becomes severe, people are not able to communicate. They need someone to care for them in this final phase, which can last months or years. The body shutting down or an infection is often the cause of death. Other complications of Alzheimer's disease include falling, broken bones, bedsores from not being able to move, malnutrition, acting violently, and abuse from an overworked caregiver.", "Older age, family history of Alzheimer's disease, having certain genes, being female, a serious head injury, having fewer than eight years of education", "Treatments that may help with Alzheimer's disease include: " + "\n" + "\n" + "Medicines such as donepezil (Aricept), galantamine (Razadyne), memantine (Namenda), and rivastigmine (Exelon) for mild to severe problems with memory, thinking, speaking, and behavior. They may only work for months or a few years. " + "\n" + "Vitamin E to avoid wear and tear on brain cells and other tissues in the body. You should only take vitamin E under a doctor's orders because it could affect cholesterol or blood-clotting drugs. " + "\n" + "Antidepressants", "These self-care tips may help your health if you have Alzheimer's disease: " + "\n" + "\n" + "Eat a nutritious diet. " + "\n" + "Exercise on a regular basis. " + "\n" + "Join in social activities. " + "\n" + "Keep your mind busy by playing games, reading newspapers, and going to museums.", "Not getting treated");
            insertDisease(db, "Anemia", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Anthrax", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Ascaris worms", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Asthma", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Autism", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Bacterial pneumonia", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Bipolar disorder", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Bird flu", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Black eye", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Blood clotting disorder", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Brain injury", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Brain tumor", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "CREST syndrome", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Chagas disease", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Cholera", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Cold exposure", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Common cold", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Dengue fever", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Depression", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Diabetes", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Eating disorder", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Eczema", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Eye allergies", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Fainting", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Food poisioning", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Gallstones", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Gingivitis", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Hay fever", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Hepatitis A", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Hepatitis B", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Hepatitis C", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Influenza", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Insect bites", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Insomnia", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Intoxication", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Kidney stones", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Leg cramps", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Lyme disease", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Malaria", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Measles", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Parkinson disease", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Peyroine's disease", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Pneumonia", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Rabies", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Ringworm", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Scabies", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Thalassemia", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Typhoid fever", "b", "c", "d", "e", "f", "g", "h");
            insertDisease(db, "Whooping cough", "b", "c", "d", "e", "f", "g", "h");

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
