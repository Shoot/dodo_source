package ru.dodopizza.app.presentation.selectlocation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import kotlin.Metadata;
/* compiled from: SelectLocationInteractor.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0003\u0006\u0007\bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/a;", "", "", "a", "()Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "Lru/dodopizza/app/presentation/selectlocation/a$a;", "Lru/dodopizza/app/presentation/selectlocation/a$b;", "Lru/dodopizza/app/presentation/selectlocation/a$c;", "Lru/dodopizza/app/presentation/selectlocation/a$d;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: SelectLocationInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/a$a;", "Lru/dodopizza/app/presentation/selectlocation/a;", "", "b", "Ljava/lang/Void;", "()Ljava/lang/Void;", LocalityEntity.FIELD_COUNTRY_CODE, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.selectlocation.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0601a implements a {
        public static final C0601a a = new C0601a();
        private static final Void b = null;

        private C0601a() {
        }

        @Override // ru.dodopizza.app.presentation.selectlocation.a
        public /* bridge */ /* synthetic */ String a() {
            return (String) b();
        }

        public Void b() {
            return b;
        }
    }

    /* compiled from: SelectLocationInteractor.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/a$b;", "Lru/dodopizza/app/presentation/selectlocation/a;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "<init>", "(Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b implements a {
        private final String a;

        public b(String str) {
            z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
            this.a = str;
        }

        @Override // ru.dodopizza.app.presentation.selectlocation.a
        public String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && z65.c(this.a, ((b) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            String str = this.a;
            return "CurrentCountry(countryCode=" + str + ")";
        }
    }

    /* compiled from: SelectLocationInteractor.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\f¨\u0006\u0012"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/a$c;", "Lru/dodopizza/app/presentation/selectlocation/a;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "b", "countryIsoName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class c implements a {
        private final String a;
        private final String b;

        public c(String str, String str2) {
            z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
            z65.h(str2, "countryIsoName");
            this.a = str;
            this.b = str2;
        }

        @Override // ru.dodopizza.app.presentation.selectlocation.a
        public String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (z65.c(this.a, cVar.a) && z65.c(this.b, cVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            return "NewCountry(countryCode=" + str + ", countryIsoName=" + str2 + ")";
        }
    }

    /* compiled from: SelectLocationInteractor.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/a$d;", "Lru/dodopizza/app/presentation/selectlocation/a;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "<init>", "(Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class d implements a {
        private final String a;

        public d(String str) {
            z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
            this.a = str;
        }

        @Override // ru.dodopizza.app.presentation.selectlocation.a
        public String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && z65.c(this.a, ((d) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            String str = this.a;
            return "PreviouslySelectedCountry(countryCode=" + str + ")";
        }
    }

    String a();
}
