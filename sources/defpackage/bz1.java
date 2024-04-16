package defpackage;

import com.dodopizza.persistence.entity.CountryEntity;
import defpackage.bq3;
import defpackage.c66;
import defpackage.tmb;
import io.realm.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: countrytransforms.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u001a\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/Function1;", "Lay1;", "Lcom/dodopizza/persistence/entity/CountryEntity;", "b", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: bz1  reason: default package */
/* loaded from: classes4.dex */
public final class bz1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: countrytransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/persistence/entity/CountryEntity;", "countryEntity", "Lay1;", "a", "(Lcom/dodopizza/persistence/entity/CountryEntity;)Lay1;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bz1$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function1<CountryEntity, ay1> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ay1 invoke(CountryEntity countryEntity) {
            List F0;
            z65.h(countryEntity, "countryEntity");
            String name = countryEntity.getName();
            String code = countryEntity.getCode();
            String isoName = countryEntity.getIsoName();
            f32 f32Var = new f32(countryEntity.getCurrencyCode(), countryEntity.getCustomSymbol());
            i28 i28Var = new i28(countryEntity.getPhoneMask(), countryEntity.getPhoneCode());
            nq3 nq3Var = new nq3(countryEntity.getFeedbackPhone(), countryEntity.getFeedbackEmail());
            F0 = sc1.F0(countryEntity.getLanguages());
            k0<String> features = countryEntity.getFeatures();
            bq3.a aVar = bq3.c;
            ArrayList arrayList = new ArrayList();
            for (String str : features) {
                bq3 a2 = aVar.a(str);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            return new ay1(name, code, isoName, f32Var, i28Var, nq3Var, F0, arrayList, yy1.b.a(countryEntity.getState()), new k4c(countryEntity.getControllingWebsite(), countryEntity.getGeneralWebsite(), countryEntity.getRecruitingWebsite(), countryEntity.getNoGloves()), countryEntity.getBaseUrl(), countryEntity.getOrder(), new c66(new c66.b(countryEntity.getMapBoundsUpperLeftCornerLat(), countryEntity.getMapBoundsUpperLeftCornerLon()), new c66.b(countryEntity.getMapBoundsLowerRightCornerLat(), countryEntity.getMapBoundsLowerRightCornerLon())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: countrytransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lay1;", tmb.c.COUNTRY_JSON_NAME, "Lcom/dodopizza/persistence/entity/CountryEntity;", "a", "(Lay1;)Lcom/dodopizza/persistence/entity/CountryEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bz1$b */
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function1<ay1, CountryEntity> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CountryEntity invoke(ay1 ay1Var) {
            z65.h(ay1Var, tmb.c.COUNTRY_JSON_NAME);
            String code = ay1Var.getCode();
            String name = ay1Var.getName();
            String code2 = ay1Var.getCode();
            String f = ay1Var.f();
            String code3 = ay1Var.b().getCode();
            String a2 = ay1Var.b().a();
            String code4 = ay1Var.l().getCode();
            String a3 = ay1Var.l().a();
            String b = ay1Var.e().b();
            String a4 = ay1Var.e().a();
            String[] strArr = (String[]) ay1Var.i().toArray(new String[0]);
            k0 k0Var = new k0(Arrays.copyOf(strArr, strArr.length));
            k0 k0Var2 = new k0();
            for (bq3 bq3Var : ay1Var.d()) {
                k0Var2.add(bq3Var.getValue());
            }
            return new CountryEntity(code, name, code2, f, code3, a2, code4, a3, b, a4, k0Var, k0Var2, ay1Var.m().i(), ay1Var.n().a(), ay1Var.n().b(), ay1Var.n().d(), ay1Var.n().c(), ay1Var.a(), ay1Var.k(), ay1Var.j().d().b(), ay1Var.j().d().c(), ay1Var.j().c().b(), ay1Var.j().c().c());
        }
    }

    public static final Function1<CountryEntity, ay1> a() {
        return a.a;
    }

    public static final Function1<ay1, CountryEntity> b() {
        return b.a;
    }
}
