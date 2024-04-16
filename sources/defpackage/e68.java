package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.phonenumberlogin.e;
/* compiled from: PinCodeLoginComponent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Le68;", "", "Lru/dodopizza/app/presentation/pincodelogin/a;", "fragment", "", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: e68  reason: default package */
/* loaded from: classes3.dex */
public interface e68 {

    /* compiled from: PinCodeLoginComponent.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0004\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0012\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'J\u0012\u0010\t\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\u0007H'J\b\u0010\u000b\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Le68$a;", "", "", "phoneNumber", DateTokenConverter.CONVERTER_KEY, "formattedPhoneNumber", "b", "Lru/dodopizza/app/presentation/phonenumberlogin/e$a;", CoreConstants.CONTEXT_SCOPE_VALUE, c.a, "Le68;", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e68$a */
    /* loaded from: classes3.dex */
    public interface a {
        e68 a();

        a b(String str);

        a c(e.a aVar);

        a d(String str);
    }

    void a(ru.dodopizza.app.presentation.pincodelogin.a aVar);
}
