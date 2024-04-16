package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.tmb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.mindbox.MindboxSdkApi;
import ru.dodopizza.mindbox.model.MindboxProperties;
import ru.dodopizza.mindbox.model.User;
/* compiled from: MindboxSdkServiceImpl.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007BG\b\u0007\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006'"}, d2 = {"Lyk6;", "Lcl6;", "Lru/dodopizza/mindbox/model/MindboxProperties;", e.a, "", "pushToken", "", "a", "Lru/dodopizza/mindbox/model/User;", "user", DateTokenConverter.CONVERTER_KEY, "messageUniqueKey", "buttonUniqueKey", c.a, tmb.a.CITY_JSON_NAME, tmb.c.COUNTRY_JSON_NAME, "b", "Loj6;", "Loj6;", "credentials", "Ljava/lang/String;", "Ltk6;", "Ltk6;", "mindboxSdk", "Lwk6;", "Lwk6;", "repository", "Lmh0;", "f", "Lmh0;", "buildInfo", "Lru/dodopizza/mindbox/MindboxSdkApi;", "g", "Lru/dodopizza/mindbox/MindboxSdkApi;", "sdkApi", "Luk6;", "mindboxSdkApiFactory", "<init>", "(Loj6;Ljava/lang/String;Ljava/lang/String;Luk6;Ltk6;Lwk6;Lmh0;)V", "mindbox_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yk6  reason: default package */
/* loaded from: classes4.dex */
public final class yk6 implements cl6 {
    private final oj6 a;
    private final String b;
    private final String c;
    private final tk6 d;
    private final wk6 e;
    private final mh0 f;
    private final MindboxSdkApi g;

    /* compiled from: MindboxSdkServiceImpl.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lyk6$a;", "", "Loj6;", "credentials", "", tmb.c.COUNTRY_JSON_NAME, tmb.a.CITY_JSON_NAME, "Lyk6;", "a", "mindbox_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: yk6$a */
    /* loaded from: classes4.dex */
    public interface a {
        yk6 a(oj6 oj6Var, String str, String str2);
    }

    /* compiled from: MindboxSdkServiceImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "deviceUuid", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yk6$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<String, Unit> {
        final /* synthetic */ User b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(User user) {
            super(1);
            this.b = user;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            z65.h(str, "deviceUuid");
            MindboxSdkApi mindboxSdkApi = yk6.this.g;
            String e = yk6.this.a.e();
            String d = yk6.this.a.d();
            String str2 = yk6.this.b;
            mindboxSdkApi.registerUser(e, str, mw1.a(this.b, d, yk6.this.c, str2));
        }
    }

    public yk6(oj6 oj6Var, String str, String str2, uk6 uk6Var, tk6 tk6Var, wk6 wk6Var, mh0 mh0Var) {
        z65.h(oj6Var, "credentials");
        z65.h(str, tmb.c.COUNTRY_JSON_NAME);
        z65.h(str2, tmb.a.CITY_JSON_NAME);
        z65.h(uk6Var, "mindboxSdkApiFactory");
        z65.h(tk6Var, "mindboxSdk");
        z65.h(wk6Var, "repository");
        z65.h(mh0Var, "buildInfo");
        this.a = oj6Var;
        this.b = str;
        this.c = str2;
        this.d = tk6Var;
        this.e = wk6Var;
        this.f = mh0Var;
        this.g = uk6Var.a(oj6Var);
    }

    @Override // defpackage.cl6
    public void a(String str) {
        z65.h(str, "pushToken");
        this.d.d(str);
    }

    @Override // defpackage.cl6
    public void b(String str, String str2) {
        z65.h(str, tmb.a.CITY_JSON_NAME);
        z65.h(str2, tmb.c.COUNTRY_JSON_NAME);
        this.d.c(str, str2);
    }

    @Override // defpackage.cl6
    public void c(String str, String str2) {
        z65.h(str, "messageUniqueKey");
        z65.h(str2, "buttonUniqueKey");
        this.d.b(str, str2);
    }

    @Override // defpackage.cl6
    public void d(User user) {
        z65.h(user, "user");
        this.d.a(new b(user));
    }

    @Override // defpackage.cl6
    public MindboxProperties e() {
        String c = this.a.c();
        return new MindboxProperties(c, this.a.e(), this.e.a(c), !this.f.j());
    }
}
