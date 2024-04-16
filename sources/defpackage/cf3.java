package defpackage;

import defpackage.et7;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.adapter.EmailForCheckVH;
/* compiled from: EmailForCheckBinder.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0015\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J.\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcf3;", "Loyb;", "Lru/dodopizza/app/presentation/checkout/paymentwaylist/adapter/EmailForCheckVH;", "Let7$b;", "view", "data", "", "position", "", "g", "", "", "changes", "f", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "onClick", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: cf3  reason: default package */
/* loaded from: classes4.dex */
public final class cf3 extends oyb<EmailForCheckVH, et7.b> {
    public static final a b = new a(null);
    private final Function0<Unit> a;

    /* compiled from: EmailForCheckBinder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcf3$a;", "", "", "EMAIL_CHANGED", "Ljava/lang/String;", "LOADING_CHANGED", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: cf3$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public cf3(Function0<Unit> function0) {
        z65.h(function0, "onClick");
        this.a = function0;
    }

    @Override // defpackage.oyb
    /* renamed from: f */
    public void a(EmailForCheckVH emailForCheckVH, et7.b bVar, int i, List<? extends Object> list) {
        z65.h(emailForCheckVH, "view");
        z65.h(bVar, "data");
        z65.h(list, "changes");
        if (list.contains("loading_changed")) {
            emailForCheckVH.setLoading(bVar.c());
        }
        if (list.contains("email_changed")) {
            emailForCheckVH.setEmail(bVar.b());
        }
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(EmailForCheckVH emailForCheckVH, et7.b bVar, int i) {
        z65.h(emailForCheckVH, "view");
        z65.h(bVar, "data");
        emailForCheckVH.setEmail(bVar.b());
        emailForCheckVH.setOnClickListener(this.a);
        emailForCheckVH.setLoading(bVar.c());
    }
}
