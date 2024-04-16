package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.yi3;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: EntityLifecycleDispatcher.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f¨\u0006\u0014"}, d2 = {"Lfj3;", "Lyi3;", "T", "Lej3;", "entity", "", "a", "(Lyi3;)V", "b", c.a, "", "Lmg8;", "Ljava/util/Collection;", "prePersistListeners", "Lag8;", "postPersistListeners", "Lzf8;", "postLoadListeners", "<init>", "(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;)V", "persistence_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: fj3  reason: default package */
/* loaded from: classes2.dex */
public final class fj3<T extends yi3> implements ej3<T> {
    private final Collection<mg8> a;
    private final Collection<ag8> b;
    private final Collection<zf8> c;

    /* JADX WARN: Multi-variable type inference failed */
    public fj3(Collection<? extends mg8> collection, Collection<? extends ag8> collection2, Collection<? extends zf8> collection3) {
        z65.h(collection, "prePersistListeners");
        z65.h(collection2, "postPersistListeners");
        z65.h(collection3, "postLoadListeners");
        this.a = collection;
        this.b = collection2;
        this.c = collection3;
    }

    @Override // defpackage.ej3
    public void a(T t) {
        z65.h(t, "entity");
        for (mg8 mg8Var : this.a) {
            mg8Var.a(t);
        }
    }

    @Override // defpackage.ej3
    public void b(T t) {
        z65.h(t, "entity");
        for (ag8 ag8Var : this.b) {
            ag8Var.b(t);
        }
    }

    @Override // defpackage.ej3
    public void c(T t) {
        z65.h(t, "entity");
        for (zf8 zf8Var : this.c) {
            zf8Var.c(t);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ fj3(java.util.Collection r1, java.util.Collection r2, java.util.Collection r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto La
            java.util.List r1 = defpackage.ic1.l()
            java.util.Collection r1 = (java.util.Collection) r1
        La:
            r5 = r4 & 2
            if (r5 == 0) goto L14
            java.util.List r2 = defpackage.ic1.l()
            java.util.Collection r2 = (java.util.Collection) r2
        L14:
            r4 = r4 & 4
            if (r4 == 0) goto L1e
            java.util.List r3 = defpackage.ic1.l()
            java.util.Collection r3 = (java.util.Collection) r3
        L1e:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj3.<init>(java.util.Collection, java.util.Collection, java.util.Collection, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
