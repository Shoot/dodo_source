package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.ym;
import kotlin.Metadata;
/* compiled from: AssistantWelcomeDataInteractor.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Low;", "", "", "b", "menuItemId", "", "isHeroProduct", "Lym$d;", "fromScreen", "Lnw;", "a", "Lah6;", "Lah6;", "menuService", "Li00;", "Li00;", "authorizationState", "Lt52;", c.a, "Lt52;", "customerService", "Lf8c;", DateTokenConverter.CONVERTER_KEY, "Lf8c;", "workflowIdProvider", "<init>", "(Lah6;Li00;Lt52;Lf8c;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ow  reason: default package */
/* loaded from: classes4.dex */
public final class ow {
    private final ah6 a;
    private final i00 b;
    private final t52 c;
    private final f8c d;

    public ow(ah6 ah6Var, i00 i00Var, t52 t52Var, f8c f8cVar) {
        z65.h(ah6Var, "menuService");
        z65.h(i00Var, "authorizationState");
        z65.h(t52Var, "customerService");
        z65.h(f8cVar, "workflowIdProvider");
        this.a = ah6Var;
        this.b = i00Var;
        this.c = t52Var;
        this.d = f8cVar;
    }

    private final String b() {
        if (!this.b.b()) {
            return null;
        }
        return this.c.f().h();
    }

    public final nw a(String str, boolean z, ym.d dVar) {
        z65.h(str, "menuItemId");
        z65.h(dVar, "fromScreen");
        qd6 a = this.a.a(str);
        if (a != null) {
            return new nw(new ss(b(), str, a.i(), a.k(), this.d.b(), lx9.a(dVar), z));
        }
        throw new IllegalArgumentException(("Assistant menu item not found (id: " + str + ")").toString());
    }
}
