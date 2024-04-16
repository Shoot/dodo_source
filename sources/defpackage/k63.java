package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: DomainEvents.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H&J\u0014\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H&¨\u0006\r"}, d2 = {"Lk63;", "", "Loz3;", "Lj63;", c.a, "Lkl8;", e.a, DateTokenConverter.CONVERTER_KEY, "productCategory", "", "a", "domainEvent", "b", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: k63  reason: default package */
/* loaded from: classes.dex */
public interface k63 {

    /* compiled from: DomainEvents.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k63$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ void a(k63 k63Var, kl8 kl8Var, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    kl8Var = null;
                }
                k63Var.a(kl8Var);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyMenuChanged");
        }
    }

    void a(kl8 kl8Var);

    void b(j63 j63Var);

    oz3<j63> c();

    oz3<kl8> d();

    oz3<kl8> e();
}
