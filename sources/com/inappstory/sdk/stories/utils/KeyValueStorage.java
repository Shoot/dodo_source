package com.inappstory.sdk.stories.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.network.JsonParser;
import java.util.HashMap;
/* loaded from: classes3.dex */
public class KeyValueStorage {
    private static final String SHARED_PREFERENCES_DEFAULT = "default_n";
    private static Context context;

    public static SharedPreferences getDefaultPreferences() {
        if (context == null) {
            if (InAppStoryService.isNull()) {
                return null;
            }
            context = InAppStoryService.getInstance().getContext();
        }
        Context context2 = context;
        if (context2 == null) {
            return null;
        }
        return context2.getSharedPreferences(SHARED_PREFERENCES_DEFAULT, 0);
    }

    public static <T> T getObject(String str, Class<T> cls) {
        String string;
        if (getDefaultPreferences() == null || (string = getDefaultPreferences().getString(str, null)) == null) {
            return null;
        }
        return (T) JsonParser.fromJson(string, cls);
    }

    public static String getString(String str) {
        if (getDefaultPreferences() == null) {
            return null;
        }
        return getDefaultPreferences().getString(str, null);
    }

    public static void removeString(String str) {
        if (getDefaultPreferences() == null) {
            return;
        }
        SharedPreferences.Editor edit = getDefaultPreferences().edit();
        edit.remove(str);
        edit.apply();
    }

    public static void saveMap(String str, HashMap hashMap) {
        SharedPreferences.Editor edit = getDefaultPreferences().edit();
        try {
            edit.putString(str, JsonParser.getJson(hashMap));
            edit.apply();
        } catch (Exception e) {
            InAppStoryService.createExceptionLog(e);
        }
    }

    public static void saveObject(String str, Object obj) {
        if (getDefaultPreferences() == null) {
            return;
        }
        try {
            SharedPreferences.Editor edit = getDefaultPreferences().edit();
            edit.putString(str, JsonParser.getJson(obj));
            edit.apply();
        } catch (Exception e) {
            InAppStoryService.createExceptionLog(e);
        }
    }

    public static void saveString(String str, String str2) {
        if (getDefaultPreferences() == null) {
            return;
        }
        SharedPreferences.Editor edit = getDefaultPreferences().edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static void setContext(Context context2) {
        context = context2;
    }

    public static String getString(String str, String str2) {
        if (getDefaultPreferences() == null) {
            return null;
        }
        return getDefaultPreferences().getString(str, str2);
    }
}
