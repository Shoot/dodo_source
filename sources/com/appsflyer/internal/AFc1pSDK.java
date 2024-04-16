package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.inappstory.sdk.network.NetworkHandler;
import im.threads.business.transport.MessageAttributes;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFc1pSDK {
    @VisibleForTesting
    private static String AFKeystoreWrapper = null;
    private static char AFLogger = 0;
    private static int AFVersionDeclaration = 1;
    private static int afInfoLog;
    private static char[] afRDLog;
    public static String valueOf;
    @VisibleForTesting
    private static String values;
    private final CreateOneLinkHttpTask AFInAppEventParameterName;
    private final AFb1fSDK AFInAppEventType;
    private final AppsFlyerProperties afDebugLog;
    private final AFc1cSDK afErrorLog;

    static {
        values();
        values = "https://%smonitorsdk.%s/remote-debug?app_id=";
        valueOf = "https://%sgcdsdk.%s/install_data/v5.0/";
        AFKeystoreWrapper = "https://%sonelink.%s/shortlink-sdk/v2";
        int i = AFVersionDeclaration + 99;
        afInfoLog = i % 128;
        int i2 = i % 2;
    }

    public AFc1pSDK(CreateOneLinkHttpTask createOneLinkHttpTask, AFb1fSDK aFb1fSDK, AppsFlyerProperties appsFlyerProperties, AFc1cSDK aFc1cSDK) {
        this.AFInAppEventParameterName = createOneLinkHttpTask;
        this.AFInAppEventType = aFb1fSDK;
        this.afDebugLog = appsFlyerProperties;
        this.afErrorLog = aFc1cSDK;
    }

    private <T> AFc1oSDK<T> AFKeystoreWrapper(AFc1sSDK aFc1sSDK, AFc1hSDK<T> aFc1hSDK) {
        int i = AFVersionDeclaration + 21;
        afInfoLog = i % 128;
        if (i % 2 == 0) {
            AFc1oSDK<T> AFInAppEventType = AFInAppEventType(aFc1sSDK, aFc1hSDK, AFInAppEventParameterName());
            int i2 = afInfoLog + 97;
            AFVersionDeclaration = i2 % 128;
            int i3 = i2 % 2;
            return AFInAppEventType;
        }
        AFInAppEventType(aFc1sSDK, aFc1hSDK, AFInAppEventParameterName());
        throw null;
    }

    static void values() {
        AFLogger = (char) 4;
        afRDLog = new char[]{13820, 13769, 13807, 13811, 13825, 13819, 13821, 13824, 13800, 13751, 13816, 13823, 13822, 13806, 13787, 13812};
    }

    @NonNull
    public final AFc1oSDK<AFb1oSDK> AFInAppEventParameterName(boolean z, boolean z2, @NonNull String str, int i) {
        String str2;
        String str3;
        AFc1cSDK aFc1cSDK = this.afErrorLog;
        z65.h(str, "");
        if (z) {
            int i2 = afInfoLog + 49;
            AFVersionDeclaration = i2 % 128;
            int i3 = i2 % 2;
            str2 = AFc1cSDK.values;
            int i4 = AFVersionDeclaration + 39;
            afInfoLog = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str2 = AFc1cSDK.valueOf;
        }
        String str4 = z2 ? "stg" : "";
        pza pzaVar = pza.a;
        Object[] objArr = new Object[4];
        if (AFc1cSDK.AFInAppEventType()) {
            str3 = (String) aFc1cSDK.AFInAppEventType.getValue();
        } else {
            int i6 = afInfoLog + 47;
            AFVersionDeclaration = i6 % 128;
            int i7 = i6 % 2;
            str3 = "";
        }
        objArr[0] = str3;
        objArr[1] = str4;
        objArr[2] = aFc1cSDK.AFKeystoreWrapper();
        objArr[3] = str;
        String format = String.format(str2, Arrays.copyOf(objArr, 4));
        z65.g(format, "");
        AFc1sSDK aFc1sSDK = new AFc1sSDK(format, NetworkHandler.GET);
        aFc1sSDK.AFInAppEventParameterName(1500);
        return AFKeystoreWrapper(aFc1sSDK, new AFc1lSDK());
    }

    @NonNull
    public final AFc1oSDK<String> AFInAppEventType(Map<String, Object> map, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("https://%sars.%s/api/v2/android/validate_subscription?app_id=", AppsFlyerLib.getInstance().getHostPrefix(), AFb1zSDK.AFInAppEventType().getHostName()));
        sb.append(this.AFInAppEventType.valueOf.values.getPackageName());
        try {
            AFc1oSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFc1sSDK(sb.toString(), (byte[]) ((Class) AFa1vSDK.AFInAppEventType(37 - Color.alpha(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 74, (char) (17157 - (ViewConfiguration.getEdgeSlop() >> 16)))).getMethod("AFInAppEventParameterName", Map.class, String.class).invoke(null, map, str), NetworkHandler.POST, Collections.emptyMap(), true), new AFc1iSDK());
            int i = afInfoLog + 115;
            AFVersionDeclaration = i % 128;
            if (i % 2 != 0) {
                return AFKeystoreWrapper2;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @NonNull
    public final AFc1oSDK<String> valueOf(Map<String, Object> map, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("https://%sviap.%s/api/v1/android/validate_purchase?app_id=", AppsFlyerLib.getInstance().getHostPrefix(), AFb1zSDK.AFInAppEventType().getHostName()));
        sb.append(this.AFInAppEventType.valueOf.values.getPackageName());
        try {
            AFc1oSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFc1sSDK(sb.toString(), (byte[]) ((Class) AFa1vSDK.AFInAppEventType(TextUtils.getOffsetBefore("", 0) + 37, 74 - Drawable.resolveOpacity(0, 0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 17156))).getMethod("AFInAppEventParameterName", Map.class, String.class).invoke(null, map, str), NetworkHandler.POST, Collections.emptyMap(), true), new AFc1iSDK());
            int i = afInfoLog + 89;
            AFVersionDeclaration = i % 128;
            int i2 = i % 2;
            return AFKeystoreWrapper2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final AFc1oSDK<String> values(AFa1sSDK aFa1sSDK, String str) {
        try {
            AFc1oSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFc1sSDK(aFa1sSDK.AFLogger, (byte[]) ((Class) AFa1vSDK.AFInAppEventType(ExpandableListView.getPackedPositionChild(0L) + 38, View.MeasureSpec.makeMeasureSpec(0, 0) + 74, (char) (17157 - (ViewConfiguration.getJumpTapTimeout() >> 16)))).getMethod("values", AFa1sSDK.class, String.class).invoke(null, aFa1sSDK, str), NetworkHandler.POST, Collections.emptyMap(), aFa1sSDK.AFInAppEventParameterName()), new AFc1iSDK());
            int i = afInfoLog + 45;
            AFVersionDeclaration = i % 128;
            if (i % 2 != 0) {
                return AFKeystoreWrapper2;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final AFc1oSDK<String> values(AFe1fSDK aFe1fSDK) {
        AFc1oSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFc1sSDK(aFe1fSDK.AFLogger, aFe1fSDK.valueOf(), NetworkHandler.POST, Collections.emptyMap(), true), new AFc1iSDK());
        int i = afInfoLog + 105;
        AFVersionDeclaration = i % 128;
        int i2 = i % 2;
        return AFKeystoreWrapper2;
    }

    public final AFc1oSDK<Map<String, String>> AFInAppEventType(@NonNull String str, @NonNull String str2, @NonNull UUID uuid, @NonNull String str3) {
        String obj = uuid.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFb1zSDK.AFInAppEventType().getHostName()));
        sb.append("/");
        sb.append(str);
        sb.append("?id=");
        sb.append(str2);
        String obj2 = sb.toString();
        Map<String, Object> valueOf2 = valueOf();
        String valueOf3 = String.valueOf(valueOf2.get("build_number"));
        HashMap hashMap = new HashMap();
        hashMap.put("Af-UUID", uuid.toString());
        hashMap.put("Af-Meta-Sdk-Ver", valueOf3);
        hashMap.put("Af-Meta-Counter", String.valueOf(valueOf2.get("counter")));
        hashMap.put("Af-Meta-Model", String.valueOf(valueOf2.get("model")));
        hashMap.put("Af-Meta-Platform", String.valueOf(valueOf2.get("platformextension")));
        hashMap.put("Af-Meta-System-Version", String.valueOf(valueOf2.get("sdk")));
        Object[] objArr = new Object[1];
        valueOf(11 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\f\u0002\r\u0005\u0002\u0007\r\u0007\u000e\u0001\t\b", (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 40), objArr);
        hashMap.put(((String) objArr[0]).intern(), AFInAppEventType(str3, obj, NetworkHandler.GET, obj, str, str2, valueOf3));
        AFc1oSDK<Map<String, String>> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFc1sSDK(obj2, null, NetworkHandler.GET, hashMap, false), new AFc1fSDK());
        int i = afInfoLog + 65;
        AFVersionDeclaration = i % 128;
        int i2 = i % 2;
        return AFKeystoreWrapper2;
    }

    @NonNull
    public final AFc1oSDK<String> valueOf(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(values, AppsFlyerLib.getInstance().getHostPrefix(), AFb1zSDK.AFInAppEventType().getHostName()));
        sb.append(this.AFInAppEventType.valueOf.values.getPackageName());
        AFc1oSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFc1sSDK(sb.toString(), new JSONObject(map).toString().getBytes(), NetworkHandler.POST, Collections.emptyMap(), false), new AFc1iSDK());
        int i = afInfoLog + 111;
        AFVersionDeclaration = i % 128;
        int i2 = i % 2;
        return AFKeystoreWrapper2;
    }

    public final AFc1oSDK<String> values(@NonNull String str, @NonNull Map<String, String> map, @Nullable String str2, @NonNull UUID uuid, @NonNull String str3) {
        String obj = uuid.toString();
        HashMap hashMap = new HashMap();
        hashMap.put(RemoteMessageConst.TTL, "-1");
        hashMap.put(MessageAttributes.UUID, obj);
        hashMap.put("data", map);
        hashMap.put("meta", valueOf());
        if (str2 != null) {
            hashMap.put("brand_domain", str2);
            int i = afInfoLog + 65;
            AFVersionDeclaration = i % 128;
            int i2 = i % 2;
        }
        String jSONObject = AFa1lSDK.AFInAppEventParameterName((Map<String, ?>) hashMap).toString();
        HashMap hashMap2 = new HashMap();
        Object[] objArr = new Object[1];
        valueOf((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12, "\f\u0002\r\u0005\u0002\u0007\r\u0007\u000e\u0001\t\b", (byte) (40 - Color.argb(0, 0, 0, 0)), objArr);
        hashMap2.put(((String) objArr[0]).intern(), AFInAppEventType(str3, obj, NetworkHandler.POST, jSONObject));
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFb1zSDK.AFInAppEventType().getHostName()));
        sb.append("/");
        sb.append(str);
        AFc1oSDK<String> AFInAppEventType = AFInAppEventType(new AFc1sSDK(sb.toString(), jSONObject.getBytes(Charset.forName("UTF-8")), NetworkHandler.POST, hashMap2, false), (AFc1hSDK) new AFc1iSDK(), true);
        int i3 = afInfoLog + 107;
        AFVersionDeclaration = i3 % 128;
        int i4 = i3 % 2;
        return AFInAppEventType;
    }

    private boolean AFInAppEventParameterName() {
        if (!this.afDebugLog.getBoolean(AppsFlyerProperties.HTTP_CACHE, true)) {
            int i = AFVersionDeclaration + 45;
            afInfoLog = i % 128;
            return i % 2 == 0;
        }
        int i2 = AFVersionDeclaration + 117;
        afInfoLog = i2 % 128;
        int i3 = i2 % 2;
        return false;
    }

    @VisibleForTesting
    private Map<String, Object> valueOf() {
        HashMap hashMap = new HashMap();
        hashMap.put("build_number", "6.10.0");
        hashMap.put("counter", Integer.valueOf(this.AFInAppEventType.values.AFInAppEventType("appsFlyerCount", 0)));
        hashMap.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        valueOf(TextUtils.lastIndexOf("", '0', 0, 0) + 6, "\u000b\t\u0007\r㘒", (byte) (20 - Color.red(0)), objArr);
        hashMap.put(((String) objArr[0]).intern(), Build.BRAND);
        hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        Context context = this.AFInAppEventType.valueOf.values;
        hashMap.put("app_version_name", AFa1dSDK.values(context, context.getPackageName()));
        hashMap.put(HiAnalyticsConstant.BI_KEY_APP_ID, this.AFInAppEventType.valueOf.values.getPackageName());
        hashMap.put("platformextension", new AFb1rSDK().values());
        int i = afInfoLog + 59;
        AFVersionDeclaration = i % 128;
        if (i % 2 == 0) {
            int i2 = 91 / 0;
        }
        return hashMap;
    }

    public final AFc1oSDK<String> AFInAppEventType(@NonNull String str) {
        AFc1oSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFc1sSDK(str, null, NetworkHandler.GET, Collections.emptyMap(), false).AFInAppEventParameterName(10000).afErrorLogForExcManagerOnly(), new AFc1iSDK());
        int i = afInfoLog + 35;
        AFVersionDeclaration = i % 128;
        int i2 = i % 2;
        return AFKeystoreWrapper2;
    }

    private <T> AFc1oSDK<T> AFInAppEventType(AFc1sSDK aFc1sSDK, AFc1hSDK<T> aFc1hSDK, boolean z) {
        aFc1sSDK.valueOf(z);
        CreateOneLinkHttpTask createOneLinkHttpTask = this.AFInAppEventParameterName;
        AFc1oSDK<T> aFc1oSDK = new AFc1oSDK<>(aFc1sSDK, createOneLinkHttpTask.AFInAppEventParameterName, createOneLinkHttpTask.AFInAppEventType, aFc1hSDK);
        int i = AFVersionDeclaration + 77;
        afInfoLog = i % 128;
        if (i % 2 == 0) {
            return aFc1oSDK;
        }
        throw null;
    }

    private static String AFInAppEventType(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String values2 = AFa1aSDK.values((String[]) arrayList.toArray(new String[0]));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append("v2");
        String values3 = AFa1aSDK.values(values2, sb.toString());
        int i = afInfoLog + 9;
        AFVersionDeclaration = i % 128;
        int i2 = i % 2;
        return values3;
    }

    public final AFc1oSDK<Map<String, Object>> valueOf(String str, String str2) {
        AFc1oSDK<Map<String, Object>> AFKeystoreWrapper2 = AFKeystoreWrapper(AFc1qSDK.AFKeystoreWrapper(this.AFInAppEventType.valueOf.values.getPackageName(), AFb1xSDK.AFInAppEventParameterName(new WeakReference(this.AFInAppEventType.valueOf.values)), str, str2), new AFc1kSDK());
        int i = AFVersionDeclaration + 83;
        afInfoLog = i % 128;
        if (i % 2 == 0) {
            return AFKeystoreWrapper2;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r11 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void valueOf(int r10, java.lang.String r11, byte r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1pSDK.valueOf(int, java.lang.String, byte, java.lang.Object[]):void");
    }
}
