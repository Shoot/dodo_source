package defpackage;

import cloud.mindbox.mobile_sdk.models.EventType;
import defpackage.tx4;
import kotlin.Metadata;
/* compiled from: InAppEventManagerImpl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lsx4;", "Lrx4;", "Ltx4;", "event", "", "a", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: sx4  reason: default package */
/* loaded from: classes.dex */
public final class sx4 implements rx4 {
    @Override // defpackage.rx4
    public boolean a(tx4 tx4Var) {
        z65.h(tx4Var, "event");
        if (!(tx4Var instanceof tx4.a)) {
            if (tx4Var instanceof tx4.b) {
                tx4.b bVar = (tx4.b) tx4Var;
                if ((bVar.getEventType() instanceof EventType.g) || (bVar.getEventType() instanceof EventType.d)) {
                }
            }
            return false;
        }
        return true;
    }
}
