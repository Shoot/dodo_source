package defpackage;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
/* compiled from: LogTrace.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lix5;", "Lqjb;", "", "start", "stop", "", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "<init>", "(Ljava/lang/String;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ix5  reason: default package */
/* loaded from: classes4.dex */
public final class ix5 implements qjb {
    private final String a;

    public ix5(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        this.a = str;
    }

    @Override // defpackage.qjb
    public void start() {
        qgb.a(this.a, true);
    }

    @Override // defpackage.qjb
    public void stop() {
        qgb.b(this.a);
    }
}
