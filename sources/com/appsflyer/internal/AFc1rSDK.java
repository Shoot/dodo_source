package com.appsflyer.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import ch.qos.logback.core.CoreConstants;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* loaded from: classes.dex */
public final class AFc1rSDK {
    private byte[] AFInAppEventParameterName;
    public String AFInAppEventType;
    public String AFKeystoreWrapper;
    @Nullable
    public AFd1wSDK valueOf;
    public String values;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/StackTraceElement;", "p0", "", CoreConstants.VALUE_OF, "(Ljava/lang/StackTraceElement;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1rSDK$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends ej5 implements Function1<StackTraceElement, CharSequence> {
        public static final AnonymousClass5 AFKeystoreWrapper = new AnonymousClass5();

        AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: valueOf */
        public final CharSequence invoke(StackTraceElement stackTraceElement) {
            z65.h(stackTraceElement, "");
            return "at ".concat(String.valueOf(stackTraceElement));
        }
    }

    AFc1rSDK() {
    }

    public AFc1rSDK(String str, byte[] bArr, String str2, AFd1wSDK aFd1wSDK) {
        this.AFKeystoreWrapper = str;
        this.AFInAppEventParameterName = bArr;
        this.AFInAppEventType = str2;
        this.valueOf = aFd1wSDK;
    }

    public static final List<StackTraceElement> values(Throwable th) {
        boolean J;
        z65.h(th, "");
        StackTraceElement[] stackTrace = th.getStackTrace();
        z65.g(stackTrace, "");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            z65.g(className, "");
            J = l0b.J(className, "com.appsflyer", false, 2, null);
            if (!J) {
                stackTraceElement = null;
            }
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
        }
        return arrayList;
    }

    public final byte[] AFInAppEventParameterName() {
        return this.AFInAppEventParameterName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AFc1rSDK.class == obj.getClass()) {
            AFc1rSDK aFc1rSDK = (AFc1rSDK) obj;
            String str = this.AFInAppEventType;
            if (str == null ? aFc1rSDK.AFInAppEventType != null : !str.equals(aFc1rSDK.AFInAppEventType)) {
                return false;
            }
            if (!Arrays.equals(this.AFInAppEventParameterName, aFc1rSDK.AFInAppEventParameterName)) {
                return false;
            }
            String str2 = this.AFKeystoreWrapper;
            if (str2 == null ? aFc1rSDK.AFKeystoreWrapper != null : !str2.equals(aFc1rSDK.AFKeystoreWrapper)) {
                return false;
            }
            String str3 = this.values;
            if (str3 == null ? aFc1rSDK.values != null : !str3.equals(aFc1rSDK.values)) {
                return false;
            }
            if (this.valueOf == aFc1rSDK.valueOf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.AFInAppEventType;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode = ((i * 31) + Arrays.hashCode(this.AFInAppEventParameterName)) * 31;
        String str2 = this.AFKeystoreWrapper;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 31;
        String str3 = this.values;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        AFd1wSDK aFd1wSDK = this.valueOf;
        if (aFd1wSDK != null) {
            i4 = aFd1wSDK.hashCode();
        }
        return i6 + i4;
    }

    public AFc1rSDK(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        int i = 0;
        int i2 = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.AFKeystoreWrapper = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.AFInAppEventType = nextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.AFInAppEventType);
                if (matcher.matches()) {
                    i = Integer.parseInt(matcher.group(1));
                    i2 = Integer.parseInt(matcher.group(2));
                }
            } else if (nextLine.startsWith("data=")) {
                String trim = nextLine.substring(5).trim();
                this.AFInAppEventParameterName = (i > 4 || i2 >= 11) ? Base64.decode(trim, 2) : trim.getBytes();
            } else if (nextLine.startsWith("type=")) {
                String trim2 = nextLine.substring(5).trim();
                try {
                    this.valueOf = AFd1wSDK.valueOf(trim2);
                } catch (Exception e) {
                    AFLogger.afErrorLog("CACHE: Unknown task type: ".concat(String.valueOf(trim2)), e);
                }
            }
        }
        scanner.close();
    }

    public static Map<String, String> values(Context context) {
        HashMap hashMap = new HashMap();
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            hashMap.put("x_px", String.valueOf(displayMetrics.widthPixels));
            hashMap.put("y_px", String.valueOf(displayMetrics.heightPixels));
            hashMap.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            hashMap.put("size", String.valueOf(context.getResources().getConfiguration().screenLayout & 15));
            hashMap.put("xdp", String.valueOf(displayMetrics.xdpi));
            hashMap.put("ydp", String.valueOf(displayMetrics.ydpi));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Couldn't aggregate screen stats: ", th);
        }
        return hashMap;
    }
}
