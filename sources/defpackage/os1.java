package defpackage;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: ContactsInfoConverter.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ$\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Los1;", "Lns1;", "", "isAuthorised", "nativeChatEnabled", "Lkotlin/Function1;", "Lcom/dodopizza/profile/feature/profilesettings/presentation/a;", "Las1;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: os1  reason: default package */
/* loaded from: classes4.dex */
public final class os1 implements ns1 {

    /* compiled from: ContactsInfoConverter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/profile/feature/profilesettings/presentation/a;", "contactInfoData", "Las1;", "a", "(Lcom/dodopizza/profile/feature/profilesettings/presentation/a;)Las1;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: os1$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<com.dodopizza.profile.feature.profilesettings.presentation.a, as1> {
        final /* synthetic */ boolean a;
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z, boolean z2) {
            super(1);
            this.a = z;
            this.b = z2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final as1 invoke(com.dodopizza.profile.feature.profilesettings.presentation.a aVar) {
            String str;
            boolean z;
            boolean y;
            z65.h(aVar, "contactInfoData");
            bqa[] values = bqa.values();
            ArrayList arrayList = new ArrayList();
            for (bqa bqaVar : values) {
                if (dqa.b(dqa.a(aVar, bqaVar))) {
                    arrayList.add(bqaVar);
                }
            }
            if (this.a) {
                str = aVar.d();
            } else {
                str = "";
            }
            String str2 = str;
            if (aVar.h().length() > 0 || str2.length() > 0 || this.b) {
                z = true;
            } else {
                z = false;
            }
            com.dodopizza.profile.feature.profilesettings.presentation.a c = com.dodopizza.profile.feature.profilesettings.presentation.a.c(aVar, null, str2, null, null, null, null, null, null, null, 509, null);
            boolean z2 = this.b;
            y = l0b.y(aVar.i());
            return new as1(c, z, arrayList, z2, !y, !aVar.g().isEmpty());
        }
    }

    @Override // defpackage.ns1
    public Function1<com.dodopizza.profile.feature.profilesettings.presentation.a, as1> a(boolean z, boolean z2) {
        return new a(z, z2);
    }
}
