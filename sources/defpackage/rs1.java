package defpackage;

import kotlin.Metadata;
import ru.dodopizza.app.presentation.contacts.ContactsPresenter;
/* compiled from: ContactsModule.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ`\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007J\b\u0010\u001a\u001a\u00020\u0010H\u0007¨\u0006\u001d"}, d2 = {"Lrs1;", "", "Lf63;", "router", "Li00;", "authorizationState", "Lk63;", "domainEvents", "Lps1;", "contactsInteractor", "Lwg6;", "menuRefreshInteractor", "Ldf4;", "getDataAvailabilityInteractor", "Lgc;", "analytics", "Lns1;", "contactsInfoConverter", "Lzt6;", "nativeChatUnreadMessagesCount", "Lwt6;", "nativeChatStateChecker", "Lhq3;", "featureService", "Lru/dodopizza/app/presentation/contacts/ContactsPresenter;", "b", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: rs1  reason: default package */
/* loaded from: classes3.dex */
public final class rs1 {
    public static final rs1 a = new rs1();

    private rs1() {
    }

    public final ns1 a() {
        return new os1();
    }

    public final ContactsPresenter b(f63 f63Var, i00 i00Var, k63 k63Var, ps1 ps1Var, wg6 wg6Var, df4 df4Var, gc gcVar, ns1 ns1Var, zt6 zt6Var, wt6 wt6Var, hq3 hq3Var) {
        z65.h(f63Var, "router");
        z65.h(i00Var, "authorizationState");
        z65.h(k63Var, "domainEvents");
        z65.h(ps1Var, "contactsInteractor");
        z65.h(wg6Var, "menuRefreshInteractor");
        z65.h(df4Var, "getDataAvailabilityInteractor");
        z65.h(gcVar, "analytics");
        z65.h(ns1Var, "contactsInfoConverter");
        z65.h(zt6Var, "nativeChatUnreadMessagesCount");
        z65.h(wt6Var, "nativeChatStateChecker");
        z65.h(hq3Var, "featureService");
        return new ContactsPresenter(f63Var, i00Var, k63Var, ps1Var, wg6Var, df4Var, ns1Var, gcVar, zt6Var, hq3Var, wt6Var);
    }
}
