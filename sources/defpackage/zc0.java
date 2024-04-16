package defpackage;
/* compiled from: BlockContent.java */
/* renamed from: zc0  reason: default package */
/* loaded from: classes3.dex */
class zc0 {
    private int b = 0;
    private final StringBuilder a = new StringBuilder();

    public void a(CharSequence charSequence) {
        if (this.b != 0) {
            this.a.append('\n');
        }
        this.a.append(charSequence);
        this.b++;
    }

    public String b() {
        return this.a.toString();
    }
}
