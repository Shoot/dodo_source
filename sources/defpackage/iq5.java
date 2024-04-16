package defpackage;
/* compiled from: Link.java */
/* renamed from: iq5  reason: default package */
/* loaded from: classes3.dex */
public class iq5 extends jz6 {
    private String f;
    private String g;

    public iq5() {
    }

    @Override // defpackage.jz6
    public void a(w1c w1cVar) {
        w1cVar.m(this);
    }

    @Override // defpackage.jz6
    protected String k() {
        return "destination=" + this.f + ", title=" + this.g;
    }

    public String m() {
        return this.f;
    }

    public iq5(String str, String str2) {
        this.f = str;
        this.g = str2;
    }
}
