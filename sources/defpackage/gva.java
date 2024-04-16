package defpackage;

import defpackage.xl7;
import io.realm.internal.OsCollectionChangeSet;
/* compiled from: StatefulCollectionChangeSet.java */
/* renamed from: gva  reason: default package */
/* loaded from: classes3.dex */
public class gva implements xl7 {
    private final xl7 a;
    private final Throwable b;
    private final xl7.b c;

    public gva(OsCollectionChangeSet osCollectionChangeSet) {
        xl7.b bVar;
        this.a = osCollectionChangeSet;
        boolean f = osCollectionChangeSet.f();
        Throwable c = osCollectionChangeSet.c();
        this.b = c;
        if (c != null) {
            this.c = xl7.b.ERROR;
            return;
        }
        if (f) {
            bVar = xl7.b.INITIAL;
        } else {
            bVar = xl7.b.UPDATE;
        }
        this.c = bVar;
    }
}
