package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gu;
import defpackage.ijb;
import defpackage.nt;
import im.threads.business.transport.MessageAttributes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
/* compiled from: AssistantAnalytics.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b2\u00103J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nJ$\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000fJ\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015J\u0014\u0010\u001b\u001a\u00020\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cJ\u0016\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\rJ\u001e\u0010\"\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010!\u001a\u00020 J(\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00010%0#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0#H\u0002J\u0018\u0010(\u001a\u00020&2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002R\u0018\u0010+\u001a\u00020&*\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f*\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001e\u00101\u001a\b\u0012\u0004\u0012\u00020/0\u000f*\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010-¨\u00064"}, d2 = {"Lps;", "", "Lrv;", "sender", "Ldc;", Image.TYPE_HIGH, "w", "Lss;", "environment", "l", "Lnt$a;", "ingredient", "n", "Lnt;", "result", "", "removedIngredients", "f", "u", "r", "p", "Lju;", "selectedMood", Image.TYPE_SMALL, "", "Lav;", "selectedPreferences", "v", "Lgu;", "settings", "q", Image.TYPE_MEDIUM, "", "isRegeneration", "t", "", "ingredients", "", "", "g", "o", "i", "(Lgu;)Ljava/lang/String;", "moodId", "j", "(Lgu;)Ljava/util/Set;", "preferences", "Lzw;", "k", "wishes", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ps  reason: default package */
/* loaded from: classes2.dex */
public final class ps {
    public static final ps a = new ps();

    /* compiled from: AssistantAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ps$a */
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ ss a;
        final /* synthetic */ nt b;
        final /* synthetic */ Set<nt.a> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ss ssVar, nt ntVar, Set<nt.a> set) {
            super(1);
            this.a = ssVar;
            this.b = ntVar;
            this.c = set;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            List o0;
            z65.h(bcVar, "$this$eventProducer");
            od odVar = new od(this.a.b(), this.b.t(), Double.valueOf(this.b.e().a()), this.b.e().c(), vc.d(kl8.b), uc.a.c(2), 1);
            pd.a(bcVar, odVar);
            bc.e(bcVar, "has_personal_price", Boolean.FALSE, false, 4, null);
            bc.e(bcVar, "rawPrice", Double.valueOf(this.b.e().a()), false, 4, null);
            vc.z(bcVar, ck1.b);
            nv3.c(bcVar, odVar);
            o0 = sc1.o0(this.b.a(), this.c);
            return bc.e(bcVar, "added", ps.a.g(o0), false, 4, null);
        }
    }

    /* compiled from: AssistantAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ps$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ rv a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(rv rvVar) {
            super(1);
            this.a = rvVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return vc.z(bcVar, this.a);
        }
    }

    /* compiled from: AssistantAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ps$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ ss a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ss ssVar) {
            super(1);
            this.a = ssVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.i(bcVar, kl8.b);
            bc.e(bcVar, Action.NAME_ATTRIBUTE, this.a.b(), false, 4, null);
            bc.e(bcVar, ShoppingInfoEntity.FIELD_PRODUCT_ID, vc.b(this.a.a()), false, 4, null);
            bc.e(bcVar, "position", -1, false, 4, null);
            vc.z(bcVar, this.a.d());
            bc.e(bcVar, "price", Double.valueOf(this.a.c().a()), false, 4, null);
            return bc.e(bcVar, "is_hero", Boolean.valueOf(this.a.i()), false, 4, null);
        }
    }

    /* compiled from: AssistantAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ps$d */
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ gu a;
        final /* synthetic */ nt b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(gu guVar, nt ntVar) {
            super(1);
            this.a = guVar;
            this.b = ntVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            int w;
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, "selected_mood", ps.a.i(this.a), false, 4, null);
            List<nt.a> a = this.b.a();
            w = lc1.w(a, 10);
            ArrayList arrayList = new ArrayList(w);
            for (nt.a aVar : a) {
                arrayList.add(aVar.getId());
            }
            return bc.e(bcVar, "ingredients_list", arrayList, false, 4, null);
        }
    }

    /* compiled from: AssistantAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ps$e */
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ nt.a a;
        final /* synthetic */ ss b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(nt.a aVar, ss ssVar) {
            super(1);
            this.a = aVar;
            this.b = ssVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, Action.NAME_ATTRIBUTE, this.a.getName(), false, 4, null);
            bc.e(bcVar, "price", 0, false, 4, null);
            bc.e(bcVar, ShoppingInfoEntity.FIELD_PRODUCT_ID, vc.b(this.b.a()), false, 4, null);
            bc.e(bcVar, "toppingId", this.a.getId(), false, 4, null);
            bc.e(bcVar, MessageAttributes.TYPE, ijb.b.b.a(), false, 4, null);
            return vc.z(bcVar, ck1.b);
        }
    }

    /* compiled from: AssistantAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ps$f */
    /* loaded from: classes2.dex */
    static final class f extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ gu a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(gu guVar) {
            super(1);
            this.a = guVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            int w;
            z65.h(bcVar, "$this$eventProducer");
            Set<zw> k = ps.a.k(this.a);
            w = lc1.w(k, 10);
            ArrayList arrayList = new ArrayList(w);
            for (zw zwVar : k) {
                arrayList.add(zwVar.getId());
            }
            return bc.e(bcVar, "selected_wishes_list", arrayList, false, 4, null);
        }
    }

    /* compiled from: AssistantAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ps$g */
    /* loaded from: classes2.dex */
    static final class g extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ ju a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ju juVar) {
            super(1);
            this.a = juVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return bc.e(bcVar, "selected_mood", this.a.getId(), false, 4, null);
        }
    }

    /* compiled from: AssistantAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ps$h */
    /* loaded from: classes2.dex */
    static final class h extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ boolean a;
        final /* synthetic */ gu b;
        final /* synthetic */ nt c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z, gu guVar, nt ntVar) {
            super(1);
            this.a = z;
            this.b = guVar;
            this.c = ntVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            int w;
            int w2;
            int w3;
            z65.h(bcVar, "$this$eventProducer");
            ps psVar = ps.a;
            bc.e(bcVar, "type_result", psVar.o(this.a, this.b), false, 4, null);
            bc.e(bcVar, "selected_mood", psVar.i(this.b), false, 4, null);
            Set<av> j = psVar.j(this.b);
            w = lc1.w(j, 10);
            ArrayList arrayList = new ArrayList(w);
            for (av avVar : j) {
                arrayList.add(avVar.getId());
            }
            bc.e(bcVar, "selected_preferences_list", arrayList, false, 4, null);
            Set<zw> k = ps.a.k(this.b);
            w2 = lc1.w(k, 10);
            ArrayList arrayList2 = new ArrayList(w2);
            for (zw zwVar : k) {
                arrayList2.add(zwVar.getId());
            }
            bc.e(bcVar, "selected_wishes_list", arrayList2, false, 4, null);
            bc.e(bcVar, "result_name", this.c.getName(), false, 4, null);
            bc.e(bcVar, "result_description", this.c.b(), false, 4, null);
            List<nt.a> a = this.c.a();
            w3 = lc1.w(a, 10);
            ArrayList arrayList3 = new ArrayList(w3);
            for (nt.a aVar : a) {
                arrayList3.add(aVar.getId());
            }
            bc.e(bcVar, "ingredients_list", arrayList3, false, 4, null);
            return bc.e(bcVar, "result_image_url", this.c.c(), false, 4, null);
        }
    }

    /* compiled from: AssistantAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ps$i */
    /* loaded from: classes2.dex */
    static final class i extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ Collection<av> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Collection<av> collection) {
            super(1);
            this.a = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            int w;
            z65.h(bcVar, "$this$eventProducer");
            Collection<av> collection = this.a;
            w = lc1.w(collection, 10);
            ArrayList arrayList = new ArrayList(w);
            for (av avVar : collection) {
                arrayList.add(avVar.getId());
            }
            return bc.e(bcVar, "selected_preferences_list", arrayList, false, 4, null);
        }
    }

    /* compiled from: AssistantAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ps$j */
    /* loaded from: classes2.dex */
    static final class j extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ rv a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(rv rvVar) {
            super(1);
            this.a = rvVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.z(bcVar, this.a);
            return bc.e(bcVar, "type_sharing", "button", false, 4, null);
        }
    }

    private ps() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Map<String, Object>> g(List<nt.a> list) {
        int w;
        Map k;
        List<nt.a> list2 = list;
        w = lc1.w(list2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (nt.a aVar : list2) {
            k = g86.k(lnb.a("quantity", 1), lnb.a(Action.NAME_ATTRIBUTE, aVar.getName()), lnb.a("price", 0), lnb.a("toppingId", aVar.getId()), lnb.a(MessageAttributes.TYPE, ijb.a.b.a()));
            arrayList.add(k);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String i(gu guVar) {
        gu.b bVar;
        ju a2;
        String str = null;
        if (guVar instanceof gu.b) {
            bVar = (gu.b) guVar;
        } else {
            bVar = null;
        }
        if (bVar != null && (a2 = bVar.a()) != null) {
            str = a2.getId();
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<av> j(gu guVar) {
        gu.b bVar;
        Set<av> e2;
        Set<av> set = null;
        if (guVar instanceof gu.b) {
            bVar = (gu.b) guVar;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            set = bVar.b();
        }
        if (set == null) {
            e2 = sfa.e();
            return e2;
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<zw> k(gu guVar) {
        gu.b bVar;
        Set<zw> e2;
        Set<zw> set = null;
        if (guVar instanceof gu.b) {
            bVar = (gu.b) guVar;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            set = bVar.c();
        }
        if (set == null) {
            e2 = sfa.e();
            return e2;
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String o(boolean z, gu guVar) {
        if (z) {
            return "regenerate";
        }
        if (guVar instanceof gu.a) {
            return "random";
        }
        if (guVar instanceof gu.b) {
            return "by_user_choice";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final dc f(ss ssVar, nt ntVar, Set<nt.a> set) {
        z65.h(ssVar, "environment");
        z65.h(ntVar, "result");
        z65.h(set, "removedIngredients");
        return ec.a("add_to_cart", new a(ssVar, ntVar, set));
    }

    public final dc h(rv rvVar) {
        z65.h(rvVar, "sender");
        return ec.a("close_ai", new b(rvVar));
    }

    public final dc l(ss ssVar) {
        z65.h(ssVar, "environment");
        return ec.a("open_product_card", new c(ssVar));
    }

    public final dc m(gu guVar, nt ntVar) {
        z65.h(guVar, "settings");
        z65.h(ntVar, "result");
        return ec.a("regenerate_result_ai_click", new d(guVar, ntVar));
    }

    public final dc n(ss ssVar, nt.a aVar) {
        z65.h(ssVar, "environment");
        z65.h(aVar, "ingredient");
        return ec.a("change_ingredient", new e(aVar, ssVar));
    }

    public final dc p() {
        return ec.b("screen_error_ai", null, 2, null);
    }

    public final dc q(gu guVar) {
        z65.h(guVar, "settings");
        return ec.a("screen_loading_ai", new f(guVar));
    }

    public final dc r() {
        return ec.b("screen_mood_ai", null, 2, null);
    }

    public final dc s(ju juVar) {
        z65.h(juVar, "selectedMood");
        return ec.a("screen_preferences_ai", new g(juVar));
    }

    public final dc t(gu guVar, nt ntVar, boolean z) {
        z65.h(guVar, "settings");
        z65.h(ntVar, "result");
        return ec.a("screen_result_ai", new h(z, guVar, ntVar));
    }

    public final dc u() {
        return ec.b("screen_welcome_ai", null, 2, null);
    }

    public final dc v(Collection<av> collection) {
        z65.h(collection, "selectedPreferences");
        return ec.a("screen_wishes_ai", new i(collection));
    }

    public final dc w(rv rvVar) {
        z65.h(rvVar, "sender");
        return ec.a("share_result_ai", new j(rvVar));
    }
}
