package defpackage;
/* renamed from: xac  reason: default package */
/* loaded from: classes3.dex */
public class xac implements x69 {
    private final x69 a;
    private vac b;

    public xac(x69 x69Var) {
        this.a = x69Var;
    }

    @Override // defpackage.x69
    public void a(v71 v71Var, byte[] bArr, int i) {
        wac wacVar = (wac) v71Var;
        this.a.init(this.b.a());
        this.a.a(wacVar.a(), bArr, i);
        this.a.init(this.b.b());
        this.a.a(wacVar.b(), bArr, i + this.a.b());
    }

    @Override // defpackage.x69
    public int b() {
        return this.a.b() * 2;
    }

    @Override // defpackage.x69
    public void init(v71 v71Var) {
        this.b = (vac) v71Var;
    }
}
