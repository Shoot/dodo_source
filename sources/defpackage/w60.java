package defpackage;

import ch.qos.logback.core.CoreConstants;
import org.slf4j.Marker;
/* compiled from: Base64Variants.java */
/* renamed from: w60  reason: default package */
/* loaded from: classes2.dex */
public final class w60 {
    public static final v60 a;
    public static final v60 b;
    public static final v60 c;
    public static final v60 d;

    static {
        v60 v60Var = new v60("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        a = v60Var;
        b = new v60(v60Var, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);
        c = new v60(v60Var, "PEM", true, '=', 64);
        StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb.setCharAt(sb.indexOf(Marker.ANY_NON_NULL_MARKER), CoreConstants.DASH_CHAR);
        sb.setCharAt(sb.indexOf("/"), '_');
        d = new v60("MODIFIED-FOR-URL", sb.toString(), false, (char) 0, Integer.MAX_VALUE);
    }

    public static v60 a() {
        return b;
    }

    public static v60 b(String str) throws IllegalArgumentException {
        String str2;
        v60 v60Var = a;
        if (v60Var.d.equals(str)) {
            return v60Var;
        }
        v60 v60Var2 = b;
        if (v60Var2.d.equals(str)) {
            return v60Var2;
        }
        v60 v60Var3 = c;
        if (v60Var3.d.equals(str)) {
            return v60Var3;
        }
        v60 v60Var4 = d;
        if (v60Var4.d.equals(str)) {
            return v60Var4;
        }
        if (str == null) {
            str2 = "<null>";
        } else {
            str2 = "'" + str + "'";
        }
        throw new IllegalArgumentException("No Base64Variant with name " + str2);
    }
}
