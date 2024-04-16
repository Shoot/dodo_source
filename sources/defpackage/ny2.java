package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: DeliveryLocationFragmentData.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000 &2\u00020\u0001:\u0001\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u0011\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\fR\u0014\u0010#\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\fR\u0014\u0010%\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\f¨\u0006'"}, d2 = {"Lny2;", "", "", e.a, "()I", "resultId", "", "a", "()Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "", "k", "()Z", "forceChangeLocality", c.a, "currentLocalityId", "f", "isEmptyCart", "n", "currentAddress", "Ltl5;", Image.TYPE_MEDIUM, "()Ltl5;", "currentLanguage", "Lqw1;", DateTokenConverter.CONVERTER_KEY, "()Lqw1;", "pinCoordinates", "Lck1;", "b", "()Lck1;", KustoStorage.KustoTable.COLUMN_SOURCE, "j", "exitOnSelected", "i", "sendFragmentResult", "l", "isToolbarVisible", "K", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ny2 */
/* loaded from: classes2.dex */
public interface ny2 {
    public static final a K = a.a;

    /* compiled from: DeliveryLocationFragmentData.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJr\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0006J^\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0004j\u0002`\u00142\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0006¨\u0006\u001b"}, d2 = {"Lny2$a;", "", "", "resultId", "", LocalityEntity.FIELD_COUNTRY_CODE, "", "forceChangeLocality", "currentLocalityId", "isEmptyCart", "currentAddress", "Ltl5;", "currentLanguage", "Lck1;", KustoStorage.KustoTable.COLUMN_SOURCE, "exitOnSelected", "sendFragmentResult", "isToolbarVisible", "Lg2b;", "a", "Lru/dodopizza/app/domain/country/models/CountryCode;", "Lqw1;", "pinCoordinates", "Lh2b;", c.a, "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ny2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public static /* synthetic */ g2b b(a aVar, int i, String str, boolean z, String str2, boolean z2, String str3, tl5 tl5Var, ck1 ck1Var, boolean z3, boolean z4, boolean z5, int i2, Object obj) {
            return aVar.a(i, str, z, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? true : z2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : tl5Var, ck1Var, (i2 & 256) != 0 ? true : z3, (i2 & 512) != 0 ? false : z4, (i2 & 1024) != 0 ? true : z5);
        }

        public static /* synthetic */ h2b d(a aVar, int i, String str, String str2, String str3, qw1 qw1Var, ck1 ck1Var, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            boolean z4;
            boolean z5;
            boolean z6;
            if ((i2 & 64) != 0) {
                z4 = true;
            } else {
                z4 = z;
            }
            if ((i2 & 128) != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            if ((i2 & 256) != 0) {
                z6 = true;
            } else {
                z6 = z3;
            }
            return aVar.c(i, str, str2, str3, qw1Var, ck1Var, z4, z5, z6);
        }

        public final g2b a(int i, String str, boolean z, String str2, boolean z2, String str3, tl5 tl5Var, ck1 ck1Var, boolean z3, boolean z4, boolean z5) {
            z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
            z65.h(ck1Var, KustoStorage.KustoTable.COLUMN_SOURCE);
            return new g2b(i, str, z, str2, z2, str3, tl5Var, ck1Var, z3, z4, z5, null, 2048, null);
        }

        public final h2b c(int i, String str, String str2, String str3, qw1 qw1Var, ck1 ck1Var, boolean z, boolean z2, boolean z3) {
            z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
            z65.h(ck1Var, KustoStorage.KustoTable.COLUMN_SOURCE);
            return new h2b(i, str, str2, str3, qw1Var, ck1Var, z, z2, z3);
        }
    }

    String a();

    ck1 b();

    String c();

    qw1 d();

    int e();

    boolean f();

    boolean i();

    boolean j();

    boolean k();

    boolean l();

    tl5 m();

    String n();
}
