package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
/* compiled from: HotAndReadyService.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\bH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH&¨\u0006\u000e"}, d2 = {"Lgp4;", "", "", "pizzeriaId", "", LocalityEntity.FIELD_COUNTRY_CODE, "", DateTokenConverter.CONVERTER_KEY, "", e.a, "b", "Lbp4;", "a", c.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gp4  reason: default package */
/* loaded from: classes4.dex */
public interface gp4 {
    List<bp4> a();

    List<String> b();

    List<bp4> c();

    void d(String str, int i);

    List<String> e();
}
