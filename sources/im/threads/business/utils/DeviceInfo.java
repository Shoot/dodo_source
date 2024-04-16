package im.threads.business.utils;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import ch.qos.logback.core.CoreConstants;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: DeviceInfo.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\u000e"}, d2 = {"Lim/threads/business/utils/DeviceInfo;", "", "()V", "deviceName", "", "getDeviceName", "()Ljava/lang/String;", "ipAddress", "getIpAddress", "osVersion", "getOsVersion", "getLocale", "ctx", "Landroid/content/Context;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeviceInfo {
    public final String getDeviceName() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str + " " + str2;
    }

    public final String getIpAddress() {
        String hostAddress;
        int Y;
        try {
            ArrayList<NetworkInterface> list = Collections.list(NetworkInterface.getNetworkInterfaces());
            z65.g(list, "list(NetworkInterface.getNetworkInterfaces())");
            for (NetworkInterface networkInterface : list) {
                ArrayList<InetAddress> list2 = Collections.list(networkInterface.getInetAddresses());
                z65.g(list2, "list(networkInterface.inetAddresses)");
                for (InetAddress inetAddress : list2) {
                    if (!inetAddress.isLoopbackAddress() && (hostAddress = inetAddress.getHostAddress()) != null) {
                        Y = m0b.Y(hostAddress, CoreConstants.COLON_CHAR, 0, false, 6, null);
                        if (Y < 0) {
                            return hostAddress;
                        }
                    }
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public final String getLocale(Context context) {
        LocaleList locales;
        Locale locale;
        z65.h(context, "ctx");
        if (Build.VERSION.SDK_INT >= 24) {
            locales = context.getResources().getConfiguration().getLocales();
            locale = locales.get(0);
            String languageTag = locale.toLanguageTag();
            z65.g(languageTag, "{\n            ctx.resour…toLanguageTag()\n        }");
            return languageTag;
        }
        String languageTag2 = context.getResources().getConfiguration().locale.toLanguageTag();
        z65.g(languageTag2, "{\n            ctx.resour…toLanguageTag()\n        }");
        return languageTag2;
    }

    public final String getOsVersion() {
        String str = Build.VERSION.RELEASE;
        z65.g(str, "RELEASE");
        return str;
    }
}
