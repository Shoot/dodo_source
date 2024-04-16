package defpackage;

import ch.qos.logback.core.CoreConstants;
/* compiled from: DebugUtils.java */
/* renamed from: ko2  reason: default package */
/* loaded from: classes.dex */
public class ko2 {
    public static void a(Object obj, StringBuilder sb) {
        int lastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append(CoreConstants.CURLY_LEFT);
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
