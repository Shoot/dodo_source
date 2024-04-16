package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u001a\u0010\n\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00038PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u0011"}, d2 = {"Ln95;", "Lv95;", "Lbl1;", "", "c1", "f0", "b", "Z", "p0", "()Z", "handlesException", "q0", "onCancelComplete", "Ll95;", "parent", "<init>", "(Ll95;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: n95  reason: default package */
/* loaded from: classes3.dex */
public class n95 extends v95 implements bl1 {
    private final boolean b;

    public n95(l95 l95Var) {
        super(true);
        w0(l95Var);
        this.b = c1();
    }

    private final boolean c1() {
        z61 z61Var;
        v95 S;
        z61 z61Var2;
        y61 s0 = s0();
        if (s0 instanceof z61) {
            z61Var = (z61) s0;
        } else {
            z61Var = null;
        }
        if (z61Var != null && (S = z61Var.S()) != null) {
            while (!S.p0()) {
                y61 s02 = S.s0();
                if (s02 instanceof z61) {
                    z61Var2 = (z61) s02;
                } else {
                    z61Var2 = null;
                }
                if (z61Var2 != null) {
                    S = z61Var2.S();
                    if (S == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.bl1
    public boolean f0() {
        return C0(Unit.a);
    }

    @Override // defpackage.v95
    public boolean p0() {
        return this.b;
    }

    @Override // defpackage.v95
    public boolean q0() {
        return true;
    }
}
