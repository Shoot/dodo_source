package defpackage;
/* compiled from: Block.java */
/* renamed from: wc0  reason: default package */
/* loaded from: classes3.dex */
public abstract class wc0 extends jz6 {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jz6
    public void j(jz6 jz6Var) {
        if (jz6Var instanceof wc0) {
            super.j(jz6Var);
            return;
        }
        throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
    }

    @Override // defpackage.jz6
    /* renamed from: m */
    public wc0 f() {
        return (wc0) super.f();
    }
}
