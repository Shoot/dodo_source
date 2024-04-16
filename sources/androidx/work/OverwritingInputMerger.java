package androidx.work;

import androidx.annotation.NonNull;
import androidx.work.b;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends p35 {
    @Override // defpackage.p35
    @NonNull
    public b b(@NonNull List<b> list) {
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        for (b bVar : list) {
            hashMap.putAll(bVar.l());
        }
        aVar.d(hashMap);
        return aVar.a();
    }
}
