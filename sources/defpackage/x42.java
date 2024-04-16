package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: CustomerAddressService.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\u0016\u0010\u000e\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fH&J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0007H&J\b\u0010\u0013\u001a\u00020\u0012H&J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H&¨\u0006\u0017"}, d2 = {"Lx42;", "", "", "Lou2;", "getAll", "Le91;", "clientDeliveryLocation", "", "a", "Lw6;", "address", e.a, "", "deliverablePlaces", "b", "deliverablePlace", "f", c.a, "", "g", "", "id", DateTokenConverter.CONVERTER_KEY, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: x42  reason: default package */
/* loaded from: classes4.dex */
public interface x42 {
    void a(e91 e91Var);

    void b(List<? extends ou2> list);

    void c();

    w6 d(String str);

    w6 e(w6 w6Var);

    void f(ou2 ou2Var);

    boolean g();

    Collection<ou2> getAll();
}
