package defpackage;

import android.content.Context;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: PreferenceDataStoreDelegate.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001BI\b\u0000\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r\u0012\u001e\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00130\u00120\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b!\u0010\"J#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00022\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0096\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR,\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00130\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lyh8;", "Lk79;", "Landroid/content/Context;", "Lnl2;", "Lbi8;", "thisRef", "Lje5;", "property", DateTokenConverter.CONVERTER_KEY, "", "a", "Ljava/lang/String;", Action.NAME_ATTRIBUTE, "Lng9;", "b", "Lng9;", "corruptionHandler", "Lkotlin/Function1;", "", "Lwk2;", c.a, "Lkotlin/jvm/functions/Function1;", "produceMigrations", "Lqx1;", "Lqx1;", Action.SCOPE_ATTRIBUTE, "", e.a, "Ljava/lang/Object;", "lock", "f", "Lnl2;", "INSTANCE", "<init>", "(Ljava/lang/String;Lng9;Lkotlin/jvm/functions/Function1;Lqx1;)V", "datastore-preferences_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: yh8  reason: default package */
/* loaded from: classes.dex */
public final class yh8 implements k79<Context, nl2<bi8>> {
    private final String a;
    private final ng9<bi8> b;
    private final Function1<Context, List<wk2<bi8>>> c;
    private final qx1 d;
    private final Object e;
    private volatile nl2<bi8> f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PreferenceDataStoreDelegate.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/io/File;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: yh8$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function0<File> {
        final /* synthetic */ Context a;
        final /* synthetic */ yh8 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, yh8 yh8Var) {
            super(0);
            this.a = context;
            this.b = yh8Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final File invoke() {
            Context context = this.a;
            z65.g(context, "applicationContext");
            return xh8.a(context, this.b.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yh8(String str, ng9<bi8> ng9Var, Function1<? super Context, ? extends List<? extends wk2<bi8>>> function1, qx1 qx1Var) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(function1, "produceMigrations");
        z65.h(qx1Var, Action.SCOPE_ATTRIBUTE);
        this.a = str;
        this.b = ng9Var;
        this.c = function1;
        this.d = qx1Var;
        this.e = new Object();
    }

    @Override // defpackage.k79
    /* renamed from: d */
    public nl2<bi8> a(Context context, je5<?> je5Var) {
        nl2<bi8> nl2Var;
        z65.h(context, "thisRef");
        z65.h(je5Var, "property");
        nl2<bi8> nl2Var2 = this.f;
        if (nl2Var2 == null) {
            synchronized (this.e) {
                try {
                    if (this.f == null) {
                        Context applicationContext = context.getApplicationContext();
                        wh8 wh8Var = wh8.a;
                        ng9<bi8> ng9Var = this.b;
                        Function1<Context, List<wk2<bi8>>> function1 = this.c;
                        z65.g(applicationContext, "applicationContext");
                        this.f = wh8Var.a(ng9Var, function1.invoke(applicationContext), this.d, new a(applicationContext, this));
                    }
                    nl2Var = this.f;
                    z65.e(nl2Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return nl2Var;
        }
        return nl2Var2;
    }
}
