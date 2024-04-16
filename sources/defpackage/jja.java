package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
/* compiled from: ShoppingCartRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Ljja;", "Lija;", "", "clear", "Llia;", "get", "model", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "localCart", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jja  reason: default package */
/* loaded from: classes4.dex */
public final class jja implements ija {
    private final AtomicReference<lia> a = new AtomicReference<>();

    @Override // defpackage.ija
    public void a(lia liaVar) {
        z65.h(liaVar, "model");
        this.a.set(liaVar);
    }

    @Override // defpackage.ija
    public void clear() {
        this.a.set(null);
    }

    @Override // defpackage.ija
    public lia get() {
        return this.a.get();
    }
}
