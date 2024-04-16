package com.inappstory.sdk.stories.statistic;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;
/* loaded from: classes3.dex */
public class SharedPreferencesAPI {
    private static final String SHARED_PREFERENCES_DEFAULT = "default_n";
    private static Context context;
    private static Object sharedPrefLock = new Object();
    private static Object contextLock = new Object();

    /* loaded from: classes3.dex */
    static class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (SharedPreferencesAPI.sharedPrefLock) {
                SharedPreferences.Editor edit = SharedPreferencesAPI.getDefaultPreferences().edit();
                edit.putString(this.a, this.b);
                edit.apply();
            }
        }
    }

    /* loaded from: classes3.dex */
    static class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Set b;

        b(String str, Set set) {
            this.a = str;
            this.b = set;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (SharedPreferencesAPI.sharedPrefLock) {
                SharedPreferences.Editor edit = SharedPreferencesAPI.getDefaultPreferences().edit();
                edit.putStringSet(this.a, this.b);
                edit.apply();
            }
        }
    }

    /* loaded from: classes3.dex */
    static class c implements Runnable {
        final /* synthetic */ String a;

        c(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (SharedPreferencesAPI.sharedPrefLock) {
                SharedPreferences.Editor edit = SharedPreferencesAPI.getDefaultPreferences().edit();
                edit.remove(this.a);
                edit.apply();
            }
        }
    }

    public static void clear() {
        synchronized (sharedPrefLock) {
            getDefaultPreferences().edit().clear().apply();
        }
    }

    public static SharedPreferences getDefaultPreferences() {
        synchronized (contextLock) {
            try {
                Context context2 = context;
                if (context2 == null) {
                    return null;
                }
                return context2.getSharedPreferences(SHARED_PREFERENCES_DEFAULT, 0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String getString(String str) {
        synchronized (sharedPrefLock) {
            try {
                SharedPreferences defaultPreferences = getDefaultPreferences();
                if (defaultPreferences == null) {
                    return null;
                }
                return defaultPreferences.getString(str, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Set<String> getStringSet(String str) {
        synchronized (sharedPrefLock) {
            try {
                SharedPreferences defaultPreferences = getDefaultPreferences();
                if (defaultPreferences == null) {
                    return null;
                }
                return defaultPreferences.getStringSet(str, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean hasContext() {
        boolean z;
        synchronized (contextLock) {
            if (context != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public static void remove(String str) {
        synchronized (contextLock) {
            try {
                if (context == null) {
                    return;
                }
                new Thread(new c(str)).start();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void removeString(String str) {
        synchronized (contextLock) {
            try {
                if (context == null) {
                    return;
                }
                synchronized (sharedPrefLock) {
                    SharedPreferences.Editor edit = getDefaultPreferences().edit();
                    edit.remove(str);
                    edit.apply();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void saveString(String str, String str2) {
        synchronized (contextLock) {
            try {
                if (context == null) {
                    return;
                }
                new Thread(new a(str, str2)).start();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void saveStringSet(String str, Set<String> set) {
        synchronized (contextLock) {
            try {
                if (context == null) {
                    return;
                }
                new Thread(new b(str, set)).start();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setContext(Context context2) {
        synchronized (contextLock) {
            context = context2;
        }
    }

    public static String getString(String str, String str2) {
        synchronized (sharedPrefLock) {
            try {
                SharedPreferences defaultPreferences = getDefaultPreferences();
                if (defaultPreferences == null) {
                    return null;
                }
                return defaultPreferences.getString(str, str2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
