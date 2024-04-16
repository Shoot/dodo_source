package defpackage;

import kotlin.Metadata;
/* compiled from: LockFreeLinkedList.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\f"}, d2 = {"Ljw5;", "Llw5;", "", "S", "", "R", "()Z", "isEmpty", "K", "isRemoved", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: jw5  reason: default package */
/* loaded from: classes3.dex */
public class jw5 extends lw5 {
    @Override // defpackage.lw5
    public boolean K() {
        return false;
    }

    @Override // defpackage.lw5
    public /* bridge */ /* synthetic */ boolean M() {
        return ((Boolean) S()).booleanValue();
    }

    public final boolean R() {
        if (E() == this) {
            return true;
        }
        return false;
    }

    public final Void S() {
        throw new IllegalStateException("head cannot be removed".toString());
    }
}
