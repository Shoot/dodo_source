package ru.dodopizza.app.domain.blockstore;

import androidx.annotation.Keep;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LocalityBlockStoreDataSource.kt */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013B\u0011\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0003H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\bJ\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lru/dodopizza/app/domain/blockstore/LocalityBlockStoreDataSource;", "", "Ldt5;", "Lru/dodopizza/app/domain/blockstore/LocalityBlockStoreDataSource$b;", "toDto", "Lila;", "toDomain", "locality", "", "saveSelectedLocality", "deleteSelectedLocality", "findSelectedLocality", "Lld0;", "blockStoreDataSource", "Lld0;", "<init>", "(Lld0;)V", "Companion", "a", "b", "base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LocalityBlockStoreDataSource {
    public static final a Companion = new a(null);
    public static final String SELECTED_LOCALITY_KEY = "SELECTED_LOCALITY";
    private final ld0 blockStoreDataSource;

    /* compiled from: LocalityBlockStoreDataSource.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/domain/blockstore/LocalityBlockStoreDataSource$a;", "", "", "SELECTED_LOCALITY_KEY", "Ljava/lang/String;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocalityBlockStoreDataSource.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u000f\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006 "}, d2 = {"Lru/dodopizza/app/domain/blockstore/LocalityBlockStoreDataSource$b;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", c.a, MessageAttributes.UUID, "getName", Action.NAME_ATTRIBUTE, DateTokenConverter.CONVERTER_KEY, LocalityEntity.FIELD_COUNTRY_CODE, e.a, "I", "()I", BonusActionEntity.ORDER, "f", "Z", "()Z", "isTop", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b implements Serializable {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final int e;
        private final boolean f;

        public b(String str, String str2, String str3, String str4, int i, boolean z) {
            z65.h(str, "id");
            z65.h(str2, MessageAttributes.UUID);
            z65.h(str3, Action.NAME_ATTRIBUTE);
            z65.h(str4, LocalityEntity.FIELD_COUNTRY_CODE);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = i;
            this.f = z;
        }

        public final String a() {
            return this.d;
        }

        public final int b() {
            return this.e;
        }

        public final String c() {
            return this.b;
        }

        public final boolean d() {
            return this.f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.a, bVar.a) && z65.c(this.b, bVar.b) && z65.c(this.c, bVar.c) && z65.c(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f) {
                return true;
            }
            return false;
        }

        public final String getId() {
            return this.a;
        }

        public final String getName() {
            return this.c;
        }

        public int hashCode() {
            return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e) * 31) + a91.a(this.f);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            String str4 = this.d;
            int i = this.e;
            boolean z = this.f;
            return "LocalityDto(id=" + str + ", uuid=" + str2 + ", name=" + str3 + ", countryCode=" + str4 + ", order=" + i + ", isTop=" + z + ")";
        }
    }

    public LocalityBlockStoreDataSource(ld0 ld0Var) {
        z65.h(ld0Var, "blockStoreDataSource");
        this.blockStoreDataSource = ld0Var;
    }

    private final ila toDomain(b bVar) {
        return new ila(bVar.getId(), bVar.c(), bVar.getName(), bVar.a(), bVar.b(), bVar.d());
    }

    private final b toDto(dt5 dt5Var) {
        return new b(dt5Var.getId(), dt5Var.d(), dt5Var.getName(), dt5Var.a(), dt5Var.c(), dt5Var.e());
    }

    public final void deleteSelectedLocality() {
        this.blockStoreDataSource.g(SELECTED_LOCALITY_KEY);
    }

    public final dt5 findSelectedLocality() {
        b bVar = (b) this.blockStoreDataSource.i(SELECTED_LOCALITY_KEY);
        if (bVar != null) {
            return toDomain(bVar);
        }
        return null;
    }

    public final void saveSelectedLocality(dt5 dt5Var) {
        z65.h(dt5Var, "locality");
        this.blockStoreDataSource.m(SELECTED_LOCALITY_KEY, toDto(dt5Var));
    }
}
