package ru.dodopizza.app.presentation.selectlocation.landing;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.presentation.selectlocation.landing.b;
/* compiled from: LandingMapper.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/landing/a;", "Luj5;", "Lhj5;", "landing", "Lru/dodopizza/app/presentation/selectlocation/landing/b;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class a implements uj5 {
    public static final C0609a a = new C0609a(null);

    /* compiled from: LandingMapper.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/landing/a$a;", "", "", "FACEBOOK", "Ljava/lang/String;", "INSTAGRAM", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.selectlocation.landing.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0609a {
        private C0609a() {
        }

        public /* synthetic */ C0609a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.uj5
    public b a(hj5 hj5Var) {
        String str;
        String str2;
        if (hj5Var != null) {
            String h = hj5Var.h();
            String f = hj5Var.f();
            String d = hj5Var.d();
            String c = hj5Var.c();
            String g = hj5Var.g();
            String a2 = hj5Var.a();
            String b = hj5Var.b();
            tj5 e = hj5Var.e("facebook");
            if (e != null) {
                str = e.b();
            } else {
                str = null;
            }
            tj5 e2 = hj5Var.e("instagram");
            if (e2 != null) {
                str2 = e2.b();
            } else {
                str2 = null;
            }
            return new b.C0610b(h, f, d, c, g, a2, b, str, str2);
        }
        return b.a.a;
    }
}
