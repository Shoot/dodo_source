package defpackage;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: tmc  reason: default package */
/* loaded from: classes2.dex */
public final class tmc implements dv1 {
    final /* synthetic */ Collection a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public tmc(Collection collection) {
        this.a = collection;
    }

    @Override // defpackage.dv1
    public final /* bridge */ /* synthetic */ Object a(@NonNull y6b y6bVar) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a);
        return o7b.e(arrayList);
    }
}
