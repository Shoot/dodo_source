package com.appsflyer.internal;

import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00012\u00020\n:\u0001\u0001B)\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0005\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0005\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0005\u001a\u00020\u0002X\u0086\u0002¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0003\u001a\u00020\u0006X\u0007¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0011\u0010\u0007\u001a\u00020\u0006X\u0007¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0011\u0010\t\u001a\u00020\u0006X\u0007¢\u0006\u0006\n\u0004\b\u0005\u0010\b"}, d2 = {"Lcom/appsflyer/internal/AFb1aSDK;", "AFa1zSDK", "", "AFInAppEventParameterName", "I", "AFKeystoreWrapper", "", CoreConstants.VALUE_OF, "Ljava/lang/String;", "AFInAppEventType", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "toString", "()Ljava/lang/String;", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFb1aSDK {
    public static final AFa1zSDK AFa1zSDK = new AFa1zSDK(null);
    public int AFInAppEventParameterName;
    public final String AFInAppEventType;
    public final String AFKeystoreWrapper;
    public final String valueOf;

    public AFb1aSDK(String str, String str2, String str3, int i) {
        z65.h(str, "");
        z65.h(str2, "");
        z65.h(str3, "");
        this.AFInAppEventType = str;
        this.valueOf = str2;
        this.AFKeystoreWrapper = str3;
        this.AFInAppEventParameterName = i;
    }

    public final JSONObject AFKeystoreWrapper() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.AFInAppEventType);
        jSONObject.put("hash_name", this.valueOf);
        jSONObject.put("st", this.AFKeystoreWrapper);
        jSONObject.put(com.huawei.hms.opendevice.c.a, String.valueOf(this.AFInAppEventParameterName));
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFb1aSDK)) {
            return false;
        }
        AFb1aSDK aFb1aSDK = (AFb1aSDK) obj;
        if (z65.c(this.AFInAppEventType, aFb1aSDK.AFInAppEventType) && z65.c(this.valueOf, aFb1aSDK.valueOf) && z65.c(this.AFKeystoreWrapper, aFb1aSDK.AFKeystoreWrapper) && this.AFInAppEventParameterName == aFb1aSDK.AFInAppEventParameterName) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.AFInAppEventType.hashCode() * 31) + this.valueOf.hashCode()) * 31) + this.AFKeystoreWrapper.hashCode()) * 31) + this.AFInAppEventParameterName;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AFb1aSDK(valueOf=");
        sb.append(this.AFInAppEventType);
        sb.append(", AFInAppEventParameterName=");
        sb.append(this.valueOf);
        sb.append(", AFInAppEventType=");
        sb.append(this.AFKeystoreWrapper);
        sb.append(", AFKeystoreWrapper=");
        sb.append(this.AFInAppEventParameterName);
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb.toString();
    }

    public /* synthetic */ AFb1aSDK(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? 1 : i);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\b\u0086\u0003\u0018\u00002\u00020\u000fB\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0007\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0002\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\f"}, d2 = {"Lcom/appsflyer/internal/AFb1aSDK$AFa1zSDK;", "", "p0", "", "", "p1", "", "AFInAppEventParameterName", "(Ljava/lang/Integer;[Ljava/lang/String;)Z", "Lcom/appsflyer/internal/AFb1aSDK;", "values", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFb1aSDK;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "<init>", "()V", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class AFa1zSDK {
        private AFa1zSDK() {
        }

        public /* synthetic */ AFa1zSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static boolean AFInAppEventParameterName(Integer num, String... strArr) {
            boolean z;
            if (num == null) {
                z = true;
            } else {
                z = false;
            }
            int length = strArr.length;
            for (int i = 0; i < 3; i++) {
                String str = strArr[i];
                if (!z && str != null && str.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
            }
            return z;
        }

        public static AFb1aSDK values(String str) {
            List<String> y0;
            boolean J;
            boolean J2;
            boolean J3;
            boolean J4;
            CharSequence R0;
            z65.h(str, "");
            y0 = m0b.y0(str, new String[]{"\n"}, false, 0, 6, null);
            if (y0.size() != 4) {
                return null;
            }
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Integer num = null;
            for (String str5 : y0) {
                J = l0b.J(str5, "label=", false, 2, null);
                if (!J) {
                    J2 = l0b.J(str5, "hashName=", false, 2, null);
                    if (!J2) {
                        J3 = l0b.J(str5, "stackTrace=", false, 2, null);
                        if (!J3) {
                            J4 = l0b.J(str5, "c=", false, 2, null);
                            if (!J4) {
                                break;
                            }
                            String substring = str5.substring(2);
                            z65.g(substring, "");
                            R0 = m0b.R0(substring);
                            num = Integer.valueOf(Integer.parseInt(R0.toString()));
                        } else {
                            str4 = values(str5, "stackTrace=");
                        }
                    } else {
                        str3 = values(str5, "hashName=");
                    }
                } else {
                    str2 = values(str5, "label=");
                }
            }
            if (AFInAppEventParameterName(num, str2, str3, str4)) {
                return null;
            }
            z65.e(str2);
            z65.e(str3);
            z65.e(str4);
            z65.e(num);
            return new AFb1aSDK(str2, str3, str4, num.intValue());
        }

        private static String values(String str, String str2) {
            CharSequence R0;
            String substring = str.substring(str2.length());
            z65.g(substring, "");
            R0 = m0b.R0(substring);
            String obj = R0.toString();
            z65.h(obj, "");
            Charset charset = rw0.b;
            byte[] bytes = obj.getBytes(charset);
            z65.g(bytes, "");
            z65.h(bytes, "");
            byte[] decode = Base64.decode(bytes, 2);
            z65.g(decode, "");
            return new String(decode, charset);
        }
    }
}
