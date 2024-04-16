package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: RemoteConfigService.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\tH&J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tH&¨\u0006\f"}, d2 = {"Lld9;", "", "", e.a, "", Action.KEY_ATTRIBUTE, "", "b", "a", "", c.a, DateTokenConverter.CONVERTER_KEY, "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ld9  reason: default package */
/* loaded from: classes4.dex */
public interface ld9 {
    String a(String str);

    boolean b(String str);

    Map<String, Boolean> c();

    Map<String, String> d();

    void e();
}
