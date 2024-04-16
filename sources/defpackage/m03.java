package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
/* compiled from: DerAdapter.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J2\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b0\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"Lm03;", "T", "", "Ln03;", "header", "", "b", "Lo03;", "reader", "a", "(Lo03;)Ljava/lang/Object;", "Lp03;", "writer", "value", "", e.a, "(Lp03;Ljava/lang/Object;)V", "", "tagClass", "", RemoteMessageConst.Notification.TAG, "forceConstructed", "Ld90;", c.a, "(IJLjava/lang/Boolean;)Ld90;", "", Action.NAME_ATTRIBUTE, "", DateTokenConverter.CONVERTER_KEY, "okhttp-tls"}, k = 1, mv = {1, 9, 0})
/* renamed from: m03  reason: default package */
/* loaded from: classes3.dex */
public interface m03<T> {
    T a(o03 o03Var);

    boolean b(n03 n03Var);

    d90<T> c(int i, long j, Boolean bool);

    d90<List<T>> d(String str, int i, long j);

    void e(p03 p03Var, T t);
}
