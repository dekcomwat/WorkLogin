package com.example.worklogin;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

public class UserManager {

    /**
     * KEY_PREFS �������Ѻ�� key �ͧ SharedPreferences
     */
    private final String KEY_PREFS = "prefs_user";

    /**
     * ���� key ������૿ username � SharedPreferences
     */
    private final String KEY_USERNAME = "username";

    /**
     * ���� key ������૿ password � SharedPreferences.
     */
    private final String KEY_PASSWORD = "password";


    private SharedPreferences mPrefs;
    private SharedPreferences.Editor mEditor;

    /**
     * �Ѻ��� Context ����������������Ѻ getSharedPreferences
     *
     * @param context
     */
    public UserManager(Context context) {
        mPrefs = context.getSharedPreferences(KEY_PREFS, Context.MODE_PRIVATE);
        mEditor = mPrefs.edit();
    }

    /**
     * �ӡ���� Username �Ѻ Password � SharedPreferences<br />
     * �����͹� EditText �ͧ Username ��� password ��ͧ����繤����ҧ <br />
     * ��Ф�ҷ���� ��ͧ�ç�Ѻ� SharedPreferences
     *
     * @param username - username �ҡ EditText ������
     * @param password - password �ҡ EditText ������
     * @return �ҡ�������� ����觤�ҡ�Ѻ�� true, ������Դ���� false
     */
    public boolean checkLoginValidate(String username, String password) {
        String realUsername = mPrefs.getString(KEY_USERNAME, "");
        String realPassword = mPrefs.getString(KEY_PASSWORD, "");

        if ((!TextUtils.isEmpty(username) && !TextUtils.isEmpty(password)) &&
                username.equals(realUsername) &&
                password.equals(realPassword)) {
            return true;
        }
        return false;
    }

    /**
     * ���ʹ����Ѻŧ����¹��Ҫԡ���� ���觤�� username ��� password ��<br />
     * �ҡ��鹨�૿ŧ SharedPreferences
     *
     * @param username - username �ҡ EditText ������
     * @param password - password �ҡ EditText ������
     * @return �觤�ҡ�Ѻ��� false �ҡŧ����¹�������� <br />
     * �� true �ҡŧ����¹�����
     */
    public boolean registerUser(String username, String password) {

        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
            return false;
        }

        mEditor.putString(KEY_USERNAME, username);
        mEditor.putString(KEY_PASSWORD, password);
        return mEditor.commit();
    }
}