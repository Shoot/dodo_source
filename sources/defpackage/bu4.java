package defpackage;
/* compiled from: Image.java */
/* renamed from: bu4  reason: default package */
/* loaded from: classes3.dex */
public class bu4 extends jz6 {
    private String f;
    private String g;

    public bu4() {
    }

    @Override // defpackage.jz6
    public void a(w1c w1cVar) {
        w1cVar.D(this);
    }

    @Override // defpackage.jz6
    protected String k() {
        return "destination=" + this.f + ", title=" + this.g;
    }

    public String m() {
        return this.f;
    }

    public bu4(String str, String str2) {
        this.f = str;
        this.g = str2;
    }
}
