package defpackage;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: had  reason: default package */
/* loaded from: classes2.dex */
public enum had {
    DEBUG(3),
    ERROR(6),
    INFO(4),
    VERBOSE(2),
    WARN(5);
    
    private final int a;

    had(int i) {
        this.a = i;
    }

    public static had a(int i) {
        if (i != 2) {
            if (i != 3) {
                if (i != 5) {
                    if (i != 6) {
                        return INFO;
                    }
                    return ERROR;
                }
                return WARN;
            }
            return DEBUG;
        }
        return VERBOSE;
    }
}
