package defpackage;

import java.util.List;
/* compiled from: GeoEntityUtility.java */
/* renamed from: ge4  reason: default package */
/* loaded from: classes.dex */
public final class ge4 {
    public static boolean a(int i) {
        List<String> list = fy1.a().get(Integer.valueOf(i));
        if (list != null && !list.contains("001")) {
            return true;
        }
        return false;
    }

    public static boolean b(String str) {
        return !str.equals("001");
    }
}
