package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AddressItemVO.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ln8;", "", "<init>", "()V", "a", "b", "Ln8$a;", "Ln8$b;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: n8  reason: default package */
/* loaded from: classes4.dex */
public abstract class n8 {

    /* compiled from: AddressItemVO.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u0000 \t2\u00020\u00012\u00020\u0002:\u0001\u000bBO\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\b\b\u0002\u0010!\u001a\u00020\u001a\u0012\b\b\u0002\u0010%\u001a\u00020\u001a\u0012\b\b\u0002\u0010'\u001a\u00020\u001a\u0012\b\b\u0002\u0010)\u001a\u00020\u001a¢\u0006\u0004\b*\u0010+J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003J\u0006\u0010\t\u001a\u00020\u0005R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\"\u0010!\u001a\u00020\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010%\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\"\u0010'\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b&\u0010 R\"\u0010)\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u001e\"\u0004\b(\u0010 ¨\u0006,"}, d2 = {"Ln8$a;", "Ln8;", "", "Lou2;", "loadedDeliverablePlace", "", "j", "deliverablePlaceWithoutLocality", "k", "i", "", "a", "I", DateTokenConverter.CONVERTER_KEY, "()I", "index", "b", "Lou2;", "()Lou2;", "deliverablePlace", "", c.a, "Ljava/lang/String;", "()Ljava/lang/String;", "formattedAddress", "formattedComment", "", e.a, "Z", Image.TYPE_HIGH, "()Z", "setSelected", "(Z)V", "isSelected", "f", "g", "setLoading", "isLoading", "setEnabled", "isEnabled", "setWithLocality", "withLocality", "<init>", "(ILou2;Ljava/lang/String;Ljava/lang/String;ZZZZ)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n8$a */
    /* loaded from: classes4.dex */
    public static final class a extends n8 {
        public static final C0454a i = new C0454a(null);
        private final int a;
        private final ou2 b;
        private final String c;
        private final String d;
        private boolean e;
        private boolean f;
        private boolean g;
        private boolean h;

        /* compiled from: AddressItemVO.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ln8$a$a;", "", "", "IS_SELECTED_FLAG_CHANGED", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* renamed from: n8$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0454a {
            private C0454a() {
            }

            public /* synthetic */ C0454a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ a(int i2, ou2 ou2Var, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i2, ou2Var, str, str2, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? true : z3, (i3 & 128) != 0 ? true : z4);
        }

        public final ou2 a() {
            return this.b;
        }

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.d;
        }

        public final int d() {
            return this.a;
        }

        public final boolean e() {
            return this.h;
        }

        public final boolean f() {
            return this.g;
        }

        public final boolean g() {
            return this.f;
        }

        public boolean h() {
            return this.e;
        }

        public final void i() {
            this.f = false;
            this.g = this.h;
        }

        public final void j(ou2 ou2Var) {
            boolean z;
            z65.h(ou2Var, "loadedDeliverablePlace");
            if (z65.c(this.b, ou2Var) && !h()) {
                z = true;
            } else {
                z = false;
            }
            this.f = z;
            this.g = false;
        }

        public final void k(ou2 ou2Var) {
            boolean z;
            z65.h(ou2Var, "deliverablePlaceWithoutLocality");
            if (!z65.c(this.b, ou2Var) && this.h) {
                z = true;
            } else {
                z = false;
            }
            this.h = z;
            this.g = z;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i2, ou2 ou2Var, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
            super(null);
            z65.h(ou2Var, "deliverablePlace");
            z65.h(str, "formattedAddress");
            z65.h(str2, "formattedComment");
            this.a = i2;
            this.b = ou2Var;
            this.c = str;
            this.d = str2;
            this.e = z;
            this.f = z2;
            this.g = z3;
            this.h = z4;
        }
    }

    /* compiled from: AddressItemVO.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln8$b;", "Ln8;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n8$b */
    /* loaded from: classes4.dex */
    public static final class b extends n8 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    private n8() {
    }

    public /* synthetic */ n8(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
