package defpackage;

import com.google.i18n.phonenumbers.c;
/* compiled from: CompositeMetadataContainer.java */
/* renamed from: yn1  reason: default package */
/* loaded from: classes.dex */
final class yn1 implements pi6 {
    private final b66<Integer> a = b66.b();
    private final b66<String> b = b66.c();

    @Override // defpackage.pi6
    public void a(c cVar) {
        if (ge4.b(this.b.d().a(cVar))) {
            this.b.a(cVar);
        } else {
            this.a.a(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c b(int i) {
        return this.a.e(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c c(String str) {
        return this.b.e(str);
    }
}
