package defpackage;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: nad  reason: default package */
/* loaded from: classes2.dex */
final class nad extends pbd {
    final /* synthetic */ uad h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nad(uad uadVar, ybd ybdVar, CharSequence charSequence) {
        super(ybdVar, charSequence);
        this.h = uadVar;
    }

    @Override // defpackage.pbd
    final int c(int i) {
        return i + 1;
    }

    @Override // defpackage.pbd
    final int e(int i) {
        k6d k6dVar = this.h.a;
        CharSequence charSequence = this.c;
        int length = charSequence.length();
        fad.a(i, length, "index");
        while (i < length) {
            if (!k6dVar.a(charSequence.charAt(i))) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }
}
