package defpackage;

import defpackage.t;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: dec  reason: default package */
/* loaded from: classes.dex */
public class dec extends t {
    private static final List<t.a> b = new CopyOnWriteArrayList();

    public static void a() {
        for (t.a aVar : b) {
            aVar.onFinish();
        }
    }
}
