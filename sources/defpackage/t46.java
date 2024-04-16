package defpackage;

import kotlin.Metadata;
/* compiled from: MainCoroutineDispatcher.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0005R\u0014\u0010\u0007\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lt46;", "Lkx1;", "", "toString", "q0", "p0", "()Lt46;", "immediate", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: t46  reason: default package */
/* loaded from: classes3.dex */
public abstract class t46 extends kx1 {
    public abstract t46 p0();

    /* JADX INFO: Access modifiers changed from: protected */
    public final String q0() {
        t46 t46Var;
        t46 c = v33.c();
        if (this == c) {
            return "Dispatchers.Main";
        }
        try {
            t46Var = c.p0();
        } catch (UnsupportedOperationException unused) {
            t46Var = null;
        }
        if (this != t46Var) {
            return null;
        }
        return "Dispatchers.Main.immediate";
    }

    @Override // defpackage.kx1
    public String toString() {
        String q0 = q0();
        if (q0 == null) {
            return jo2.a(this) + '@' + jo2.b(this);
        }
        return q0;
    }
}
