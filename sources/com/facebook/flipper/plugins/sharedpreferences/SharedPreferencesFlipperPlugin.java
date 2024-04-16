package com.facebook.flipper.plugins.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperPlugin;
import com.facebook.flipper.core.FlipperReceiver;
import com.facebook.flipper.core.FlipperResponder;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class SharedPreferencesFlipperPlugin implements FlipperPlugin {
    private static final String SHARED_PREFS_DIR = "shared_prefs";
    private static final String XML_SUFFIX = ".xml";
    private FlipperConnection mConnection;
    private final Map<SharedPreferences, SharedPreferencesDescriptor> mSharedPreferences;
    private final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener;

    /* loaded from: classes2.dex */
    public static class SharedPreferencesDescriptor {
        public final int mode;
        public final String name;

        public SharedPreferencesDescriptor(String str, int i) {
            if (str != null && str.length() != 0) {
                this.name = str;
                this.mode = i;
                return;
            }
            throw new IllegalArgumentException("Given null or empty name");
        }

        public SharedPreferences getSharedPreferences(Context context) {
            return context.getSharedPreferences(this.name, this.mode);
        }
    }

    public SharedPreferencesFlipperPlugin(Context context) {
        this(context, buildDescriptorForAllPrefsFiles(context));
    }

    private static List<SharedPreferencesDescriptor> buildDescriptorForAllPrefsFiles(Context context) {
        String[] list = new File(context.getApplicationInfo().dataDir, SHARED_PREFS_DIR).list(new FilenameFilter() { // from class: com.facebook.flipper.plugins.sharedpreferences.SharedPreferencesFlipperPlugin.2
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.endsWith(SharedPreferencesFlipperPlugin.XML_SUFFIX);
            }
        });
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (String str : list) {
                arrayList.add(new SharedPreferencesDescriptor(str.substring(0, str.indexOf(XML_SUFFIX)), 0));
            }
        }
        arrayList.add(new SharedPreferencesDescriptor(getDefaultSharedPreferencesName(context), 0));
        return arrayList;
    }

    private static String getDefaultSharedPreferencesName(Context context) {
        String defaultSharedPreferencesName;
        if (Build.VERSION.SDK_INT >= 24) {
            defaultSharedPreferencesName = PreferenceManager.getDefaultSharedPreferencesName(context);
            return defaultSharedPreferencesName;
        }
        return context.getPackageName() + "_preferences";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FlipperObject getFlipperObjectFor(String str) {
        return getFlipperObjectFor(getSharedPreferencesFor(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SharedPreferences getSharedPreferencesFor(String str) {
        for (Map.Entry<SharedPreferences, SharedPreferencesDescriptor> entry : this.mSharedPreferences.entrySet()) {
            if (entry.getValue().name.equals(str)) {
                return entry.getKey();
            }
        }
        throw new IllegalStateException("Unknown shared preferences " + str);
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public String getId() {
        return "Preferences";
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public void onConnect(FlipperConnection flipperConnection) {
        this.mConnection = flipperConnection;
        flipperConnection.receive("getAllSharedPreferences", new FlipperReceiver() { // from class: com.facebook.flipper.plugins.sharedpreferences.SharedPreferencesFlipperPlugin.3
            @Override // com.facebook.flipper.core.FlipperReceiver
            public void onReceive(FlipperObject flipperObject, FlipperResponder flipperResponder) {
                FlipperObject.Builder builder = new FlipperObject.Builder();
                for (Map.Entry entry : SharedPreferencesFlipperPlugin.this.mSharedPreferences.entrySet()) {
                    builder.put(((SharedPreferencesDescriptor) entry.getValue()).name, SharedPreferencesFlipperPlugin.this.getFlipperObjectFor((SharedPreferences) entry.getKey()));
                }
                flipperResponder.success(builder.build());
            }
        });
        flipperConnection.receive("getSharedPreferences", new FlipperReceiver() { // from class: com.facebook.flipper.plugins.sharedpreferences.SharedPreferencesFlipperPlugin.4
            @Override // com.facebook.flipper.core.FlipperReceiver
            public void onReceive(FlipperObject flipperObject, FlipperResponder flipperResponder) {
                String string = flipperObject.getString(Action.NAME_ATTRIBUTE);
                if (string != null) {
                    flipperResponder.success(SharedPreferencesFlipperPlugin.this.getFlipperObjectFor(string));
                }
            }
        });
        flipperConnection.receive("setSharedPreference", new FlipperReceiver() { // from class: com.facebook.flipper.plugins.sharedpreferences.SharedPreferencesFlipperPlugin.5
            @Override // com.facebook.flipper.core.FlipperReceiver
            public void onReceive(FlipperObject flipperObject, FlipperResponder flipperResponder) throws IllegalArgumentException {
                String string = flipperObject.getString("sharedPreferencesName");
                String string2 = flipperObject.getString("preferenceName");
                SharedPreferences sharedPreferencesFor = SharedPreferencesFlipperPlugin.this.getSharedPreferencesFor(string);
                Object obj = sharedPreferencesFor.getAll().get(string2);
                SharedPreferences.Editor edit = sharedPreferencesFor.edit();
                if (obj instanceof Boolean) {
                    edit.putBoolean(string2, flipperObject.getBoolean("preferenceValue"));
                } else if (obj instanceof Long) {
                    edit.putLong(string2, flipperObject.getLong("preferenceValue"));
                } else if (obj instanceof Integer) {
                    edit.putInt(string2, flipperObject.getInt("preferenceValue"));
                } else if (obj instanceof Float) {
                    edit.putFloat(string2, flipperObject.getFloat("preferenceValue"));
                } else if (obj instanceof String) {
                    edit.putString(string2, flipperObject.getString("preferenceValue"));
                } else {
                    throw new IllegalArgumentException("Type not supported: " + string2);
                }
                edit.apply();
                flipperResponder.success(SharedPreferencesFlipperPlugin.this.getFlipperObjectFor(string));
            }
        });
        flipperConnection.receive("deleteSharedPreference", new FlipperReceiver() { // from class: com.facebook.flipper.plugins.sharedpreferences.SharedPreferencesFlipperPlugin.6
            @Override // com.facebook.flipper.core.FlipperReceiver
            public void onReceive(FlipperObject flipperObject, FlipperResponder flipperResponder) throws IllegalArgumentException {
                String string = flipperObject.getString("sharedPreferencesName");
                String string2 = flipperObject.getString("preferenceName");
                SharedPreferences.Editor edit = SharedPreferencesFlipperPlugin.this.getSharedPreferencesFor(string).edit();
                edit.remove(string2);
                edit.apply();
                flipperResponder.success(SharedPreferencesFlipperPlugin.this.getFlipperObjectFor(string));
            }
        });
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public void onDisconnect() {
        this.mConnection = null;
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public boolean runInBackground() {
        return false;
    }

    public SharedPreferencesFlipperPlugin(Context context, String str) {
        this(context, str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FlipperObject getFlipperObjectFor(SharedPreferences sharedPreferences) {
        FlipperObject.Builder builder = new FlipperObject.Builder();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            if (entry.getKey() != null) {
                builder.put(entry.getKey(), entry.getValue());
            }
        }
        return builder.build();
    }

    public SharedPreferencesFlipperPlugin(Context context, String str, int i) {
        this(context, Arrays.asList(new SharedPreferencesDescriptor(str, i)));
    }

    public SharedPreferencesFlipperPlugin(Context context, List<SharedPreferencesDescriptor> list) {
        this.onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.facebook.flipper.plugins.sharedpreferences.SharedPreferencesFlipperPlugin.1
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                SharedPreferencesDescriptor sharedPreferencesDescriptor;
                if (SharedPreferencesFlipperPlugin.this.mConnection == null || (sharedPreferencesDescriptor = (SharedPreferencesDescriptor) SharedPreferencesFlipperPlugin.this.mSharedPreferences.get(sharedPreferences)) == null) {
                    return;
                }
                SharedPreferencesFlipperPlugin.this.mConnection.send("sharedPreferencesChange", new FlipperObject.Builder().put("preferences", sharedPreferencesDescriptor.name).put(Action.NAME_ATTRIBUTE, str).put("deleted", Boolean.valueOf(!sharedPreferences.contains(str))).put(CrashHianalyticsData.TIME, Long.valueOf(System.currentTimeMillis())).put("value", sharedPreferences.getAll().get(str)).build());
            }
        };
        if (context != null) {
            this.mSharedPreferences = new HashMap(list.size());
            for (SharedPreferencesDescriptor sharedPreferencesDescriptor : list) {
                SharedPreferences sharedPreferences = sharedPreferencesDescriptor.getSharedPreferences(context);
                sharedPreferences.registerOnSharedPreferenceChangeListener(this.onSharedPreferenceChangeListener);
                this.mSharedPreferences.put(sharedPreferences, sharedPreferencesDescriptor);
            }
            return;
        }
        throw new IllegalArgumentException("Given null context");
    }
}
