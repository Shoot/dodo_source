package defpackage;

import defpackage.h53;
import java.io.IOException;
/* compiled from: DataNode.java */
/* renamed from: al2  reason: default package */
/* loaded from: classes3.dex */
public class al2 extends io5 {
    public al2(String str) {
        this.d = str;
    }

    @Override // defpackage.kz6
    void C(Appendable appendable, int i, h53.a aVar) throws IOException {
        appendable.append(a0());
    }

    @Override // defpackage.kz6
    /* renamed from: Z */
    public al2 m() {
        return (al2) super.clone();
    }

    public String a0() {
        return V();
    }

    @Override // defpackage.io5, defpackage.kz6
    public /* bridge */ /* synthetic */ String b(String str) {
        return super.b(str);
    }

    @Override // defpackage.io5, defpackage.kz6
    public /* bridge */ /* synthetic */ String e(String str) {
        return super.e(str);
    }

    @Override // defpackage.io5, defpackage.kz6
    public /* bridge */ /* synthetic */ String g() {
        return super.g();
    }

    @Override // defpackage.io5, defpackage.kz6
    public /* bridge */ /* synthetic */ int j() {
        return super.j();
    }

    @Override // defpackage.io5, defpackage.kz6
    public /* bridge */ /* synthetic */ kz6 p() {
        return super.p();
    }

    @Override // defpackage.kz6
    public String toString() {
        return A();
    }

    @Override // defpackage.kz6
    public String y() {
        return "#data";
    }

    @Override // defpackage.kz6
    void D(Appendable appendable, int i, h53.a aVar) {
    }
}
