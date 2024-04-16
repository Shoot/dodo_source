package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.addresslist.AddressListPresenter;
/* compiled from: AddressListComponent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0003J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lo8;", "", "Lru/dodopizza/app/presentation/addresslist/AddressListPresenter;", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: o8  reason: default package */
/* loaded from: classes3.dex */
public interface o8 {

    /* compiled from: AddressListComponent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0004\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\b\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH'J\b\u0010\r\u001a\u00020\fH&¨\u0006\u000e"}, d2 = {"Lo8$a;", "", "Lf63;", "router", "b", "Lcl2;", "Ln8;", "dataSet", c.a, "Ls8;", "args", DateTokenConverter.CONVERTER_KEY, "Lo8;", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: o8$a */
    /* loaded from: classes3.dex */
    public interface a {
        o8 a();

        a b(f63 f63Var);

        a c(cl2<n8> cl2Var);

        a d(s8 s8Var);
    }

    AddressListPresenter a();
}
