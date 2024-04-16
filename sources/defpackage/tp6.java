package defpackage;

import defpackage.ml;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: MultiParagraphIntrinsics.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a4\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¨\u0006\u0007"}, d2 = {"", "Lml$a;", "Ljb8;", "", "start", "end", "b", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: tp6  reason: default package */
/* loaded from: classes.dex */
public final class tp6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<ml.a<jb8>> b(List<ml.a<jb8>> list, int i, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ml.a<jb8> aVar = list.get(i3);
            ml.a<jb8> aVar2 = aVar;
            if (nl.f(i, i2, aVar2.f(), aVar2.d())) {
                arrayList.add(aVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ml.a aVar3 = (ml.a) arrayList.get(i4);
            if (i <= aVar3.f() && aVar3.d() <= i2) {
                arrayList2.add(new ml.a(aVar3.e(), aVar3.f() - i, aVar3.d() - i));
            } else {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
            }
        }
        return arrayList2;
    }
}
