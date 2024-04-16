package defpackage;

import java.util.Collection;
import kotlin.Metadata;
/* compiled from: MultiTrace.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lyp6;", "Lqjb;", "", "start", "stop", "", "a", "Ljava/util/Collection;", "traces", "<init>", "(Ljava/util/Collection;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yp6  reason: default package */
/* loaded from: classes4.dex */
public final class yp6 implements qjb {
    private final Collection<qjb> a;

    /* JADX WARN: Multi-variable type inference failed */
    public yp6(Collection<? extends qjb> collection) {
        z65.h(collection, "traces");
        this.a = collection;
    }

    @Override // defpackage.qjb
    public void start() {
        for (qjb qjbVar : this.a) {
            qjbVar.start();
        }
    }

    @Override // defpackage.qjb
    public void stop() {
        for (qjb qjbVar : this.a) {
            qjbVar.stop();
        }
    }
}
