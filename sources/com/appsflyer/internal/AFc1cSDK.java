package com.appsflyer.internal;

import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import com.appsflyer.AFLogger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\tX\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0013\u0010\f\u001a\u00020\tX\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\u000f\u001a\u00020\r8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0010"}, d2 = {"Lcom/appsflyer/internal/AFc1cSDK;", "", "Lcom/appsflyer/internal/AFb1fSDK;", "AFInAppEventParameterName", "Lcom/appsflyer/internal/AFb1fSDK;", "AFKeystoreWrapper", "Lcom/appsflyer/internal/AFb1gSDK;", "Lcom/appsflyer/internal/AFb1gSDK;", "afInfoLog", "", "Lrn5;", CoreConstants.VALUE_OF, "AFInAppEventType", "", "()Z", "values", "()Ljava/lang/String;", "afRDLog", "p0", "p1", "<init>", "(Lcom/appsflyer/internal/AFb1fSDK;Lcom/appsflyer/internal/AFb1gSDK;)V", "AFa1ySDK"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class AFc1cSDK {
    private static final List<String> afDebugLog;
    private static AFc1eSDK afRDLog;
    private final AFb1fSDK AFInAppEventParameterName;
    public final rn5 AFInAppEventType;
    private final AFb1gSDK AFKeystoreWrapper;
    private final rn5 afInfoLog;
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);
    public static String valueOf = "https://%scdn-%ssettings.%s/android/v1/%s/settings";
    public static String values = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "values", "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1cSDK$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends ej5 implements Function0<String> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: values */
        public final String invoke() {
            String packageName = AFc1cSDK.this.AFInAppEventParameterName.valueOf.values.getPackageName();
            z65.g(packageName, "");
            return AFc1cSDK.valueOf(packageName, AFc1cSDK.valueOf(AFc1cSDK.this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AFInAppEventParameterName", "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1cSDK$2  reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends ej5 implements Function0<String> {
        AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFInAppEventParameterName */
        public final String invoke() {
            CharSequence R0;
            boolean y;
            CharSequence R02;
            String AFKeystoreWrapper = AFb1zSDK.AFKeystoreWrapper(AFc1cSDK.this.AFKeystoreWrapper, AFc1cSDK.this.AFInAppEventParameterName.values());
            String str = "";
            if (AFKeystoreWrapper != null) {
                y = l0b.y(AFKeystoreWrapper);
                if (!y) {
                    R02 = m0b.R0(AFKeystoreWrapper);
                    String obj = R02.toString();
                    List<String> AFInAppEventType = AFa1ySDK.AFInAppEventType();
                    Locale locale = Locale.getDefault();
                    z65.g(locale, "");
                    String lowerCase = obj.toLowerCase(locale);
                    z65.g(lowerCase, "");
                    if (!AFInAppEventType.contains(lowerCase)) {
                        AFKeystoreWrapper = "-".concat(obj);
                    } else {
                        pza pzaVar = pza.a;
                        String format = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{obj}, 1));
                        z65.g(format, "");
                        AFLogger.afWarnLog(format);
                        AFKeystoreWrapper = "";
                    }
                }
            }
            if (AFKeystoreWrapper != null) {
                str = AFKeystoreWrapper;
            }
            R0 = m0b.R0(str);
            return R0.toString();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class AFa1xSDK {
        public static final /* synthetic */ int[] AFInAppEventType;

        static {
            int[] iArr = new int[AFd1ySDK.values().length];
            iArr[AFd1ySDK.DEFAULT.ordinal()] = 1;
            iArr[AFd1ySDK.API.ordinal()] = 2;
            iArr[AFd1ySDK.RC.ordinal()] = 3;
            AFInAppEventType = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\b\u0086\u0003\u0018\u00002\u00020\u0012B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0002X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0012\u0010\n\u001a\u00020\u0002X\u0087\u0002¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b@\u0007X\u0087\n¢\u0006\f\n\u0004\b\f\u0010\r\"\u0004\b\t\u0010\u000e"}, d2 = {"Lcom/appsflyer/internal/AFc1cSDK$AFa1ySDK;", "", "", "afDebugLog", "Ljava/util/List;", "AFInAppEventType", "()Ljava/util/List;", CoreConstants.VALUE_OF, "Ljava/lang/String;", "values", "AFKeystoreWrapper", "Lcom/appsflyer/internal/AFc1eSDK;", "afRDLog", "Lcom/appsflyer/internal/AFc1eSDK;", "(Lcom/appsflyer/internal/AFc1eSDK;)V", "AFInAppEventParameterName", "<init>", "()V", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static List<String> AFInAppEventType() {
            return AFc1cSDK.afDebugLog;
        }

        public static void values(AFc1eSDK aFc1eSDK) {
            AFc1cSDK.afRDLog = aFc1eSDK;
        }
    }

    static {
        List<String> o;
        o = kc1.o("googleplay", "playstore", "googleplaystore");
        afDebugLog = o;
    }

    public AFc1cSDK(AFb1fSDK aFb1fSDK, AFb1gSDK aFb1gSDK) {
        rn5 b;
        rn5 b2;
        z65.h(aFb1fSDK, "");
        z65.h(aFb1gSDK, "");
        this.AFInAppEventParameterName = aFb1fSDK;
        this.AFKeystoreWrapper = aFb1gSDK;
        b = yn5.b(new AnonymousClass2());
        this.afInfoLog = b;
        b2 = yn5.b(new AnonymousClass1());
        this.AFInAppEventType = b2;
    }

    public static boolean AFInAppEventType() {
        if (afRDLog == null) {
            return true;
        }
        return false;
    }

    public final String AFInAppEventParameterName() {
        AFd1ySDK aFd1ySDK;
        String str;
        if (AFInAppEventType()) {
            aFd1ySDK = AFd1ySDK.DEFAULT;
        } else {
            aFd1ySDK = AFd1ySDK.API;
        }
        int i = AFa1xSDK.AFInAppEventType[aFd1ySDK.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "";
                }
                throw new NoWhenBranchMatchedException();
            }
            AFc1eSDK aFc1eSDK = afRDLog;
            if (aFc1eSDK != null) {
                str = aFc1eSDK.valueOf;
            } else {
                str = null;
            }
            if (str == null) {
                return "";
            }
            return str;
        }
        return (String) this.AFInAppEventType.getValue();
    }

    public static final /* synthetic */ String valueOf(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        String obj = sb2.toString();
        z65.h(obj, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = obj.getBytes(rw0.b);
        z65.g(bytes, "");
        byte[] digest = messageDigest.digest(bytes);
        z65.g(digest, "");
        String encodeToString = Base64.encodeToString(digest, 2);
        z65.g(encodeToString, "");
        String lowerCase = encodeToString.toLowerCase(Locale.ROOT);
        z65.g(lowerCase, "");
        String substring = new ec9("[^\\w]+").i(lowerCase, "").substring(0, 6);
        z65.g(substring, "");
        sb.append(substring);
        sb.append(CoreConstants.DASH_CHAR);
        return sb.toString();
    }

    public static final void values(AFc1eSDK aFc1eSDK) {
        AFa1ySDK.values(aFc1eSDK);
    }

    public final String AFKeystoreWrapper() {
        AFd1ySDK aFd1ySDK;
        if (AFInAppEventType()) {
            aFd1ySDK = AFd1ySDK.DEFAULT;
        } else {
            aFd1ySDK = AFd1ySDK.API;
        }
        int i = AFa1xSDK.AFInAppEventType[aFd1ySDK.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "";
                }
                throw new NoWhenBranchMatchedException();
            }
            AFc1eSDK aFc1eSDK = afRDLog;
            String str = aFc1eSDK != null ? aFc1eSDK.AFKeystoreWrapper : null;
            return str == null ? "" : str;
        }
        return "appsflyersdk.com";
    }

    public static final /* synthetic */ String valueOf(AFc1cSDK aFc1cSDK) {
        return (String) aFc1cSDK.afInfoLog.getValue();
    }
}
