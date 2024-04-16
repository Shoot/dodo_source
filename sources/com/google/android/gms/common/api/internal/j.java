package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import defpackage.sx7;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class j implements sx7.a {
    final /* synthetic */ BasePendingResult a;
    final /* synthetic */ l b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(l lVar, BasePendingResult basePendingResult) {
        this.b = lVar;
        this.a = basePendingResult;
    }

    @Override // defpackage.sx7.a
    public final void a(Status status) {
        Map map;
        map = this.b.a;
        map.remove(this.a);
    }
}
