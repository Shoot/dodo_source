package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.n;
/* compiled from: MergePaths.java */
/* renamed from: rh6  reason: default package */
/* loaded from: classes.dex */
public class rh6 implements xt1 {
    private final String a;
    private final a b;
    private final boolean c;

    /* compiled from: MergePaths.java */
    /* renamed from: rh6$a */
    /* loaded from: classes.dex */
    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a a(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return MERGE;
                            }
                            return EXCLUDE_INTERSECTIONS;
                        }
                        return INTERSECT;
                    }
                    return SUBTRACT;
                }
                return ADD;
            }
            return MERGE;
        }
    }

    public rh6(String str, a aVar, boolean z) {
        this.a = str;
        this.b = aVar;
        this.c = z;
    }

    @Override // defpackage.xt1
    public dt1 a(n nVar, v70 v70Var) {
        if (!nVar.A()) {
            ox5.c("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new sh6(this);
    }

    public a b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.b + CoreConstants.CURLY_RIGHT;
    }
}
