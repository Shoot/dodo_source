package defpackage;

import defpackage.sm6;
import kotlin.Metadata;
/* compiled from: InnerNodeCoordinator.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lh6b;", "Lsm6$c;", "", "toString", "", "P0", "Q0", "", "n", "Z", "f1", "()Z", "setAttachHasBeenRun", "(Z)V", "attachHasBeenRun", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: h6b  reason: default package */
/* loaded from: classes.dex */
public final class h6b extends sm6.c {
    private boolean n;

    public h6b() {
        V0(0);
    }

    @Override // defpackage.sm6.c
    public void P0() {
        this.n = true;
    }

    @Override // defpackage.sm6.c
    public void Q0() {
        this.n = false;
    }

    public final boolean f1() {
        return this.n;
    }

    public String toString() {
        return "<tail>";
    }
}
