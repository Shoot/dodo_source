package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: FavoritesAnalytics.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\t"}, d2 = {"Lpp3;", "", "Lbc;", "Lmp3;", KustoStorage.KustoTable.COLUMN_SOURCE, "b", "<init>", "()V", "a", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pp3  reason: default package */
/* loaded from: classes4.dex */
public final class pp3 {
    public static final pp3 a = new pp3();

    /* compiled from: FavoritesAnalytics.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lpp3$a;", "Ldc;", "Lqc;", "a", "Lqd6;", "Lqd6;", "getMenuItem", "()Lqd6;", "menuItem", "", "Ltja;", "b", "Ljava/util/Collection;", "getShoppingItems", "()Ljava/util/Collection;", "shoppingItems", "", c.a, "I", "getPosition", "()I", "position", "Lmp3;", DateTokenConverter.CONVERTER_KEY, "Lmp3;", "getSource", "()Lmp3;", KustoStorage.KustoTable.COLUMN_SOURCE, "<init>", "(Lqd6;Ljava/util/Collection;ILmp3;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pp3$a */
    /* loaded from: classes4.dex */
    public static final class a implements dc {
        private final qd6 a;
        private final Collection<tja> b;
        private final int c;
        private final mp3 d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(qd6 qd6Var, Collection<? extends tja> collection, int i, mp3 mp3Var) {
            z65.h(qd6Var, "menuItem");
            z65.h(collection, "shoppingItems");
            z65.h(mp3Var, KustoStorage.KustoTable.COLUMN_SOURCE);
            this.a = qd6Var;
            this.b = collection;
            this.c = i;
            this.d = mp3Var;
        }

        @Override // defpackage.dc
        public qc a() {
            return vc.i(bc.e(pp3.a.b(bc.e(vc.y(new bc("click_on_favorites"), this.b), "position", Integer.valueOf(this.c), false, 4, null), this.d), Action.NAME_ATTRIBUTE, this.a.i(), false, 4, null), this.a.b()).a();
        }
    }

    /* compiled from: FavoritesAnalytics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pp3$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[mp3.values().length];
            try {
                iArr[mp3.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mp3.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mp3.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private pp3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bc b(bc bcVar, mp3 mp3Var) {
        String str;
        int i = b.$EnumSwitchMapping$0[mp3Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str = "popular";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                str = "order history";
            }
        } else {
            str = "unknown";
        }
        return bc.e(bcVar, "product_source", str, false, 4, null);
    }
}
