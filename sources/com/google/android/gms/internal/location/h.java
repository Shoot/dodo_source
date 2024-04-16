package com.google.android.gms.internal.location;

import android.location.Location;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
final class h extends erc {
    private final com.google.android.gms.common.api.internal.d<vv5> a;

    @Override // defpackage.grc
    public final synchronized void H(Location location) {
        this.a.c(new g(this, location));
    }
}
