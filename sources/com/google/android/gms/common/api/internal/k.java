package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class k implements n77 {
    final /* synthetic */ a7b a;
    final /* synthetic */ l b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(l lVar, a7b a7bVar) {
        this.b = lVar;
        this.a = a7bVar;
    }

    @Override // defpackage.n77
    public final void a(@NonNull y6b y6bVar) {
        Map map;
        map = this.b.b;
        map.remove(this.a);
    }
}
