package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Leg3;", "Lc05;", "", "toString", "", "a", "Z", "b", "()Z", "isActive", "Lsz6;", DateTokenConverter.CONVERTER_KEY, "()Lsz6;", StatisticManager.LIST, "<init>", "(Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: eg3  reason: default package */
/* loaded from: classes3.dex */
public final class eg3 implements c05 {
    private final boolean a;

    public eg3(boolean z) {
        this.a = z;
    }

    @Override // defpackage.c05
    public boolean b() {
        return this.a;
    }

    @Override // defpackage.c05
    public sz6 d() {
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        if (b()) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }
}
