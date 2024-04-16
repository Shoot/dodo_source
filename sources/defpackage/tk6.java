package defpackage;

import android.content.Context;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.tmb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.mindbox.dto.CustomerDto;
import ru.dodopizza.mindbox.dto.UserRequestDto;
/* compiled from: MindboxSdk.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\fR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Ltk6;", "", "", "pushToken", "", DateTokenConverter.CONVERTER_KEY, "messageUniqueKey", "buttonUniqueKey", "b", tmb.a.CITY_JSON_NAME, tmb.c.COUNTRY_JSON_NAME, c.a, "Lkotlin/Function1;", "callback", "a", "Landroid/content/Context;", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "mindbox_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: tk6  reason: default package */
/* loaded from: classes4.dex */
public final class tk6 {
    private final Context a;

    /* compiled from: MindboxSdk.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "deviceUuid", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tk6$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<String, Unit> {
        final /* synthetic */ Function1<String, Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super String, Unit> function1) {
            super(1);
            this.a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            z65.h(str, "deviceUuid");
            this.a.invoke(str);
        }
    }

    public tk6(Context context) {
        z65.h(context, "applicationContext");
        this.a = context;
    }

    public final void a(Function1<? super String, Unit> function1) {
        z65.h(function1, "callback");
        mj6.a.a0(new a(function1));
    }

    public final void b(String str, String str2) {
        z65.h(str, "messageUniqueKey");
        z65.h(str2, "buttonUniqueKey");
        mj6.a.T(this.a, str, str2);
    }

    public final void c(String str, String str2) {
        z65.h(str, tmb.a.CITY_JSON_NAME);
        z65.h(str2, tmb.c.COUNTRY_JSON_NAME);
        mj6.a.E(this.a, "Mobile.ChangeRegion2", new UserRequestDto(new CustomerDto(null, null, null, null, null, CustomerDto.AreaDto.Companion.build(str, str2), null, 95, null)));
    }

    public final void d(String str) {
        z65.h(str, "pushToken");
        mj6.a.d0(this.a, str);
    }
}
