package com.google.android.gms.common.api.internal;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.Feature;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class u {
    private final mm a;
    private final Feature b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ u(mm mmVar, Feature feature, yic yicVar) {
        this.a = mmVar;
        this.b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof u)) {
            u uVar = (u) obj;
            if (m57.a(this.a, uVar.a) && m57.a(this.b, uVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return m57.b(this.a, this.b);
    }

    public final String toString() {
        return m57.c(this).a(Action.KEY_ATTRIBUTE, this.a).a("feature", this.b).toString();
    }
}
