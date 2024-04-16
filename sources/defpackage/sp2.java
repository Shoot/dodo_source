package defpackage;

import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
/* compiled from: DefaultExtension.java */
/* renamed from: sp2  reason: default package */
/* loaded from: classes3.dex */
public class sp2 implements tr4 {
    @Override // defpackage.tr4
    public tr4 a() {
        return new sp2();
    }

    @Override // defpackage.tr4
    public boolean b(String str) {
        return true;
    }

    @Override // defpackage.tr4
    public String c() {
        return "";
    }

    @Override // defpackage.tr4
    public void d(i74 i74Var) throws InvalidDataException {
        if (!i74Var.a() && !i74Var.b() && !i74Var.d()) {
            return;
        }
        throw new InvalidFrameException("bad rsv RSV1: " + i74Var.a() + " RSV2: " + i74Var.b() + " RSV3: " + i74Var.d());
    }

    @Override // defpackage.tr4
    public boolean e(String str) {
        return true;
    }

    public boolean equals(Object obj) {
        if (this != obj && (obj == null || getClass() != obj.getClass())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.tr4
    public String h() {
        return "";
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    @Override // defpackage.tr4
    public String toString() {
        return getClass().getSimpleName();
    }

    @Override // defpackage.tr4
    public void reset() {
    }

    @Override // defpackage.tr4
    public void f(i74 i74Var) {
    }

    @Override // defpackage.tr4
    public void g(i74 i74Var) throws InvalidDataException {
    }
}
