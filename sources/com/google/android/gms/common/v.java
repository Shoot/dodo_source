package com.google.android.gms.common;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
final class v extends w {
    private final Callable f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ v(Callable callable, sad sadVar) {
        super();
        this.f = callable;
    }

    @Override // com.google.android.gms.common.w
    final String a() {
        try {
            return (String) this.f.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
