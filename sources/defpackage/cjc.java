package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.c;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: cjc  reason: default package */
/* loaded from: classes2.dex */
public final class cjc {
    private static final wka a = new wka();
    private static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return t8c.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(u09.g);
    }

    @NonNull
    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return resources.getString(17039370);
                }
                return resources.getString(u09.a);
            }
            return resources.getString(u09.j);
        }
        return resources.getString(u09.d);
    }

    @NonNull
    public static String d(Context context, int i) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 7) {
                            if (i != 9) {
                                if (i != 20) {
                                    switch (i) {
                                        case 16:
                                            return h(context, "common_google_play_services_api_unavailable_text", a2);
                                        case 17:
                                            return h(context, "common_google_play_services_sign_in_failed_text", a2);
                                        case 18:
                                            return resources.getString(u09.m, a2);
                                        default:
                                            return resources.getString(v09.a, a2);
                                    }
                                }
                                return h(context, "common_google_play_services_restricted_profile_text", a2);
                            }
                            return resources.getString(u09.i, a2);
                        }
                        return h(context, "common_google_play_services_network_error_text", a2);
                    }
                    return h(context, "common_google_play_services_invalid_account_text", a2);
                }
                return resources.getString(u09.b, a2);
            } else if (z13.d(context)) {
                return resources.getString(u09.n);
            } else {
                return resources.getString(u09.k, a2);
            }
        }
        return resources.getString(u09.e, a2);
    }

    @NonNull
    public static String e(Context context, int i) {
        if (i != 6 && i != 19) {
            return d(context, i);
        }
        return h(context, "common_google_play_services_resolution_required_text", a(context));
    }

    @NonNull
    public static String f(Context context, int i) {
        String g;
        if (i == 6) {
            g = i(context, "common_google_play_services_resolution_required_title");
        } else {
            g = g(context, i);
        }
        if (g == null) {
            return context.getResources().getString(u09.h);
        }
        return g;
    }

    public static String g(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(u09.f);
            case 2:
                return resources.getString(u09.l);
            case 3:
                return resources.getString(u09.c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return i(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i = i(context, str);
        if (i == null) {
            i = resources.getString(v09.a);
        }
        return String.format(resources.getConfiguration().locale, i, str2);
    }

    private static String i(Context context, String str) {
        wka wkaVar = a;
        synchronized (wkaVar) {
            try {
                Locale c = eq1.a(context.getResources().getConfiguration()).c(0);
                if (!c.equals(b)) {
                    wkaVar.clear();
                    b = c;
                }
                String str2 = (String) wkaVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources d = c.d(context);
                if (d == null) {
                    return null;
                }
                int identifier = d.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = d.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                    return null;
                }
                wkaVar.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
