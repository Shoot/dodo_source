package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: RemoteConfig.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0007H&J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH&¨\u0006\u0010"}, d2 = {"Lzc9;", "", "", Action.KEY_ATTRIBUTE, "a", "", "b", "", "f", c.a, "", "g", e.a, "", "cacheExpirationTime", DateTokenConverter.CONVERTER_KEY, "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zc9  reason: default package */
/* loaded from: classes4.dex */
public interface zc9 {
    String a(String str);

    boolean b(String str);

    Map<String, String> c();

    void d(long j);

    boolean e();

    Map<String, Boolean> f();

    void g();
}
