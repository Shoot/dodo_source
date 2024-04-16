package defpackage;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Arrays;
/* renamed from: u  reason: default package */
/* loaded from: classes.dex */
public final class u {
    public static final u b = new u(0);
    public static final u c = new u(1);
    public static final u d = new u(2);
    public static final u e = new u(3);
    public static final u f = new u(4);
    private final int a;

    private u(int i) {
        this.a = i;
    }

    private int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public String a() {
        int i = this.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return GrsBaseInfo.CountryCodeSource.UNKNOWN;
                    }
                    return "SG";
                }
                return "RU";
            }
            return "DE";
        }
        return "CN";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass() && this.a == ((u) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return b(Integer.valueOf(this.a));
    }
}
