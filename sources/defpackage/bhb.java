package defpackage;

import ch.qos.logback.core.joran.action.Action;
import java.util.Timer;
import kotlin.Metadata;
/* compiled from: Timer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¨\u0006\u0006"}, d2 = {"", Action.NAME_ATTRIBUTE, "", "daemon", "Ljava/util/Timer;", "a", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
/* renamed from: bhb  reason: default package */
/* loaded from: classes3.dex */
public final class bhb {
    public static final Timer a(String str, boolean z) {
        if (str == null) {
            return new Timer(z);
        }
        return new Timer(str, z);
    }
}
