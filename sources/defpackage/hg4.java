package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: GlobalLibraryVersionRegistrar.java */
/* renamed from: hg4  reason: default package */
/* loaded from: classes2.dex */
public class hg4 {
    private static volatile hg4 b;
    private final Set<cp5> a = new HashSet();

    hg4() {
    }

    public static hg4 a() {
        hg4 hg4Var = b;
        if (hg4Var == null) {
            synchronized (hg4.class) {
                try {
                    hg4Var = b;
                    if (hg4Var == null) {
                        hg4Var = new hg4();
                        b = hg4Var;
                    }
                } finally {
                }
            }
        }
        return hg4Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<cp5> b() {
        Set<cp5> unmodifiableSet;
        synchronized (this.a) {
            unmodifiableSet = Collections.unmodifiableSet(this.a);
        }
        return unmodifiableSet;
    }
}
