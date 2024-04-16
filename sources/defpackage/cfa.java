package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: SessionStorageManager.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b5\u00106R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bRJ\u0010\u0015\u001a*\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\nj\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f`\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0003\u0010 \"\u0004\b!\u0010\"R\"\u0010)\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010%\u001a\u0004\b\u000f\u0010&\"\u0004\b'\u0010(R\"\u00100\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-\"\u0004\b.\u0010/RJ\u00104\u001a*\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u000202010\nj\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020201`\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b3\u0010\u0014¨\u00067"}, d2 = {"Lcfa;", "", "Lx3a;", "a", "Lx3a;", c.a, "()Lx3a;", "j", "(Lx3a;)V", "inAppCustomerSegmentations", "Ljava/util/HashMap;", "", "", "Lfx4;", "Lkotlin/collections/HashMap;", "b", "Ljava/util/HashMap;", e.a, "()Ljava/util/HashMap;", "setOperationalInApps", "(Ljava/util/HashMap;)V", "operationalInApps", "", "Z", "g", "()Z", "k", "(Z)V", "isInAppMessageShown", "Lq52;", DateTokenConverter.CONVERTER_KEY, "Lq52;", "()Lq52;", Image.TYPE_HIGH, "(Lq52;)V", "customerSegmentationFetchStatus", "Lhe4;", "Lhe4;", "()Lhe4;", "i", "(Lhe4;)V", "geoFetchStatus", "Lfm8;", "f", "Lfm8;", "()Lfm8;", "l", "(Lfm8;)V", "productSegmentationFetchStatus", "", "Ljm8;", "setInAppProductSegmentations", "inAppProductSegmentations", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: cfa  reason: default package */
/* loaded from: classes.dex */
public final class cfa {
    private x3a a;
    private boolean c;
    private HashMap<String, List<fx4>> b = new HashMap<>();
    private q52 d = q52.SEGMENTATION_NOT_FETCHED;
    private he4 e = he4.GEO_NOT_FETCHED;
    private fm8 f = fm8.SEGMENTATION_NOT_FETCHED;
    private HashMap<String, Set<jm8>> g = new HashMap<>();

    public final q52 a() {
        return this.d;
    }

    public final he4 b() {
        return this.e;
    }

    public final x3a c() {
        return this.a;
    }

    public final HashMap<String, Set<jm8>> d() {
        return this.g;
    }

    public final HashMap<String, List<fx4>> e() {
        return this.b;
    }

    public final fm8 f() {
        return this.f;
    }

    public final boolean g() {
        return this.c;
    }

    public final void h(q52 q52Var) {
        z65.h(q52Var, "<set-?>");
        this.d = q52Var;
    }

    public final void i(he4 he4Var) {
        z65.h(he4Var, "<set-?>");
        this.e = he4Var;
    }

    public final void j(x3a x3aVar) {
        this.a = x3aVar;
    }

    public final void k(boolean z) {
        this.c = z;
    }

    public final void l(fm8 fm8Var) {
        z65.h(fm8Var, "<set-?>");
        this.f = fm8Var;
    }
}
