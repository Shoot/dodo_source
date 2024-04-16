package defpackage;

import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: SocialNetworkLinkUtils.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/dodopizza/profile/feature/profilesettings/presentation/a;", "contactInfoData", "Lbqa;", "socialNetwork", "", "a", ElementGenerator.TYPE_LINK, "", "b", "app_prodRelease"}, k = 2, mv = {1, 9, 0})
/* renamed from: dqa  reason: default package */
/* loaded from: classes4.dex */
public final class dqa {

    /* compiled from: SocialNetworkLinkUtils.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dqa$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[bqa.values().length];
            try {
                iArr[bqa.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bqa.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[bqa.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[bqa.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[bqa.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String a(com.dodopizza.profile.feature.profilesettings.presentation.a aVar, bqa bqaVar) {
        z65.h(aVar, "contactInfoData");
        z65.h(bqaVar, "socialNetwork");
        int i = a.$EnumSwitchMapping$0[bqaVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return aVar.j();
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return aVar.l();
                }
                return aVar.f();
            }
            return aVar.e();
        }
        return aVar.k();
    }

    public static final boolean b(String str) {
        z65.h(str, ElementGenerator.TYPE_LINK);
        if (str.length() > 0) {
            return true;
        }
        return false;
    }
}
