package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: FoodMenuInteractor.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0002H&J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\"\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u00110\u0002j\u0002`\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H&J\"\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\t0\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH&J\u0010\u0010\u0017\u001a\u00020\u0003H¦@¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u001d\u001a\f\u0012\u0004\u0012\u00020\u00110\u0002j\u0002`\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH&J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u001eH&J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0002H&J \u0010$\u001a\f\u0012\u0004\u0012\u00020\u00110\u0002j\u0002`\u00122\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\tH&J\u0014\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\t0\u0002H&J\u0012\u0010'\u001a\f\u0012\u0004\u0012\u00020\u00110\u0002j\u0002`\u0012H&J\u0010\u0010)\u001a\u00020(H¦@¢\u0006\u0004\b)\u0010\u0018J\u0010\u0010*\u001a\u00020\u0003H¦@¢\u0006\u0004\b*\u0010\u0018J\b\u0010+\u001a\u00020\u0003H&J\u0012\u0010-\u001a\u0004\u0018\u00010\u00152\u0006\u0010,\u001a\u00020\u0015H&J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0002H&¨\u0006/"}, d2 = {"Ld44;", "", "Lwx;", "", "g", "f", "", "Lce0;", "r", "", "Ldh6;", "selectedSubcategories", "Lnh6;", e.a, "Lye6;", "menuItemVO", "isHero", "", "Lcom/dodopizza/async/AsyncJob;", Image.TYPE_HIGH, "menuItemVOs", "", "l", "j", "(Lcv1;)Ljava/lang/Object;", "Lnp3;", "favoriteProductVO", "", "position", "o", "Loz3;", "q", "Lgj6;", c.a, "Ldd6;", "menuCategories", DateTokenConverter.CONVERTER_KEY, "Lbp4;", "a", "i", "Lnq8;", "p", "k", "b", "menuItemIdV5", "n", Image.TYPE_MEDIUM, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: d44  reason: default package */
/* loaded from: classes4.dex */
public interface d44 {
    wx<List<bp4>> a();

    boolean b();

    wx<gj6> c();

    wx<Unit> d(List<dd6> list);

    wx<nh6> e(List<dh6> list);

    wx<Boolean> f();

    wx<Boolean> g();

    wx<Unit> h(ye6 ye6Var, boolean z);

    wx<Unit> i();

    Object j(cv1<? super Boolean> cv1Var);

    Object k(cv1<? super Boolean> cv1Var);

    wx<List<String>> l(List<? extends ye6> list);

    wx<Integer> m();

    String n(String str);

    wx<Unit> o(np3 np3Var, int i);

    Object p(cv1<? super nq8> cv1Var);

    oz3<String> q();

    wx<Collection<ce0>> r();
}
